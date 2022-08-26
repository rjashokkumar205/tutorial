package com.example.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Router;

@Repository
public interface RouterRepository    extends MongoRepository<Router , String> {

	

}
