package com.prooduct.producto.services.impl;
import com.prooduct.producto.entity.Producto;
import com.prooduct.producto.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductoServiceimpl{
    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> getAll() {
        return productoRepository.findAll();
    }
    public Producto getProductById(int id){
        return productoRepository.findById(id).orElse(null);
    }
    public Producto save(Producto producto){
        Producto productoNew= productoRepository.save(producto);
        return productoNew;
    }
    public void deleteById(Integer id) {
        productoRepository.deleteById(id);
    }
    public Producto update(Producto producto) {
        return productoRepository.save(producto);
    }
}
