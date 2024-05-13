package com.softwarehouse.order.controllers;

import com.softwarehouse.order.domain.user.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Marina", "marina@gmail.com", "99999", "romeulindo");
        return ResponseEntity.ok().body(u);
    }
}
