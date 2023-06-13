package com.prooduct.producto.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String nombre;
        private String descripcion;
        private String codigo;
        private double precio;
        private int stock;
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "categoria_id")
        @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
        private Categoria categoria;

}
