package com.example.customer.repo;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.customer.model.Customer;

@Repository
@Transactional
public interface CustomerRepo extends JpaRepository<Customer,Integer>
{
	@Query("select c from Customer c where c.cname=?1")
	public List<Customer> searchOrderByCustomer(String customer);
	
	@Query("select c from Customer c where c.cid=?1")
	public List<Customer> searchCustomerByOrderId(int oid);
}
