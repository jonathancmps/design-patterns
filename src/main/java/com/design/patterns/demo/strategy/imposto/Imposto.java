package com.design.patterns.demo.strategy.imposto;

import com.design.patterns.demo.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular (Orcamento orcamento);
}
