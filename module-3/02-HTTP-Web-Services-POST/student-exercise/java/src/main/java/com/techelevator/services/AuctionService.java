package com.techelevator.services;

import com.techelevator.models.Auction;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

public class AuctionService {

    private final String BASE_URL;
    public RestTemplate restTemplate = new RestTemplate();
    private final ConsoleService console = new ConsoleService();

    public AuctionService(String url) {
        BASE_URL = url;
    }


    public Auction[] getAll() {
        Auction[] auctions = null;
        try {
            auctions = restTemplate.getForObject(BASE_URL, Auction[].class);
        } catch (RestClientResponseException ex) {
            console.printError("Could not retrieve the auctions. Is the server running?");
        } catch (ResourceAccessException ex) {
            console.printError("A network error occurred.");
        }
        return auctions;
    }

    public Auction getOne(int id) {
        Auction auction = null;
        try {
            auction = restTemplate.getForObject(BASE_URL + "/" + id, Auction.class);
        } catch (RestClientResponseException ex) {
            console.printError("Could not retrieve the auction.");
        } catch (ResourceAccessException ex) {
            console.printError("A network error occurred.");
        }
        return auction;
    }

    public Auction[] getByTitle(String title) {
        Auction[] auctions = null;
        try {
            auctions = restTemplate.getForObject(BASE_URL + "?title_like=" + title, Auction[].class);
        } catch (RestClientResponseException ex) {
            console.printError("The title was not found. Please try again.");
        } catch (ResourceAccessException ex) {
            console.printError("A network error occurred.");
        }
        return auctions;
    }

    public Auction[] getByPrice(double price) {
        Auction[] auctions = null;
        try {
            auctions = restTemplate.getForObject(BASE_URL + "?currentBid_lte=" + price, Auction[].class);
        } catch (RestClientResponseException ex) {
            console.printError("No auctions found. Please try again.");
        } catch (ResourceAccessException ex) {
            console.printError("A network error occurred.");
        }
        return auctions;
    }

    public Auction add(String auctionString) {
    	// Turns comma delimited file into an auction object.
        Auction auction = makeAuction(auctionString);
        
        // Create HTTP headers and set content type to JSON.
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        // Declare HTTPEntity Variable.
        // Instantiate an HttpEntity object and pass the reservation and hearder to it.
        HttpEntity<Auction> entity = new HttpEntity<>(auction, headers);
        
        // Call the web service.
        Auction auctionItem = null;
        try {
        	auctionItem = restTemplate.postForObject(BASE_URL, entity, Auction.class);
        } catch (RestClientResponseException e) {
        	console.printError("Error adding item to auction. Please try again.");
        	return auctionItem;
        } catch (ResourceAccessException e) {
        	console.printError("A network error occurred.");
        	return auctionItem;
        }
        return auctionItem;
    }

    public Auction update(String auctionString) {
    	// Turns comma delimited file into an auction object.
        Auction auction = makeAuction(auctionString);
        if (auction == null) {
        	return null;
        }
        
        // Create HTTP headers and set content type to JSON.
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        // Declare HTTPEntity Variable.
        // Instantiate an HttpEntity object and pass the reservation and hearder to it.
        HttpEntity<Auction> entity = new HttpEntity<>(auction, headers);
        
        // Call the web service.
        try {
        	restTemplate.put(BASE_URL +  "/" + auction.getId(), entity);
        } catch (RestClientResponseException e) {
        	console.printError("No auctions found. Please try again.");
        	return null;
        } catch (ResourceAccessException e) {
        	console.printError("A network error occurred.");
        	return null;
        }
        return auction;
    }

    public boolean delete(int id) {
        // Call the web service.
        try {
        	restTemplate.delete(BASE_URL +  "/" + id);
        } catch (RestClientResponseException e) {
        	if (e.getRawStatusCode() == 404) {
        		System.out.println("Wrong URL.");
        		return false;
        	}
        	if (e.getRawStatusCode() == 401) {
        		System.out.println("You must login first before deleting.");
        		return false;
        	}
        	if (!((e.getRawStatusCode() >= 200) && (e.getRawStatusCode() <= 299))) {
        		System.out.println("Didn't delete for some reason.  Better figure it out!");
        		return false;
        	}
        } catch (ResourceAccessException e) {
        	console.printError("A network error occurred.");
        	return false;
        }
        return true;
    }

    private HttpEntity<Auction> makeEntity(Auction auction) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Auction> entity = new HttpEntity<>(auction, headers);
        return entity;
    }

    private Auction makeAuction(String CSV) {
        String[] parsed = CSV.split(",");
        // invalid input
        if (parsed.length < 4 || parsed.length > 5) {
            return null;
        }
        // Add method does not include an id and only has 5 strings
        if (parsed.length == 4) {
            // Create a string version of the id and place into an array to be concatenated
            String[] withId = new String[6];
            Auction[] auctions = getAll();
            if (auctions == null) {
            	return null; // Some exception or other problem occurred.
            }
            String[] idArray = new String[]{auctions.length + 1 + ""};
            // place the id into the first position of the data array
            System.arraycopy(idArray, 0, withId, 0, 1);
            System.arraycopy(parsed, 0, withId, 1, 4);
            parsed = withId;
        }
        return new Auction(Integer.parseInt(parsed[0].trim()), parsed[1].trim(), parsed[2].trim(), parsed[3].trim(), Double.parseDouble(parsed[4].trim()));
    }


}
