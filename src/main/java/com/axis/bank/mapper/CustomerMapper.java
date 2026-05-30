package com.axis.bank.mapper;

import com.axis.bank.dto.CustomerDto;
import com.axis.bank.entity.Customer;

public class CustomerMapper {

    public static CustomerDto toDto(Customer c) {

        CustomerDto dto = new CustomerDto();

        dto.setCustomerId(c.getCustomerId());
        dto.setCustomerName(c.getCustomerName());
        dto.setMobile(c.getMobile());
        dto.setEmail(c.getEmail());
        dto.setAddress(c.getAddress());

        return dto;
    }

    public static Customer toEntity(CustomerDto dto) {

        Customer c = new Customer();

        c.setCustomerName(dto.getCustomerName());
        c.setMobile(dto.getMobile());
        c.setEmail(dto.getEmail());
        c.setAddress(dto.getAddress());
        c.setStatus("ACTIVE");

        return c;
    }
}