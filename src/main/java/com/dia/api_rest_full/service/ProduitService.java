package com.dia.api_rest_full.service;

import com.dia.api_rest_full.model.Produit;

import java.util.List;

public interface ProduitService {
    public List<Produit> getAllProduit();
    void save_Produit(Produit p);
    void update_produit( Produit p);
    void delete_produit(int id);
    public Produit find_Produit(int id);
}
