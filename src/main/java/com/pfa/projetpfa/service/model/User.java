package com.pfa.projetpfa.service.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class User {

    @Id
    @Column(name="id_user" , nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String last_name;
    private String phone;
    private String address;
    private String credit_card;
    private String email;
    private String password;
    private String role;
    private boolean is_deleted;
    @OneToOne
    //@JoinColumn(name = "id_payment")
    @JsonBackReference(value = "payment-user")
    private Payment payment;

    @JsonManagedReference(value = "user-order")
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //@JoinColumn(name = "id_order")
    private Collection<Order> order;
    @OneToOne
    @JoinColumn(name = "id_basket")
    @JsonBackReference(value = "user-basket")
    private Basket basket;

    public User() {
    }

    public User(long id, String first_name, String last_name, String phone, String address, String credit_card, String email, String password, String role, boolean is_deleted, Payment payment, Collection<Order> order, Basket basket) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.address = address;
        this.credit_card = credit_card;
        this.email = email;
        this.password = password;
        this.role = role;
        this.is_deleted = is_deleted;
        this.payment = payment;
        this.order = order;
        this.basket = basket;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(String credit_card) {
        this.credit_card = credit_card;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Collection<Order> getOrder() {
        return order;
    }

    public void setOrder(Collection<Order> order) {
        this.order = order;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", credit_card='" + credit_card + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", is_deleted=" + is_deleted +
                ", payment=" + payment +
                ", order=" + order +
                ", basket=" + basket +
                '}';
    }
}
