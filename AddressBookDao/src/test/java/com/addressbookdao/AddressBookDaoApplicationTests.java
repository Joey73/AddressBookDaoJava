package com.addressbookdao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class AddressBookDaoApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void getContacts(){
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/contacts/getall", String.class);
//		//ResponseEntity<String> response = restTemplate.getForEntity("http://api.geonames.org/weatherJSON?formatted=true&north=44.1&south=-9.9&east=-22.4&west=55.2&username=demo&style=full", String.class);
//		
//		if(HttpStatus.OK == response.getStatusCode()){
//			System.out.println("HTTP Status ok");
//			System.out.println("ResponseBody: " + response.getBody());
//		}
	}
}
