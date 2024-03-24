package com.design.patterns.demo.chainofresponsability.desconto;

import com.design.patterns.demo.model.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return null;
    }
}
