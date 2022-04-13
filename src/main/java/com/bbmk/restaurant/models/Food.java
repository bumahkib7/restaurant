package com.bbmk.restaurant.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import javax.persistence.*;


@Entity
@Table
public class Food {

    @javax.persistence.Id
    @Id
    @SequenceGenerator(name = "food_id_seq",
            sequenceName = "food_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "food_id_seq"
    )
    private Long id;
    private String name;
    private double price;


    public Food(

        @JsonProperty("id") Integer id,
        @JsonProperty("name") String name,
        @JsonProperty("price") double price ) {
        this.id = Long.valueOf(id);
        this.name = name;
        this.price = price;

    }

    public Food() {

    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }




    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

