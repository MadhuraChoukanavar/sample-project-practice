package com.mnc.customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mnc.customer.entity.CustomerEntity;
import com.mnc.customer.repository.CustomerRepository;

@SpringBootTest
class CustomerApplicationTests {
	@Autowired
	private CustomerRepository custRepo;

	@Test
	void saveCustomerDetails() {
		CustomerEntity customer1= new CustomerEntity("sidh","sidh@gmail.com");
		custRepo.save(customer1);
	}
	@Test
    void getCustomerById()
    {
		 System.out.println(custRepo.findById(1l).get());
    	
    }
	@Test
	void updateCustomerById()
	{
		CustomerEntity customer1 = custRepo.findById(1l).get();
		customer1.setCustomerMail("s123@gmail.com");
		custRepo.save(customer1);
		getCustomerById();
		
	}
	@Test
	void deleteCustomer()
	{
		custRepo.deleteAll();
	}
	
}
