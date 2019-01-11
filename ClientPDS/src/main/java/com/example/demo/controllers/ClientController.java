package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.com.I_Reservation;
import com.example.demo.com.I_Vehicule;
import com.example.demo.dao.ClientRepository;
import com.example.demo.entities.Client;
import com.example.demo.entities.Reservation;
import com.example.demo.entities.Vehicule;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class ClientController {
	@Autowired
	private ClientRepository clientrepo;

	@Autowired
	private I_Reservation lc;

	@Autowired
	private I_Vehicule vh;
	@CrossOrigin(origins = { "http://localhost:4200" })
	@RequestMapping("/save")
	public Client saveclient(Client c) {
		clientrepo.save(c);
		return c;
	}

	@RequestMapping("/allc")
	public List<Client> getclients() {

		return clientrepo.findAll();
	}

	@RequestMapping("/Clientpds")
	public Optional<Client> getById(String id) {

		Optional<Client> c = clientrepo.findByIdClient(id);
		List<Reservation> lgnes = lc.GetReservation(id);
		List<Vehicule> vhs = vh.GetVehicules(id);

		c.get().setVehiculeslist(vhs);
		c.get().setReslist(lgnes);
		return c;
	}

	@RequestMapping("/liste")
	public List<String> getcode() {

		List<Client> cmd = clientrepo.findAll();

		List<String> array = new ArrayList<String>();
		for (Client info : cmd) {
			array.add(info.getIdClient());
		}
		return array;

	}

	@RequestMapping("/updateClient")
	public Client update(Client c) {
		return clientrepo.save(c);
	}

	@RequestMapping("/find")
	public Client getByLoginPassword(String userName, String password) {

		return clientrepo.findByUserNameAndPassword(userName, password);
	}

}
