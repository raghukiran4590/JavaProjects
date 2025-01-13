package com.spring.oracle.data.jpa.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.oracle.data.jpa.entities.ContactsMasterEntity;

@Repository
public interface ContactsMasterRepo extends CrudRepository<ContactsMasterEntity, Serializable> {

}
