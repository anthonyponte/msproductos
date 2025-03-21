package com.anthonyponte.msproductos.service;

import java.util.List;
import java.util.Optional;

import com.anthonyponte.msproductos.model.Producto;

public interface IProductoService {
    List<Producto> findAll();

    Optional<Producto> findById(Integer id);

    Producto save(Producto client);

    void deleteById(Integer id);
}
