package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.VehiculeRepository;
import com.example.demo.entities.Vehicule;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class VehiculeController {
	@Autowired
	private VehiculeRepository vehiculerepository;
	

	@RequestMapping("/saveve")
	public Vehicule savevehicule(Vehicule v)
	{
		vehiculerepository.save(v);
		return v;
	}
	
	@RequestMapping("/allve")
	public List<Vehicule> getvehicules(){
		
		return vehiculerepository.findAll();
	}
	
	@RequestMapping("/getve")
    public Vehicule getvehicule(String id)
    {
		return vehiculerepository.findByIdVehicule(id);
		
    }
	@RequestMapping("/getByClient/{id}")
	   public List<Vehicule> findByClient(@PathVariable("id") String client){
			
			return vehiculerepository.findByClient(client);
		}
	

	
}
