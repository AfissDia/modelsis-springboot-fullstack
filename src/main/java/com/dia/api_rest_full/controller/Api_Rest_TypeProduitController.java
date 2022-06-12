package com.dia.api_rest_full.controller;

import com.dia.api_rest_full.model.TypeProduit;
import com.dia.api_rest_full.service.TypeProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Api_Rest_TypeProduitController {
    @Autowired TypeProduitService typeProduitService;

    @RequestMapping(method = RequestMethod.GET, value = "/typeProduits")
    public List<TypeProduit> getlldTypeProduit(){
        return typeProduitService.getAllTypeProduit();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/typeProsuits/{id}")
    public  TypeProduit getTypeProduitById(int idProd){
        return typeProduitService.find_typeProduit(idProd);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/typeProduits")
    public void addPorduit(TypeProduit p){
        typeProduitService.save_typeProduit(p);
    }
    @RequestMapping(method = RequestMethod.DELETE , value = "/typeProduits/{id}")
    public void deleteTypeProduit(int id){
        typeProduitService.delete_typeProduit(id);
    }
    @RequestMapping(method = RequestMethod.PUT ,value = "/typeProduits")
    public void updateTypeProduit(TypeProduit p){
        typeProduitService.update_typeProduit(p);
    }
}
