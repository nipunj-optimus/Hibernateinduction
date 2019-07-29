package com.monkeymedia.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.monkeymedia.demo.Model.Entity.ConnectionField;

public interface ConnectionFieldValueRepository extends CrudRepository<ConnectionField, Integer> {

	
}
