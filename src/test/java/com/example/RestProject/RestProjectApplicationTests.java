package com.example.RestProject;

import com.example.RestProject.repository.CustomerRepository;
import com.example.RestProject.serviceImpl.CustomerServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestProjectApplicationTests {
	@Autowired
	CustomerServiceImpl customerService;
	@Test
	public void testFindingAllCustomers(){
	assertEquals(1,customerService.getAll().size());

	}

}

