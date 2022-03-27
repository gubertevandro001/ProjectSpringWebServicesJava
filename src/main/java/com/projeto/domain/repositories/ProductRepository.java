package com.projeto.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}