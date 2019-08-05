package com.monkeymedia.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.monkeymedia.demo.Model.Entity.Connection;
import com.monkeymedia.demo.Model.Entity.ConnectionFieldValue;
import com.monkeymedia.demo.Model.Entity.FieldData;

@Repository
public interface ConnectionFieldValueRepository extends CrudRepository<ConnectionFieldValue, Integer> {

	@Query(value ="SELECT new com.monkeymedia.demo.Model.Entity.FieldData(f.name,cf.value) FROM Field f left join ConnectionFieldValue cf on f.id = cf.field where cf.connection = ?1")
		List<FieldData> findNameandValue(Connection gateway);

}
