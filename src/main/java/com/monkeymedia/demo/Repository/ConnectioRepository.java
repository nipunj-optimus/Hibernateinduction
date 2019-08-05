package com.monkeymedia.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.monkeymedia.demo.Model.Entity.Connection;

@Repository
public interface ConnectioRepository extends CrudRepository<Connection, Integer> {

	Connection findByKeyAndSecret(String key, String secret);

}
