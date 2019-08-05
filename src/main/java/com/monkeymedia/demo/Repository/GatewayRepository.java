package com.monkeymedia.demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.monkeymedia.demo.Model.Entity.Connection;
import com.monkeymedia.demo.Model.Entity.Gateway;

@Repository
public interface GatewayRepository extends CrudRepository<Gateway, Integer> {

//	List<Gateway> findByGatewayId(Gateway gateway);
}
