package com.amdocs.entity;

import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Truck {
	@Id  //for set  primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
	private Integer id;
	private String vehicleNo;
	private Integer capacity;
	
	@ManyToOne
    @JoinColumn(name = "cargo_id")
    private Cargo cargo;
	
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Truck(Integer id, String vehicleNo, Integer capacity) {
		super();
		this.id = id;
		this.vehicleNo = vehicleNo;
		this.capacity = capacity;
	}
	
	
}
