package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daniel.arlitt on 1/27/15.
 */

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

  @Override
  public List<Customer> findAll() {

    List<Customer> customers = new ArrayList<>();

    Customer customer = new Customer();

    customer.setFirstname("Daniel");
    customer.setLastname("Arlitt");

    customers.add(customer);

    return customers;

  }

}
