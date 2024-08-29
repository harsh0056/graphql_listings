package com.example.listings.models;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FeaturedListings {
    private List<Listing> listings;

    // Getter and Setter
    public List<Listing> getListings() {
        return listings;
    }

    public void setListings(List<Listing> listings) {
        this.listings = listings;
    }
}
