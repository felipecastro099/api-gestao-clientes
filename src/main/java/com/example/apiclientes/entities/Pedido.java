package com.example.apiclientes.entities;

import java.util.List;

public class Pedido {
    private Long id;
    private Double valorTotal;
    private List<Produto> produtos;

    public Pedido(Long id, Double valorTotal, List<Produto> produtos) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.produtos = produtos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setPordutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
