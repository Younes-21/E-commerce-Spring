package com.pfa.projetpfa.service.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Payment {
    @Id
    @Column(name="id_payment" , nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date paid_date;
    private float amount;
    @OneToOne
    @JoinColumn(name = "id_user")
    @JsonBackReference(value = "payment-user")
    private User user;
    private String is_deleted;

    public Payment(){

    }

    public Payment(long id, Date paid_date, float amount, User user, String is_deleted) {
        this.id = id;
        this.paid_date = paid_date;
        this.amount = amount;
        this.user = user;
        this.is_deleted = is_deleted;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getPaid_date() {
        return paid_date;
    }

    public void setPaid_date(Date paid_date) {
        this.paid_date = paid_date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(String is_deleted) {
        this.is_deleted = is_deleted;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", paid_date=" + paid_date +
                ", amount=" + amount +
                ", user=" + user +
                ", is_deleted='" + is_deleted + '\'' +
                '}';
    }
}
