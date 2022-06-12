package com.dia.api_rest_full.model;


import javax.persistence.*;


@Entity(name = "type_produit")
@Table(name = "type_produit")

public class TypeProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "name")
    private String name;

    public TypeProduit(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public TypeProduit() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
