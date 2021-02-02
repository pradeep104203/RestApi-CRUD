package com.pradeep.springbootweb.controllers;

import java.util.List;

import javax.persistence.Cacheable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pradeep.springbootweb.entities.Product;
import com.pradeep.springbootweb.repos.Productrepository;

@RestController
public class ProductRestController {
	
	@Autowired
	Productrepository repository;
	
	
	private static final Logger LOGGER=
	LoggerFactory.getLogger(ProductRestController.class);
	
	

	@RequestMapping(value="/products/",method=RequestMethod.GET)
	
	public List<Product> getProducts(){
	
		return repository.findAll();
	}
	
	
  @RequestMapping(value="/products/{id}",method=RequestMethod.GET)
  //@Transactional(readOnly=true)
	public Product getProduct(@PathVariable("id") int id)
	{

		LOGGER.info("Finding product by id"+id);
		return repository.findById(id).get();
		
	}
  
  
  @RequestMapping(value="/products/",method=RequestMethod.POST)
   public Product createProduct(@RequestBody Product product)
   {
	return repository.save(product);
	   
   }
		
  @RequestMapping(value="/products/",method=RequestMethod.PUT)
  public Product updateProduct(@RequestBody Product product)
  {
	return repository.save(product);
	   
  }
		
  
  @RequestMapping(value="/products/{id}",method=RequestMethod.DELETE)
  public void deleteProduct(@PathVariable Product id)
  {
	 repository.delete(id);
	   
  }
	

}
