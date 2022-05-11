package com.densoft.duka.dao;

import com.densoft.duka.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface ProductsRepository extends JpaRepository<Product, Long> {
}
