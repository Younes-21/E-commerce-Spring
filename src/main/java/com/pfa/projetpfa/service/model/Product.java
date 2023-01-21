package com.pfa.projetpfa.service.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name="Product")
@JsonIgnoreProperties("hibernateLazyInitializer")
public class Product {
    @Id
    @Column(name="id_product" , nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    private int selected_quantity;
    private float buying_price;
    private float selling_price;
    private int stock;
    private int stock_available;
    private float weight;
    @JsonBackReference(value = "product-category")
    @ManyToOne
    @JoinColumn(name="id_category")
    private Category category;
    @ManyToMany(mappedBy = "product")
    //@JoinColumn(name = "id_basket")
    private Collection<Basket> basket;
    @ManyToMany(mappedBy = "product")
    //@JoinColumn(name="id_order")
    private Collection<Order> order;
    @JsonManagedReference(value = "product-image")
    @OneToMany(mappedBy = "product" , fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Collection<Image> images;

    private boolean is_deleted;

    public Product(){

    }

    public Product(Long id, String name, String description, int selected_quantity, float buying_price, float selling_price, int stock, int stock_available, float weight, Category category, Collection<Basket> basket, Collection<Order> order, Collection<Image> images, boolean is_deleted) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.selected_quantity = selected_quantity;
        this.buying_price = buying_price;
        this.selling_price = selling_price;
        this.stock = stock;
        this.stock_available = stock_available;
        this.weight = weight;
        this.category = category;
        this.basket = basket;
        this.order = order;
        this.images = images;
        this.is_deleted = is_deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSelected_quantity() {
        return selected_quantity;
    }

    public void setSelected_quantity(int selected_quantity) {
        this.selected_quantity = selected_quantity;
    }

    public float getBuying_price() {
        return buying_price;
    }

    public void setBuying_price(float buying_price) {
        this.buying_price = buying_price;
    }

    public float getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(float selling_price) {
        this.selling_price = selling_price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock_available() {
        return stock_available;
    }

    public void setStock_available(int stock_available) {
        this.stock_available = stock_available;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Collection<Basket> getBasket() {
        return basket;
    }

    public void setBasket(Collection<Basket> basket) {
        this.basket = basket;
    }

    public Collection<Order> getOrder() {
        return order;
    }

    public void setOrder(Collection<Order> order) {
        this.order = order;
    }

    public Collection<Image> getImages() {
        return images;
    }

    public void setImages(Collection<Image> images) {
        this.images = images;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", selected_quantity=" + selected_quantity +
                ", buying_price=" + buying_price +
                ", selling_price=" + selling_price +
                ", stock=" + stock +
                ", stock_available=" + stock_available +
                ", weight=" + weight +
                ", category=" + category +
                ", basket=" + basket +
                ", order=" + order +
                ", images=" + images +
                ", is_deleted=" + is_deleted +
                '}';
    }
}