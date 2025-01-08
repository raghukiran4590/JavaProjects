package com.gfg.springdatajpa.example.repository;

import com.gfg.springdatajpa.example.model.UserRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserRepository extends CrudRepository<UserRecord, String> {


        List<UserRecord> findAll();

}
