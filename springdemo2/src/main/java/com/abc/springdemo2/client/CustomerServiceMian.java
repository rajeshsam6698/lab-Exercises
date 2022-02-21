package com.abc.springdemo2.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.springdemo2.bean.Customer;
import com.abc.springdemo2.controller.CustomerController;

public class CustomerServiceMian {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

		Customer customer1 = new Customer();
		customer1.setCustomerId(101);
		customer1.setName("Cust-1");
		;
		customer1.setEmail("rajesh@gmail.com");
		;
		customer1.setMobile("9638574210");

		Customer customer2 = new Customer();
		customer2.setCustomerId(102);
		customer2.setName("Cust-2");
		;
		customer2.setEmail("sam@gmail.com");
		;
		customer2.setMobile("9638574210");

		Customer customer3 = new Customer();
		customer3.setCustomerId(103);
		customer3.setName("Cust-3");
		;
		customer3.setEmail("arvind@tmail.com");
		;
		customer3.setMobile("9638574210");

		CustomerController controller = (CustomerController) context.getBean(CustomerController.class);
		controller.save(customer1);
		controller.save(customer2);
		controller.save(customer3);

		System.out.println("All Customers");
		controller.displayAllCustomers();
//			
//			System.out.println("Search customer by Id:");
//			int customerId = 103;
//			
//			controller.findCustomer(customerId);

		context.close();

	}

}