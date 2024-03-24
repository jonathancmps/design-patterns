package com.design.patterns.demo.strategy.imposto;

import com.design.patterns.demo.model.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular (Orcamento orcamento);
}
