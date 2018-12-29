package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.PathVariable;
>>>>>>> branch 'master' of https://github.com/soumayahamrouni/VisiteTechnique.git
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.VehiculeRepository;
import com.example.demo.entities.Vehicule;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class VehiculeController {
	@Autowired
	private VehiculeRepository vehiculerepository;
	
<<<<<<< HEAD

	@RequestMapping("/saveve")
=======
	
	@RequestMapping("/save")
>>>>>>> branch 'master' of https://github.com/soumayahamrouni/VisiteTechnique.git
	public Vehicule savevehicule(Vehicule v)
	{
		vehiculerepository.save(v);
		return v;
	}
<<<<<<< HEAD
	
	@RequestMapping("/allve")
=======

	@RequestMapping("/all")
>>>>>>> branch 'master' of https://github.com/soumayahamrouni/VisiteTechnique.git
	public List<Vehicule> getvehicules(){
		
		return vehiculerepository.findAll();
	}
	
<<<<<<< HEAD
	@RequestMapping("/getve")
    public Vehicule getvehicule(Long numChassis)
=======
	@RequestMapping("/get")
    public Vehicule getvehicule(String id)
>>>>>>> branch 'master' of https://github.com/soumayahamrouni/VisiteTechnique.git
    {
		return vehiculerepository.findByIdVehicule(id);
		
    }
	@RequestMapping("/getByClient/{id}")
   public List<Vehicule> findByClient(@PathVariable("id") String client){
		
		return vehiculerepository.findByClient(client);
	}
	
<<<<<<< HEAD
	@RequestMapping("/deleteve")
   public void  delete(Long numChassis )
=======
	@RequestMapping("/delete")
   public void  delete(String numChassis )
>>>>>>> branch 'master' of https://github.com/soumayahamrouni/VisiteTechnique.git
   {
		vehiculerepository.deleteById(numChassis);
   }
	
}
