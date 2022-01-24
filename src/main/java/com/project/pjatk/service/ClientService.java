package com.project.pjatk.service;

import java.util.List;

import com.project.pjatk.entity.Client;

public interface ClientService {
	List<Client> getAllClients();
	
	Client saveReservation(Client client);
	
	Client getClientByID(Long id);
	
	Client updateReservation(Client client);
	
	void deleteClientByID(Long id);
}
