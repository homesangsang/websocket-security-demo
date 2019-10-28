package xyz.homesangsang.websocketsecuritydemo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xyz.homesangsang.websocketsecuritydemo.entity.Customer;
import xyz.homesangsang.websocketsecuritydemo.repository.CustomerRepository;

@Configuration
@Slf4j
public class JpaConfig {

    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
       return args -> {
           repository.save(new Customer("a1", "aaa"));
           repository.save(new Customer("a2", "aaa"));
           repository.save(new Customer("a3", "aaa"));
           repository.save(new Customer("a4", "aaa"));
           repository.save(new Customer("a5", "aaa"));
           repository.save(new Customer("a6", "aaa"));
       };
    }
}
