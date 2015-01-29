package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by daniel.arlitt on 1/27/15.
 */

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  public CustomerServiceImpl() {}

//  @Autowired
  public CustomerServiceImpl(CustomerRepository customerRepository) {
    System.out.println("Using constructor injection");

    this.customerRepository = customerRepository;
  }

//  @Autowired
  public void setCustomerRepository(CustomerRepository customerRepository) {
    System.out.println("Using setter injection");

    this.customerRepository = customerRepository;
  }

  @Override
  public List<Customer> findAll() {
    return customerRepository.findAll();
  }

}
