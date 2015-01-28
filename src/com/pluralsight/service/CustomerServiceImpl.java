package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

/**
 * Created by daniel.arlitt on 1/27/15.
 */
public class CustomerServiceImpl implements CustomerService {

  private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

  @Override
  public List<Customer> findAll() {
    return customerRepository.findAll();
  }

}
