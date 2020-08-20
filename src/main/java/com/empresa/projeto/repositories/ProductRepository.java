package com.empresa.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.projeto.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}
