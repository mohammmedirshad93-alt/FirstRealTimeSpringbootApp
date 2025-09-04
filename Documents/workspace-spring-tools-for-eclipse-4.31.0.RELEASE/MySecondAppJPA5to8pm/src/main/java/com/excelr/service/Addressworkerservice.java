package com.excelr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.Repository.AddressRepository;
import com.excelr.Repository.workersRepository;
import com.excelr.entity.Address;
import com.excelr.entity.workers;

import jakarta.transaction.Transactional;


	@Service
	public class  Addressworkerservice {

		@Autowired
		private workersRepository worker1;
		
		@Autowired
		private AddressRepository addressRepository;
		
		@Transactional(rollbackOn =Exception.class)
		public void SaveData() {
		workers wor=new workers();
		wor.setEmpId(203);
		wor.setWorName("Azher");
		worker1.save(wor);
		
		Address add=new Address();
		add.setEmpId(203);
		add.setAddId(18-9-288/1);
		add.setCity("Nizamabad");
		addressRepository.save(add);
		
		System.out.println("How are you guys this is just for practis perpos ");

	 }

	}

