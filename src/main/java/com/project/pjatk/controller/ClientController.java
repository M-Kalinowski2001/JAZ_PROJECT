package com.project.pjatk.controller;

import com.project.pjatk.entity.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.pjatk.service.ClientService;

@Controller
public class ClientController {
	
	private ClientService clientService;

	public ClientController(ClientService clientService) {
		super();
		this.clientService = clientService;
	}

	@GetMapping("/clients")
	public String listClients(Model model) {
		model.addAttribute("clients", clientService.getAllClients());
		return "clients";
	}
	
	@GetMapping("/clients/new")
	public String createForm(Model model) {
		Client client = new Client();
		model.addAttribute("client", client);
		return "create_client";
		
	}
	
	@PostMapping("/clients")
	public String saveReservation(@ModelAttribute("client") Client client) {
		clientService.saveReservation(client);
		return "redirect:/clients";
	}
	
	@GetMapping("/clients/edit/{id}")
	public String editReservation(@PathVariable Long id, Model model) {
		model.addAttribute("client", clientService.getClientByID(id));
		return "edit_client";
	}

	@PostMapping("/clients/{id}")
	public String updateReservation(@PathVariable Long id,
			@ModelAttribute("client") Client client,
			Model model) {

		Client existingClient = clientService.getClientByID(id);
		existingClient.setId(id);
		existingClient.setLastName(client.getLastName());
		existingClient.setPhone_number(client.getPhone_number());
		existingClient.setDate(client.getDate());
		existingClient.setReservation_time(client.getReservation_time());
		existingClient.setTrack_number(client.getTrack_number());

		clientService.updateReservation(existingClient);
		return "redirect:/clients";
	}
	
	@GetMapping("/clients/{id}")
	public String deleteReservation(@PathVariable Long id) {
		clientService.deleteClientByID(id);
		return "redirect:/clients";
	}
	
}
