package com.project.webapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.webapp.model.CourierService;
import com.project.webapp.repository.CourierServiceRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource("file:${C:/Users/korisnik/Desktop/testapplication.properties}")
public class TestFirst {
	
	@Autowired
	CourierServiceRepository courierServiceRepository;
	
	@Before
	public void before() {
		System.out.println("Pre izvrsavanja testaa");
	}
	
	@Test
	public void test1() {
		String poruka = "Uspesno";
		assertEquals(poruka,"Uspesno");
	}
	
	@Test
	public void test2() {
		CourierService cs = courierServiceRepository.findById(1).orElse(null);
		assertEquals(cs.getName(),"zack");
	}
	
	@Test
	public void testingCourierServiceUser() {
		CourierService cs = courierServiceRepository.findById(1).orElse(null);
		assertEquals(cs.getName(), "James Bond");
		assertEquals(cs.getPictureUrl(), "www.pictures.com/something");
		assertEquals(cs.getPrice(), 10);
	}
	
	@After
	public void after() {
		System.out.println("Posle izvrsavanja testa");
	}
	
}
