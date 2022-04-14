package com.bbmk.restaurant.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Food {
    private int id;
    private String name;
    private int price;


    public Food(
            @JsonProperty("id") Integer id,
            @JsonProperty("name") String name,
            @JsonProperty("price") int price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }



    public Food() {
        super();
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


    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;

    }
}

