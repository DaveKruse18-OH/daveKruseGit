package com.techelevator.hotels;

import java.util.Scanner;

import org.springframework.web.client.RestTemplate;

public class App {
	
	
	private RestTemplate restTemplate = new RestTemplate();
	private static final String API_BASE_URL = "http://localhost:3000";

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run() {
      //  Hotel[] hotels = null;
        Scanner scanner = new Scanner(System.in);
        int menuSelection = 999;

        printGreeting();

        while(menuSelection != 0) {
            try {
                menuSelection = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Error parsing the input for menu selection.");
            }
            System.out.println("");
            if (menuSelection == 1) {
                Hotel[] hotels = restTemplate.getForObject(API_BASE_URL + "/hotels", Hotel[].class);
                printHotels(hotels);
            } else if (menuSelection == 2) {
                Review[] reviews = restTemplate.getForObject(API_BASE_URL + "/reviews", Review[].class);
                printReviews(reviews);
            } else if (menuSelection == 3) {
            	String id = "1";
                Hotel hotel = restTemplate.getForObject(API_BASE_URL + "/hotels/" + id, Hotel.class);
                printHotel(hotel);		
            } else if (menuSelection == 4) {
            	String id = "1";   // should asks the user what hotel to search for
            	Review[] reviews = restTemplate.getForObject(API_BASE_URL + "/hotels/" + id + "/reviews", Review[].class);
            	printReviews(reviews);
            } else if (menuSelection == 5) {
            	String stars = "3";   // should asks the user what stars to search for
            	Hotel[] hotels = restTemplate.getForObject(API_BASE_URL + "/hotels?stars=" + stars, Hotel[].class);
            	printHotels(hotels);
            } else if (menuSelection == 6) {
                System.out.println("Not implemented - Create a custom Web API query here");
            } else if (menuSelection == 0) {
                continue;
            } else {
                System.out.println("Invalid Selection");
            }
            menuSelection = 999;
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
            printGreeting();
        }
        scanner.close();
        System.exit(0);
    }

    private void printGreeting() {
        System.out.println("");
        System.out.println("Welcome to Tech Elevator Hotels. Please make a selection: ");
        System.out.println("1: List Hotels");
        System.out.println("2: List Reviews");
        System.out.println("3: Show Details for Hotel ID 1");
        System.out.println("4: List Reviews for Hotel ID 1");
        System.out.println("5: List Hotels with star rating 3");
        System.out.println("6: Custom Query");
        System.out.println("0: Exit");
        System.out.println("");
        System.out.print("Please choose an option: ");
    }

    private void printHotels(Hotel[] hotels) {
        System.out.println("--------------------------------------------");
        System.out.println("Hotels");
        System.out.println("--------------------------------------------");
        for (Hotel hotel : hotels) {
            System.out.println(hotel.getId() + ": " + hotel.getName());
        }
    }

    private void printHotel(Hotel hotel) {
        System.out.println(hotel.toString());
    }

    private void printReviews(Review[] reviews) {
        for (Review review : reviews) {
            System.out.println(review.toString());
        }
    }

}
