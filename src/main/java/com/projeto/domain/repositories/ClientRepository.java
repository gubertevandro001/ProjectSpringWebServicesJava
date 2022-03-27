package com.projeto.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.domain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	
	

}
