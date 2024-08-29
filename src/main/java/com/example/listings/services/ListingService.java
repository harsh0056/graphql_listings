package com.example.listings.services;

import com.example.listings.models.Listing;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class ListingService {

    private static final String Listing_API_URL = "https://rt-airlock-services-listing.herokuapp.com/featured-listings";
    private final RestClient client = RestClient.builder().baseUrl(Listing_API_URL).build();


    private final ObjectMapper mapper = new ObjectMapper();


    public List<Listing> getListings () throws IOException {

        JsonNode response = client
                .get()
                .uri(Listing_API_URL)
                .retrieve()
                .body(JsonNode.class);

        System.out.println("this is the response "+response);
        if (response != null) {
            return mapper.readValue(response.traverse(), new TypeReference<List<Listing>>() {});
        }

        return null;
    }

}
