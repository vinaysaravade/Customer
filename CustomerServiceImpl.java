package com.example.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.model.Customer;
import com.example.customer.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepo repo;
	
	@Override
	public String insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repo.save(customer);
		return "Customer Added";
	}

	@Override
	public List<Customer> displayAllCustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	
	}
	
	@Override
	public String deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		repo.deleteById(cid);
		return "costomer id deleted";
	}


	@Override
	public List<Customer> searchCustomerByCustomerId(String customer) {
		// TODO Auto-generated method stub
		return repo.searchOrderByCustomer(customer);
	}

	@Override
	public List<Customer> searchCustomerByOrderId(int oid) {
		// TODO Auto-generated method stub
		return repo.searchCustomerByOrderId(oid);
	}

	
	
}