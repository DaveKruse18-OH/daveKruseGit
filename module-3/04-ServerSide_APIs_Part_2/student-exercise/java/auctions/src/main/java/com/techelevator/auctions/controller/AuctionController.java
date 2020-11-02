package com.techelevator.auctions.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.exception.AuctionNotFoundException;
import com.techelevator.auctions.model.Auction;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

	@Autowired
    private AuctionDAO dao;

    public AuctionController(AuctionDAO dao) {
        this.dao = dao;
    }

    @RequestMapping( path = "", method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(defaultValue = "") String title_like, @RequestParam(defaultValue = "0") double currentBid_lte) {

        if( !title_like.equals("") ) {
            return dao.searchByTitle(title_like);
        }
        if(currentBid_lte > 0) {
            return dao.searchByPrice(currentBid_lte);
        }

        return dao.list();
    }

    //@ResponseStatus(code=HttpStatus.NOT_FOUND, reason="Auction not found")
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) throws AuctionNotFoundException {
    	Auction auction = dao.get(id);
    	if (auction == null) {
    		throw new AuctionNotFoundException();
    	} else {
    		return auction;
    	}
        //return dao.get(id);
    }

    
    @ResponseStatus(code=HttpStatus.CREATED, reason="New auction successfully created.")
    @RequestMapping( path = "", method = RequestMethod.POST)
    public Auction create(@Valid @RequestBody Auction auction) {
        return dao.create(auction);
    }

    //@ResponseStatus(code=HttpStatus.CREATED, reason="Auction successfully updated.")
    @RequestMapping( path = "/{id}", method = RequestMethod.PUT)
    public Auction update(@PathVariable int id, @Valid @RequestBody Auction auction) throws AuctionNotFoundException {
        return dao.update(auction, id);
    }
    
    @ResponseStatus(code=HttpStatus.NO_CONTENT, reason="Auction successfully deleted.")
    @RequestMapping( path = "/{id}", method = RequestMethod.DELETE)
    public void update(@Valid @PathVariable int id) throws AuctionNotFoundException {
        dao.delete(id);
    }
}
