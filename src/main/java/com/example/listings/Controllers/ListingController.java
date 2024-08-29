package com.example.listings.Controllers;

import com.example.listings.models.Listing;
import com.example.listings.services.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class ListingController {

    @Autowired
    private ListingService listingService;

    @GetMapping("/lists")
    public List<Listing> getListing() throws IOException {
        return listingService.getListings();
    }


}
