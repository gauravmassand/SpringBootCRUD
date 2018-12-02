package com.gauravSample.CMS.service;

import com.gauravSample.CMS.dao.CustomerDAO;
import com.gauravSample.CMS.dto.Customer;
import com.gauravSample.CMS.exception.CustomerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;


    public Customer addCustomer(Customer customer) {
        return customerDAO.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return  customerDAO.findAll();
    }

    public Customer getCustomer(int customerId) throws Exception {

        Optional<Customer> optionalCustomer = customerDAO.findById(customerId);
        if(!optionalCustomer.isPresent()) {
            throw new CustomerNotFoundException("Customer is not present");
        }
       return customerDAO.findById(customerId).get();
    }

    public Customer updateCustomer(int customerId, Customer customer) {

        Customer customerInDB = customerDAO.findById(customerId).get();
        customerInDB.setCustomerID(customerId);
        customerInDB.setCustomerFirstName(customer.getCustomerFirstName());
        customerInDB.setCustomerLastName(customer.getCustomerLastName());
        customerInDB.setCustomerEmail(customer.getCustomerEmail());
        return customerDAO.save(customerInDB);
    }

    public void deleteCustomer(int customerId) {
       customerDAO.deleteById(customerId);
    }

}
