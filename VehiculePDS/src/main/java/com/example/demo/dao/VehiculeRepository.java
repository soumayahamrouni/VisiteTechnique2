package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entities.Vehicule;

public interface VehiculeRepository extends MongoRepository<Vehicule, Long>{

	List<Vehicule> findByClient(String id);
	Vehicule findByIdVehicule(String id);
}
