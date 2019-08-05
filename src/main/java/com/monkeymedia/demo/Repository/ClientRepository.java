package com.monkeymedia.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.monkeymedia.demo.Model.Entity.Client;
@Repository
public interface ClientRepository extends CrudRepository<Client, Integer>
{

}
