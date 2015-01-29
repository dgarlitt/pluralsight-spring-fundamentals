package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by daniel.arlitt on 1/27/15.
 */
public class CustomerServiceImpl implements CustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  public CustomerServiceImpl() {}

  public CustomerServiceImpl(CustomerRepository customerRepository) {
    System.out.println("Using constructor injection");
    this.customerRepository = customerRepository;
  }


  public void setCustomerRepository(CustomerRepository customerRepository) {
    System.out.println("Using setter injection");
    this.customerRepository = customerRepository;
  }

  @Override
  public List<Customer> findAll() {
    return customerRepository.findAll();
  }

}
