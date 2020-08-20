package com.empresa.projeto.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.projeto.entities.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}