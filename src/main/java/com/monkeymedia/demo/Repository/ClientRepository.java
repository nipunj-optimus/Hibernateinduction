package com.monkeymedia.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.monkeymedia.demo.Model.Entity.Client;

public interface ClientRepository extends CrudRepository<Client, Integer>
{
	
}
