package com.pradeep.springbootweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.springbootweb.entities.Product;

public interface Productrepository extends JpaRepository<Product, Integer> {

}
