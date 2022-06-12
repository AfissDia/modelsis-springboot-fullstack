package com.dia.api_rest_full.dao;

import com.dia.api_rest_full.model.TypeProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeProduitRepository extends JpaRepository<TypeProduit,Integer> {
}
