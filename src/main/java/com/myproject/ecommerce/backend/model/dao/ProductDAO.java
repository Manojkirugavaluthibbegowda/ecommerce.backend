package com.myproject.ecommerce.backend.model.dao;

import com.myproject.ecommerce.backend.model.Product;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductDAO extends ListCrudRepository<Product, Long> {
}
