package com.nanuvem.metagui.server.sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nanuvem.metagui.server.sample.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
