package com.example.ex1devopsspring.repository;

import com.example.ex1devopsspring.model.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClientRepository extends CrudRepository<Client, Integer> {
        Optional<Client> findClientByNom(String Nom);

}
