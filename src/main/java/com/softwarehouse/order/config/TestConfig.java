package com.softwarehouse.order.config;

import com.softwarehouse.order.domain.user.User;
import com.softwarehouse.order.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Romeu Lima", "romeu.sousa@gmail.com", "98989898", "12346");
        User u2 = new User(null, "Marina Lima", "marina.lima@gmail.com", "98989898", "12346");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
