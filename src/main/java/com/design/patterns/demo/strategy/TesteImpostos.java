package com.design.patterns.demo.strategy;

import com.design.patterns.demo.strategy.imposto.CalculadorDeImpostos;
import com.design.patterns.demo.strategy.imposto.ICMS;
import com.design.patterns.demo.strategy.imposto.ISS;
import com.design.patterns.demo.model.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        System.out.println(calculadorDeImpostos.calcular(orcamento, new ISS()));
        System.out.println(calculadorDeImpostos.calcular(orcamento, new ICMS()));
    }
}
