package com.design.patterns.demo.chainofresponsability.desconto;

import com.design.patterns.demo.model.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto{

    public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getValor().compareTo(new BigDecimal("500"))>0)  {
            return orcamento.getValor().multiply(new BigDecimal("0.5"));
        }

        return proximo.calcular(orcamento);
    }
}
