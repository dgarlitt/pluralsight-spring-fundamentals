package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel.arlitt on 1/27/15.
 */
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

  @Value("${firstName}")
  private String firstName;

  @Value("${lastName}")
  private String lastName;

  @Override
  public List<Customer> findAll() {

    List<Customer> customers = new ArrayList<>();

    Customer customer = new Customer();

    customer.setFirstname(firstName);
    customer.setLastname(lastName);

    customers.add(customer);

    return customers;

  }

}
