package com.example.hospitalManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalManagment.entity.Inpatient;

@Repository
public interface InpatientRepository extends JpaRepository<Inpatient, Long> {

}
