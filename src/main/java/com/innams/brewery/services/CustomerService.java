package com.innams.brewery.services;

import java.util.UUID;
import com.innams.brewery.web.model.CustomerDto;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void updateCustomer(
            UUID customerId,
            CustomerDto customerDto
    );

    void deleteCustomer(UUID customerId);
}
