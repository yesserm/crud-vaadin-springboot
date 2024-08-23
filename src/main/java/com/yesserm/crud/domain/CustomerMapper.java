package com.yesserm.crud.domain;

public class CustomerMapper {
    static Customer toCustomer(CustomerEntity customerEntity) {
        return new Customer(
                customerEntity.getId(),
                customerEntity.getName(),
                customerEntity.getEmail(),
                customerEntity.getPhone(),
                customerEntity.getAddress(),
                customerEntity.getCity(),
                customerEntity.getState(),
                customerEntity.getZip(),
                customerEntity.getCountry()
        );
    }
    static CustomerEntity toCustomerEntity(Customer customer) {
        return new CustomerEntity(
                customer.getId(),
                customer.getName(),
                customer.getEmail(),
                customer.getPhone(),
                customer.getAddress(),
                customer.getCity(),
                customer.getState(),
                customer.getZip(),
                customer.getCountry()
        );
    }

    static void updateCustomerEntityFromCustomer(CustomerEntity customerEntity, Customer customer) {
        customerEntity.setName(customer.getName());
        customerEntity.setEmail(customer.getEmail());
        customerEntity.setPhone(customer.getPhone());
        customerEntity.setAddress(customer.getAddress());
        customerEntity.setCity(customer.getCity());
        customerEntity.setState(customer.getState());
        customerEntity.setZip(customer.getZip());
        customerEntity.setCountry(customer.getCountry());
    }
}