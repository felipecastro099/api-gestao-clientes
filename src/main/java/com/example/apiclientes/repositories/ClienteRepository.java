package com.example.apiclientes.repositories;

import com.example.apiclientes.entities.Cliente;
import com.example.apiclientes.entities.Pedido;
import com.example.apiclientes.entities.Produto;
import com.example.apiclientes.utils.GenerateID;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();

    public Cliente addClient(Cliente cliente) {
        cliente.setId(GenerateID.generateIDCliente());
        produtos.add(new Produto(GenerateID.generateIDProduto(), "Caneta", "Branco", 1, 20.0));
        pedidos.add(new Pedido(GenerateID.generateIDPedido(), 20.0, produtos));
        cliente.setPedidos(pedidos);
        clientes.add(cliente);
        return cliente;
    }

    public Cliente findById(Long id) {
        Optional<Cliente> cliente = clientes.stream().filter(c -> c.getId() == id).findFirst();

        System.out.println(cliente);

        return cliente.orElse(null);
    }
}
