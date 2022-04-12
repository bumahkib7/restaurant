package com.bbmk.restaurant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Food {
    private final int id;
    private final String name;
    private final int price;




    public Food(
            @JsonProperty("id") int id,
            @JsonProperty("name") String name,
            @JsonProperty("price") int price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

