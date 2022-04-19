package com.example.hospitalManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalManagment.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}
