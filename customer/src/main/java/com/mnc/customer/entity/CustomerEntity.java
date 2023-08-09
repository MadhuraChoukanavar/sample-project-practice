package com.mnc.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.springframework.data.mapping.AccessOptions.GetOptions.GetNulls;

@Entity
@Table(name="customer_details")
public class CustomerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private long customerId;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="customer_mail")
	private String customerMail;
	

	public CustomerEntity() {
		super();
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerMail() {
		return customerMail;
	}

	public void setCustomerMail(String customerMail) {
		this.customerMail = customerMail;
	}

	@Override
	public String toString() {
		return "CustomerEntity [customerId=" + customerId + ", customerName=" + customerName + ", customerMail="
				+ customerMail + "]";
	}

	public CustomerEntity(String customerName, String customerMail) {
		super();
		this.customerName = customerName;
		this.customerMail = customerMail;
	}

	

}
