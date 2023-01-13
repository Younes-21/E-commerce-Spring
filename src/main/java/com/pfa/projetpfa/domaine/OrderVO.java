package com.pfa.projetpfa.domaine;

import com.pfa.projetpfa.service.model.Bill;
import com.pfa.projetpfa.service.model.Delivery;
import com.pfa.projetpfa.service.model.Product;
import com.pfa.projetpfa.service.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderVO {
    private Long id;
    private Date ordered;
    private Date shipped;
    private String status;
    private int quantity;
    private float delivery_price;
    private float total;
    private List<Product> product = new ArrayList<>();
    private User user;
    private Bill bill;
    private Delivery delivery;
    private boolean is_deleted;

    public OrderVO(){
        super();
    }

    public OrderVO(Long id, Date ordered, Date shipped, String status, int quantity, float delivery_price, float total, List<Product> product, User user, Bill bill, Delivery delivery, boolean is_deleted) {
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
}
