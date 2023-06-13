package com.example.venta.dto;
import lombok.Data;

@Data
public class Producto {
    private Integer id;
    private String nombre;
    private String descripcion;
    private String codigo;
    private double precio;
    private int stock;
    private Categoria categoria;
}
