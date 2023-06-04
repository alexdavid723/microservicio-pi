package com.example.cliente.services.impl;

import com.example.cliente.entity.Cliente;
import com.example.cliente.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceimpl {
    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }
    public Cliente getClientById(int id){
        return clienteRepository.findById(id).orElse(null);
    }
    public Cliente save(Cliente cliente){
        Cliente clienteNew= clienteRepository.save(cliente);
        return clienteNew;
    }
    public void deleteById(Integer id) {
        clienteRepository.deleteById(id);
    }
    public Cliente update(Cliente cliente) {
        return clienteRepository.save(cliente);
    }




}
