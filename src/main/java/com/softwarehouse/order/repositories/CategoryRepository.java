package com.softwarehouse.order.repositories;

import com.softwarehouse.order.domain.category.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
