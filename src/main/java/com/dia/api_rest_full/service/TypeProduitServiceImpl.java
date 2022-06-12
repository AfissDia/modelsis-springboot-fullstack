package com.dia.api_rest_full.service;
import com.dia.api_rest_full.dao.TypeProduitRepository;
import com.dia.api_rest_full.model.TypeProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeProduitServiceImpl implements TypeProduitService{
    @Autowired
    private TypeProduitRepository typeProduitRepository;

    @Override
    public List<TypeProduit> getAllTypeProduit() {

        return typeProduitRepository.findAll();
    }

    @Override
    public void save_typeProduit(TypeProduit p) {
        typeProduitRepository.save(p);
    }

    @Override
    public void update_typeProduit(TypeProduit p) {
        typeProduitRepository.save(p);
    }

    @Override
    public void delete_typeProduit(int id) {
        typeProduitRepository.deleteById(id);
    }

    @Override
    public TypeProduit find_typeProduit(int id) {
        return typeProduitRepository.findById(id).get();
    }
}
