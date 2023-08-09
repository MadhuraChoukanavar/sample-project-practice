package com.mnc.customer.repository;

import org.springframework.data.repository.CrudRepository;

import com.mnc.customer.entity.CustomerEntity;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {

}
