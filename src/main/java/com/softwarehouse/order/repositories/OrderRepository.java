package com.softwarehouse.order.repositories;

import com.softwarehouse.order.domain.orders.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  OrderRepository extends JpaRepository<Order, Long> {
}
