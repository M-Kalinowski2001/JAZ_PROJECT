package com.project.pjatk;

import com.project.pjatk.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.pjatk.repository.ClientRepository;

@SpringBootApplication
public class BowlingReservationDataManagementApplication{

	public static void main(String[] args) {
		SpringApplication.run(BowlingReservationDataManagementApplication.class, args);
	}
}