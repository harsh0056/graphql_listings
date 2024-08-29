package com.example.listings.resolvers;

import com.example.listings.models.FeaturedListings;
import com.example.listings.models.Listing;

import com.example.listings.services.ListingService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import org.springframework.beans.factory.annotation.Autowired;



import java.io.IOException;
import java.util.List;

@DgsComponent
public class ListingServiceResolvers {

    @Autowired
    private ListingService listingService;

    @DgsQuery
    public FeaturedListings featuredListings() throws IOException {
        List<Listing> listings = listingService.getListings();
        System.out.println("these are the listings"+listings);
        FeaturedListings featuredListings = new FeaturedListings();
        featuredListings.setListings(listings);
        return featuredListings;
    }

}
