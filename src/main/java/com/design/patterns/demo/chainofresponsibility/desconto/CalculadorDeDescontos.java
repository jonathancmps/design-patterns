package com.design.patterns.demo.chainofresponsibility.desconto;

import com.design.patterns.demo.model.Orcamento;

import java.math.BigDecimal;

public class CalculadorDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                    new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
