package com.dia.api_rest_full;

import com.dia.api_rest_full.model.Produit;
import com.dia.api_rest_full.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Api_RestController {
    @Autowired ProduitService produitService;

    @RequestMapping(method = RequestMethod.GET, value = "/produits")
    public List<Produit> getlldProduit(){
        return produitService.getAllProduit();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/prosuits/{id}")
    public  Produit getProduitById(int idProd){
        return produitService.find_Produit(idProd);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/produits")
    public void addPorduit(Produit p){
        produitService.save_Produit(p);
    }
    @RequestMapping(method = RequestMethod.DELETE , value = "/produits/{id}")
    public void deleteProduit(int id){
        produitService.delete_produit(id);
    }
    @RequestMapping(method = RequestMethod.PUT ,value = "/produits")
    public void updateProduit(Produit p){
        produitService.update_produit(p);
    }
}
