package com.example.listings.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Listing {

private String id ;
private String title ;
private int numOfBeds;
private float costPerNight;
private boolean closedForBookings;


}
