package com.example.ex1devopsspring.controller;

import com.example.ex1devopsspring.model.Client;
import com.example.ex1devopsspring.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="/client")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/all")
    private Iterable<Client> getAllClient()
    {
        return clientRepository.findAll();
    }

//    @GetMapping("/find/{id}")
    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    private Optional<Client> getClientbyId(@PathVariable("id") int id)
    {
        return clientRepository.findById(id);
    }

    @GetMapping("/find/{nom}")
    private Optional<Client> getClientbyNom(@PathVariable("nom") String nom)
    {
        return clientRepository.findClientByNom(nom);
    }

    @PostMapping("/add")
    private int savegroup(@RequestBody Client client)
    {
        clientRepository.save(client);
        return client.getId();
    }

    @DeleteMapping("/delete/{id}")
    private void deleteGroup(@PathVariable("id") Integer id){
        clientRepository.deleteById(id);
    }

}
