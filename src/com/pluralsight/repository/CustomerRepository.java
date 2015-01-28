package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by daniel.arlitt on 1/27/15.
 */
public interface CustomerRepository {
  List<Customer> findAll();
}
