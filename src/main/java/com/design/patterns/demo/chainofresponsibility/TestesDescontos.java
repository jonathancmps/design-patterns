package com.design.patterns.demo.chainofresponsibility;

import com.design.patterns.demo.chainofresponsibility.desconto.CalculadorDeDescontos;
import com.design.patterns.demo.model.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {

        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);

        CalculadorDeDescontos calculadorDeDescontos = new CalculadorDeDescontos();

        System.out.println(calculadorDeDescontos.calcular(orcamento1));
        System.out.println(calculadorDeDescontos.calcular(orcamento2));
    }
}
