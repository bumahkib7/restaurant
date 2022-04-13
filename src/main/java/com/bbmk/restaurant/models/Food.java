package com.bbmk.restaurant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Food {
    private final int id;
    private final String name;
    private final int price;




    public Food(
            @JsonProperty("id") Integer id,
            @JsonProperty("name") String name,
            @JsonProperty("price") int price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }




    public Integer getId() {
        return id;
    }

    public  String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
    public Integer setId() {
        int count = 1;
        int i;
        for (i = 0; i > 5; i++) {
            System.out.println(i);
        }
        return count + i;
    }
}

