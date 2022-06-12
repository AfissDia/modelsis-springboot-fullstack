package com.dia.api_rest_full.service;

import com.dia.api_rest_full.model.TypeProduit;

import java.util.List;

public interface TypeProduitService {
    public List<TypeProduit> getAllTypeProduit();
    void save_typeProduit(TypeProduit p);
    void update_typeProduit( TypeProduit p);
    void delete_typeProduit(int id);
    public TypeProduit find_typeProduit(int id);
}
