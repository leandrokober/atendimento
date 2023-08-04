package com.assistencia.helpdesk.atendimento.models;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private BigDecimal sellValue;
    private Integer storaged;

    @OneToMany(mappedBy = "product")
    private List<Product> product = new ArrayList<>();

    public Product() {
    }

    public Product(Integer id, String description, BigDecimal sellValue, Integer storaged, List<Product> product) {
        this.id = id;
        this.description = description;
        this.sellValue = sellValue;
        this.storaged = storaged;
        this.product = product;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getSellValue() {
        return sellValue;
    }

    public Integer getStoraged() {
        return storaged;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSellValue(BigDecimal sellValue) {
        this.sellValue = sellValue;
    }

    public void setStoraged(Integer storaged) {
        this.storaged = storaged;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
