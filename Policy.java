package com.example.policy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "policy")
public class Policy {

    @Id
    private int policynumber;
    private String policyholdername;
    private String policyname;
    private String contact;
    private String address;

    // Getters and Setters
    public int getPolicynumber() {
        return policynumber;
    }

    public void setPolicynumber(int policynumber) {
        this.policynumber = policynumber;
    }

    public String getPolicyholdername() {
        return policyholdername;
    }

    public void setPolicyholdername(String policyholdername) {
        this.policyholdername = policyholdername;
    }

    public String getPolicyname() {
        return policyname;
    }

    public void setPolicyname(String policyname) {
        this.policyname = policyname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policynumber=" + policynumber +
                ", policyholdername='" + policyholdername + '\'' +
                ", policyname='" + policyname + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}