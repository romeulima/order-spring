package com.softwarehouse.order.repositories;

import com.softwarehouse.order.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
