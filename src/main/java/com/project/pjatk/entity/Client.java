package com.project.pjatk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "date")
	private String date;

	@Column(name = "phone_number")
	private String phone_number;

	@Column(name = "reservation_time")
	private String reservation_time;

	@Column(name = "track_number")
	private String track_number;



	public Client() {

	}

	public Client(String lastName, String phone_number, String date, String reservation_time, String track_number) {
		super();
		this.lastName = lastName;
		this.date = date;
		this.phone_number = phone_number;
		this.reservation_time = reservation_time;
		this.track_number = track_number;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getReservation_time() {
		return reservation_time;
	}

	public void setReservation_time(String reservation_time) {
		this.reservation_time = reservation_time;
	}

	public String getTrack_number() {
		return track_number;
	}

	public void setTrack_number(String track_number) {
		this.track_number = track_number;
	}
}
