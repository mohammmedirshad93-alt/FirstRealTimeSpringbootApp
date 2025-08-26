package com.excelr.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
