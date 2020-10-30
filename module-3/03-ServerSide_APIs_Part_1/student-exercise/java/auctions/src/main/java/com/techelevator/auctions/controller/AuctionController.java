package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDAO dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Auction> getAuctions(@RequestParam (defaultValue = "") String title_like, @RequestParam (defaultValue = "0") double currentBid_lte) {
    	if (title_like.equals("") && currentBid_lte == 0) {
    		return dao.list();
    	} else if ((!title_like.equals("")) && (currentBid_lte == 0)) {
    		return dao.searchByTitle(title_like);
    	} else if ((title_like.contentEquals("")) && (currentBid_lte != 0)) {
    		return dao.searchByPrice(currentBid_lte);
    	} else {
    		return dao.searchByTitleAndPrice(title_like, currentBid_lte);
    	}
    }
    
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction getAuction(@PathVariable int id) {
    	return dao.get(id);
    }
    
    @RequestMapping(path = "", method = RequestMethod.POST)
    public Auction addAuction(@RequestBody Auction auction) {
    	return dao.create(auction);
    }
    
    //@RequestMapping(path = "/search", method = RequestMethod.GET)
    //public List<Auction> searchAuctionTitle(@RequestParam (defaultValue = "") String title_like) {
    //	return dao.searchByTitle(title_like);
    //}
}
