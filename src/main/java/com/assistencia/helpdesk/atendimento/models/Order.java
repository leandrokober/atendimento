package com.assistencia.helpdesk.atendimento.models;

import com.assistencia.helpdesk.atendimento.enums.StatusOS;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
@Entity
public class Order implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Customer customer;
    private Tecnic tecnic;
    private Date openDate;
    private String deviceDescription;
    private String problemRelated;

  //  private List<OrderItem> orderItems = new ArrayList<>();
    private String problemToSolve;
    private Date closeDate;
    private StatusOS statusOS;






    public Order() {
    }

    public Order(Integer id, Customer customer, Tecnic tecnic, Date openDate,
                 String deviceDescription, String problemRelated, String problemToSolve,
                 Date closeDate, StatusOS statusOS) {
        this.id = id;
        this.customer = customer;
        this.tecnic = tecnic;
        this.openDate = openDate;
        this.deviceDescription = deviceDescription;
        this.problemRelated = problemRelated;
        this.problemToSolve = problemToSolve;
        this.closeDate = closeDate;
        this.statusOS = statusOS;
    }

    public Integer getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Tecnic getTecnic() {
        return tecnic;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public String getDeviceDescription() {
        return deviceDescription;
    }

    public String getProblemRelated() {
        return problemRelated;
    }

    public String getProblemToSolve() {
        return problemToSolve;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public StatusOS getStatusOS() {
        return statusOS;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setTecnic(Tecnic tecnic) {
        this.tecnic = tecnic;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public void setDeviceDescription(String deviceDescription) {
        this.deviceDescription = deviceDescription;
    }

    public void setProblemRelated(String problemRelated) {
        this.problemRelated = problemRelated;
    }

    public void setProblemToSolve(String problemToSolve) {
        this.problemToSolve = problemToSolve;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public void setStatusOS(StatusOS statusOS) {
        this.statusOS = statusOS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order that = (Order) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
