package com.example.CRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CRUD.Model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
