package com.yesserm.crud.domain;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
       return customerRepository.findAll().stream().map(CustomerMapper::toCustomer).collect(Collectors.toList());
    }

    public List<Customer> findByNameContainingIgnoreCase(String name) {
        return customerRepository.findByNameContainingIgnoreCase(name)
                .stream()
                .map(CustomerMapper::toCustomer)
                .collect(Collectors.toList());
    }

    public Customer save(Customer customer) {
        return CustomerMapper.toCustomer(customerRepository.save(CustomerMapper.toCustomerEntity(customer)));
    }

    public Customer update(Customer customer) {
        Long id = customer.getId();
        CustomerEntity customerEntityToUpdate = customerRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Customer not found with given id: " + id));
        CustomerMapper.updateCustomerEntityFromCustomer(customerEntityToUpdate, customer);
        CustomerEntity updatedCustomerEntity = customerRepository.save(customerEntityToUpdate);
        return CustomerMapper.toCustomer(updatedCustomerEntity);
    }

    public void delete(Customer customer) {
        Long id = customer.getId();
        if (!customerRepository.existsById(id)) {
            throw new RuntimeException("Customer not found with given id: " + id);
        }
        customerRepository.deleteById(id);
    }
}
