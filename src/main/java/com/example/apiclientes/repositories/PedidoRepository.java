package com.example.apiclientes.repositories;

import com.example.apiclientes.entities.Pedido;
import com.example.apiclientes.utils.GenerateID;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PedidoRepository {
    List<Pedido> pedidos = new ArrayList<>();

    public List<Pedido> findAll() {
        return pedidos;
    }

    public Pedido findById(Long id) {
        Optional<Pedido> result = pedidos.stream().filter(pedido -> pedido.getId() == 1).findFirst();

        return result.orElse(null);
    }

    public Pedido create(Pedido pedido) {
        pedido.setId(GenerateID.generateIDPedido());
        pedidos.add(pedido);
        return pedido;
    }

    public Pedido update(Long id, Pedido pedido) {
        Optional<Pedido> result = pedidos.stream().filter(p -> p.getId() == 1).findFirst();

        result.get().setValorTotal(pedido.getValorTotal());
        result.get().setPordutos(pedido.getProdutos());

        return result.orElse(null);
    }

    public Pedido destroy(Long id) {
        Optional<Pedido> result = pedidos.stream().filter(p -> p.getId() == 1).findFirst();

        pedidos.remove(result.get());

        return result.orElse(null);
    }
}
