package org.example.catalogue.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("fleurstest")
public class Fleur {

    @Id
    private String id;

    private String name;
    private String location;
    private Integer price;
    private Integer quantity;
    private String image;

    public Fleur(String id, String name, String location, Integer price, Integer quantity, String image) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
