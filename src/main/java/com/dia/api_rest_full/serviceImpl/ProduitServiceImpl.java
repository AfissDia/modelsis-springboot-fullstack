package com.dia.api_rest_full.serviceImpl;

import com.dia.api_rest_full.model.Produit;
import com.dia.api_rest_full.repository.ProduitRepository;
import com.dia.api_rest_full.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {
    @Autowired
    private ProduitRepository produitRepository;

    @Override
    public List<Produit> getAllProduit() {

        return produitRepository.findAll();
    }

    @Override
    public void save_Produit(Produit p) {
        produitRepository.save(p);
    }

    @Override
    public void update_produit(Produit p) {
        produitRepository.save(p);
    }

    @Override
    public void delete_produit(int id) {
        produitRepository.deleteById(id);
    }

    @Override
    public Produit find_Produit(int id) {
        return produitRepository.findById(id).get();
    }
}
