package com.dia.api_rest_full.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "produit")
@Table(name = "produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_product")
    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public Produit(Integer id, String name, Date date, TypeProduit typeProduct, Integer product_id) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.typeProduct = typeProduct;
        this.product_id = product_id;
    }

    public Produit() {
    }

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)

    private TypeProduit typeProduct;
    private Integer product_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMane() {
        return name;
    }
    public void setMane(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TypeProduit getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(TypeProduit typeProduct) {
        this.typeProduct = typeProduct;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }
}

