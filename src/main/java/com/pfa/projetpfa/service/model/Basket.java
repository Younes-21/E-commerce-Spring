package com.pfa.projetpfa.service.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Basket {
    @Id
    @Column(name="id_basket" , nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private float total_price;
    @OneToOne
    //@JoinColumn(name = "id_user")
    @JsonBackReference
    private User user;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "basket_product", joinColumns = @JoinColumn(name = "id_basket"), inverseJoinColumns = @JoinColumn(name = "id_product"))
    @JsonIgnore
    private List<Product> product = new ArrayList<>();
    private boolean is_deleted;


    public Basket() {
    }

    public Basket(long id, Date date,  float total_price, User user, List<Product> product, boolean is_deleted) {
        this.id = id;
        this.date = date;
        this.total_price = total_price;
        this.user = user;
        this.product = product;
        this.is_deleted = is_deleted;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", date=" + date +
                ", total_price=" + total_price +
                ", user=" + user +
                ", product=" + product +
                ", is_deleted=" + is_deleted +
                '}';
    }
}
