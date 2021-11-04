package com.beer.app.web.mapper;

import org.mapstruct.Mapper;

import com.beer.app.web.domain.Customer;
import com.beer.app.web.model.CustomerDto;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
