package com.example.cliente.controllers;
import com.example.cliente.services.impl.ClienteServiceimpl;
import com.example.cliente.entity.Cliente;
import com.example.cliente.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@CrossOrigin(origins="http://localhost:4200/")
public class ClienteController {
    @Autowired
    ClienteServiceimpl clienteService;
    @GetMapping
    public ResponseEntity<List<Cliente>> getAll(){
        List<Cliente>clientes=clienteService.getAll();
        if (clientes.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(clientes);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getById(@PathVariable ("id") int id){
        Cliente cliente=clienteService.getClientById(id);
        if (cliente == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(cliente);
    }
    @PostMapping
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
        Cliente clienteNew = clienteService.save(cliente);
        return ResponseEntity.ok(clienteNew);

    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        clienteService.deleteById(id);
        return "deleted user";
    }
    @PutMapping
    public ResponseEntity<Cliente> update(@RequestBody Cliente cliente) {
        Cliente clienteUpdate = clienteService.save(cliente);
        return ResponseEntity.ok(clienteUpdate);
    }

}
