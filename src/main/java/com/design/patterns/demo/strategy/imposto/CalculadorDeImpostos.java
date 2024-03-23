package com.design.patterns.demo.strategy.imposto;

import com.design.patterns.demo.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadorDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}
