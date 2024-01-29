package com.kelsendev.desafio03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kelsendev.desafio03.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
