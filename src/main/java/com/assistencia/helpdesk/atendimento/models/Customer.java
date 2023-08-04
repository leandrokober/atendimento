package com.assistencia.helpdesk.atendimento.models;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Customer implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String CPF;
    private String address;
    private String numberAdress;
    private String complAdress;
    private String city;
    private String uf;
    private String phoneNumber;
    private String email;

 //   @OneToMany(mappedBy = "customer")
   // private List<Order> atendimento = new ArrayList<>();

    public Customer() {
    }

    public Customer(Integer id, String name, String CPF, String address, String numberAdress, String complAdress,
                    String city, String uf, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.CPF = CPF;
        this.address = address;
        this.numberAdress = numberAdress;
        this.complAdress = complAdress;
        this.city = city;
        this.uf = uf;
        this.phoneNumber = phoneNumber;
        this.email = email;
           }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCPF() {
        return CPF;
    }

    public String getAddress() {
        return address;
    }

    public String getNumberAdress() {
        return numberAdress;
    }

    public String getComplAdress() {
        return complAdress;
    }

    public String getCity() {
        return city;
    }

    public String getUf() {
        return uf;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }



    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumberAdress(String numberAdress) {
        this.numberAdress = numberAdress;
    }

    public void setComplAdress(String complAdress) {
        this.complAdress = complAdress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}