package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entities.Client;

public interface ClientRepository  extends MongoRepository<Client,String> {
  Optional<Client> findByIdClient(String id);
	Client findByUserNameAndPassword(String userName,String password);
}
