package com.monkeymedia.demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.monkeymedia.demo.Model.Entity.Field;

@Repository
public interface FieldRepository extends CrudRepository<Field, Integer> {

	// List<Field> findByGateway(int gateway);

}
