package com.prooduct.producto.controllers;
import com.prooduct.producto.services.impl.ProductoServiceimpl;
import com.prooduct.producto.entity.Producto;
import com.prooduct.producto.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoServiceimpl productoService;
    @GetMapping
    public ResponseEntity<List<Producto>> getAll(){
        List<Producto>productos=productoService.getAll();
        if (productos.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(productos);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Producto> getById(@PathVariable("id") int id){
        Producto producto=productoService.getProductById(id);
        if (producto == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(producto);
    }
    @PostMapping
    public ResponseEntity<Producto> save(@RequestBody Producto producto){
        Producto productoNew = productoService.save(producto);
        return ResponseEntity.ok(productoNew);

    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        productoService.deleteById(id);
        return "deleted product";
    }
    @PutMapping
    public ResponseEntity<Producto> update(@RequestBody Producto producto) {
        Producto productoUpdate = productoService.save(producto);
        return ResponseEntity.ok(productoUpdate);
    }
}
