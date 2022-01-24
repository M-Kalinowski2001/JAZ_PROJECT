package com.project.pjatk.service.impl;

import java.util.List;

import com.project.pjatk.entity.Client;
import com.project.pjatk.service.ClientService;
import org.springframework.stereotype.Service;

import com.project.pjatk.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {

	private ClientRepository clientRepository;
	
	public ClientServiceImpl(ClientRepository clientRepository) {
		super();
		this.clientRepository = clientRepository;
	}

	@Override
	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}

	@Override
	public Client saveReservation(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Client getClientByID(Long id) {
		return clientRepository.findById(id).get();
	}

	@Override
	public Client updateReservation(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public void deleteClientByID(Long id) {
		clientRepository.deleteById(id);
	}

}
