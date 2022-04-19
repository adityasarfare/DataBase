package com.example.hospitalManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalManagment.entity.Outpatient;

@Repository
public interface OutpatientRepository extends JpaRepository<Outpatient, Long> {

}
