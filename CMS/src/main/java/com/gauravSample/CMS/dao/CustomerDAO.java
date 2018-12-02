package com.gauravSample.CMS.dao;

import com.gauravSample.CMS.dto.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerDAO extends CrudRepository<Customer,Integer> {

    List<Customer> findAll();


}
