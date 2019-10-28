package xyz.homesangsang.websocketsecuritydemo.repository;

import org.springframework.data.repository.CrudRepository;
import xyz.homesangsang.websocketsecuritydemo.entity.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    List<Customer> findByLastName(String lastName);

    List<Customer> findAll();

}
