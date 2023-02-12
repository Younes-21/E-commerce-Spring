package com.pfa.projetpfa.service.model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Table(name="Orderr")
@Entity
public class Order {
    @Id
    @Column(name="id_order" , nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date ordered;
    private Date shipped;
    private String status;
    private int quantity;
    private float delivery_price;
    private float total;
    @ManyToMany//(cascade = CascadeType.ALL)
    @JoinTable(name = "order_product", joinColumns = @JoinColumn(name = "id_order"), inverseJoinColumns = @JoinColumn(name = "id_product"))
    @JsonIgnore
    //@JsonProperty(access = JsonProperty.Access.READ_ONLY)
    //@Getter(onMethod_=@JsonIgnore)
    private List<Product> product = new ArrayList<>();

    @JsonBackReference(value = "user-order")
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "id_user")
    private User user;

    @OneToOne
    @JoinColumn(name = "id_bill")
    @JsonBackReference(value = "bill-order")
    private Bill bill;
    @OneToOne
    @JoinColumn(name = "id_delivery")
    @JsonBackReference(value = "delivery-order")
    private Delivery delivery;
    private boolean is_deleted;

    public Order() {
    }

    public Order(Long id, Date ordered, Date shipped, String status, int quantity, float delivery_price, float total, List<Product> product, User user, Bill bill, Delivery delivery, boolean is_deleted) {
        this.id = id;
        this.ordered = ordered;
        this.shipped = shipped;
        this.status = status;
        this.quantity = quantity;
        this.delivery_price = delivery_price;
        this.total = total;
        this.product = product;
        this.user = user;
        this.bill = bill;
        this.delivery = delivery;
        this.is_deleted = is_deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrdered() {
        return ordered;
    }

    public void setOrdered(Date ordered) {
        this.ordered = ordered;
    }

    public Date getShipped() {
        return shipped;
    }

    public void setShipped(Date shipped) {
        this.shipped = shipped;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDelivery_price() {
        return delivery_price;
    }

    public void setDelivery_price(float delivery_price) {
        this.delivery_price = delivery_price;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", ordered=" + ordered +
                ", shipped=" + shipped +
                ", status='" + status + '\'' +
                ", quantity=" + quantity +
                ", delivery_price=" + delivery_price +
                ", total=" + total +
                ", product=" + product +
                ", user=" + user +
                ", bill=" + bill +
                ", delivery=" + delivery +
                ", is_deleted=" + is_deleted +
                '}';
    }
}
