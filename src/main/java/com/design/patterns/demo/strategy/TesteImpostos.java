package com.design.patterns.demo.strategy;

import com.design.patterns.demo.strategy.imposto.CalculadorDeImpostos;
import com.design.patterns.demo.strategy.imposto.ICMS;
import com.design.patterns.demo.strategy.imposto.ISS;
import com.design.patterns.demo.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadorDeImpostos calculadora = new CalculadorDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ISS()));

        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}
