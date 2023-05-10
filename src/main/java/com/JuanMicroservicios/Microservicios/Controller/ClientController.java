package com.JuanMicroservicios.Microservicios.Controller;

import com.JuanMicroservicios.Microservicios.Model.veterinary_client;
import com.JuanMicroservicios.Microservicios.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;
    @GetMapping (value = "/clients")
    public List<veterinary_client> getClients(){
        return clientRepository.findAll();
    }

    @PostMapping (value = "/saveClient")
    public String saveClient(@RequestBody veterinary_client client){
        clientRepository.save(client);
        return "Saved Client";
    }
    @PutMapping (value = "/updateClient/{id}")
    public String updateClient(@PathVariable Integer id, @RequestBody veterinary_client client){
        veterinary_client updateClient = clientRepository.findById(id).get();
        updateClient.setName(client.getName());
        updateClient.setLast_name(client.getLast_name());
        updateClient.setEmail(client.getEmail());
        updateClient.setPhone(client.getPhone());
        updateClient.setVerinary_id(client.getVerinary_id());
        updateClient.setDocument(client.getDocument());
        updateClient.setGlobal_id(client.getGlobal_id());
        clientRepository.save(updateClient);
        return "Update Client";
    }

    @DeleteMapping(value = "/deleteClient/{id}")
    public String deleteClient(@PathVariable Integer id){
        veterinary_client deleteClient = clientRepository.findById(id).get();
        clientRepository.delete(deleteClient);
        return "Deleted Client";
    }

}
