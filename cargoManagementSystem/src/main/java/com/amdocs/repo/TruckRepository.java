package com.amdocs.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.entity.Cargo;
import com.amdocs.entity.Truck;
@Repository
public interface TruckRepository extends JpaRepository<Truck, Integer> {

	List<Truck> findByCargo(Cargo cargo);
    Truck findByCargoAndId(Cargo cargo, int id);
	//findByxxx
	//Customized queries
}
