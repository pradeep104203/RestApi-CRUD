package com.pradeep.springbootweb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.pradeep.springbootweb.entities.Product;

@SpringBootTest
class ProductrestapiApplicationTests {

	@Value("${productrestapi.services.url}")
	private String baseURL;
	
	
	
	@Test
	public void testGetProduct() {

		System.out.println(baseURL);
		RestTemplate restTemplate = new RestTemplate();
		// deserialization happens here json object will be deserialized to product class
		Product product = restTemplate.getForObject(baseURL+"1", Product.class);
		assertNotNull(product);
		assertEquals("Iphone", product.getName());

	}

	@Test
	public void testCreateProduct() {

		RestTemplate restTemplate = new RestTemplate();
		Product product = new Product();
		product.setName("Samsung mobile");
		product.setDescription("Its awesome");
		product.setPrice(1000);
		Product newProduct = restTemplate.postForObject(baseURL, product,
				Product.class);
		assertNotNull(newProduct);
		assertNotNull(newProduct.getId());
		
		assertEquals("Samsung mobile", newProduct.getName());

	}
	
	
	@Test
	public void testUpdateProduct() {

		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject(baseURL+"1", Product.class);
		product.setPrice(1400);
		product.setDescription("pradeep changed this");
		
		restTemplate.put(baseURL, product);
		
	}

}
