package com.utmc.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
public class InventorySvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventorySvcApplication.class, args);
	}

}
