package com.design.patterns.demo.model;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quanditadeItens;

    public Orcamento(BigDecimal valor, int quanditadeItens) {
        this.valor = valor;
        this.quanditadeItens = quanditadeItens;
    }

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuanditadeItens() {
        return quanditadeItens;
    }
}
