package com.softwarehouse.order.config;

import com.softwarehouse.order.domain.category.Category;
import com.softwarehouse.order.domain.enums.OrderStatus;
import com.softwarehouse.order.domain.orders.Order;
import com.softwarehouse.order.domain.product.Product;
import com.softwarehouse.order.domain.user.User;
import com.softwarehouse.order.repositories.CategoryRepository;
import com.softwarehouse.order.repositories.OrderRepository;
import com.softwarehouse.order.repositories.ProductRepository;
import com.softwarehouse.order.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Romeu Lima", "romeu.sousa@gmail.com", "98989898", "12346");
        User u2 = new User(null, "Marina Lima", "marina.lima@gmail.com", "98989898", "12346");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computer");

        Product p1 = new Product(null, "The Lord of the Kings", "Lorem Ipsum", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Lorem Ipsum", 2190.0, "");
        Product p3= new Product(null, "MacBook Pro", "Lorem Ipsum", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Lorem Ipsum", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Lorem Ipsum", 100.99, "");


        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p2.getCategories().add(cat3);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);
        p5.getCategories().add(cat2);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));


        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
