package com.utmc.inventory.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.utmc.inventory.model.Items;

//@Repository
public interface InventoryRepo extends CassandraRepository<Items, Integer>{

}
