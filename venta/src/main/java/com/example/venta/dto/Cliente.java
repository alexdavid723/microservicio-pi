package com.example.venta.dto;

import lombok.Data;

@Data
public class Cliente {
    private Integer id;
    private String nombres;
    private String apellidos;
    private String dni;
    private String sexo;
    private String direccion;
    private String telefono;
}
