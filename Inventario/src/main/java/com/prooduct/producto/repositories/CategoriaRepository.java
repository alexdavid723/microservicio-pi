package com.prooduct.producto.repositories;
import com.prooduct.producto.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
