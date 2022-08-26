package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Router;
import com.example.repository.RouterRepository;


@RestController

   public class Controller{
	@Autowired
	private RouterRepository rs;
	
	
	
@GetMapping("/")
public List<Router> find()
	{
		
	return rs.findAll();
	}
} 