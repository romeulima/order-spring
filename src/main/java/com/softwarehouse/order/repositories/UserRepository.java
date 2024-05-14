package com.softwarehouse.order.repositories;

import com.softwarehouse.order.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
