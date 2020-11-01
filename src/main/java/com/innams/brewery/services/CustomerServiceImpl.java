package com.innams.brewery.services;

import java.util.UUID;
import org.springframework.stereotype.Service;
import com.innams.brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return new CustomerDto(UUID.randomUUID(), "My Name");
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                          .customerName(customerDto.getCustomerName())
                          .build();
    }

    @Override
    public void updateCustomer(
            UUID customerId,
            CustomerDto customerDto
    ) {
//todo add implementation
    }

    @Override
    public void deleteCustomer(UUID customerId) {
//todo add implementation
        log.debug("deleting... " + customerId.toString());
    }
}
