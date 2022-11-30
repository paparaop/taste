package com.app.taste.taste.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.taste.taste.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
