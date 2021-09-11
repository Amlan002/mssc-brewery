package com.beer.app.service;

import java.util.UUID;

import com.beer.app.web.model.CustomerDto;

public interface CustomerService {
	CustomerDto getCustomerById(UUID customerId);
	CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
