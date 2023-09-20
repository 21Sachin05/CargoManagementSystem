package com.amdocs.service.impl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.entity.Cargo;
import com.amdocs.repo.CargoRepository;
import com.amdocs.service.CargoService;

@Service
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoRepository cargoRepo;

	@Override
	public boolean saveCargo(Cargo cargo) {
		// TODO Auto-generated method stub

		// interact db s/w to store data into the database

		Cargo cargoSave = cargoRepo.save(cargo);
		boolean flag = false;

		if (cargoSave != null)
			flag = true;    //if inserted successfully

		return flag;
	}

	@Override
	public List<Cargo> getAllCargo() {
		// TODO Auto-generated method stub
		//select *from employee;        return all rows
		List<Cargo> cargoRecords = cargoRepo.findAll();
		return cargoRecords;
	}

	@Override
	public Cargo getCargoId(int id) {
		// TODO Auto-generated method stub      for get single row
		//select *From employee where eno=?;
		Optional<Cargo> cargoId = cargoRepo.findById(id);
		Cargo cargo = cargoId.get();
		return cargo;
	}
	

	@Override
	public boolean updateCargo(Cargo cargo) {
		// TODO Auto-generated method stub
		
		//Record is exist or not have to check once record is exist then update the data
		
		return saveCargo(cargo);
	}

	@Override
	public boolean deleteCargo(int id) {
		// TODO Auto-generated method stub
		//Record is exist or not have to check first then delete
		Cargo cargo = getCargoId(id);
		boolean flag=false;
		if(cargo!=null)
		{
			cargoRepo.delete(cargo);
		flag=true;	
		}
		
			
		
		return flag;
		
		
	}



}
