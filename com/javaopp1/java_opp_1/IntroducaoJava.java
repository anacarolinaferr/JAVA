package com.javaopp1.java_opp_1;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class IntroducaoJava {
    public String exercicio1() {
        String apelido = "Gomez";
        int idade = 35;
        boolean valor = false;
        double saldo = 45857.90;
        String nome = "Julián";

        return "Variáveis verificadas e corrigidas";
    }

    public String exercicio2(){
//        String 1nome;
        int idade;
//        double $aldo;
//        String @pellido;
        String direcao;
//        boolean carteira de motorista;
//        double altura da pessoa;
//        int quantidade-de-filhos;

        return "Variáveis corretas: idade e direcao";
    }

    public Integer exercicio3(Integer numDias) {
        int total = 2 * numDias;
        return total;
    }

    public String exercicio4(Double premio){
        double valorImpostos = (2.45d+15d+3d)/100d;
        double totalPremio = premio*valorImpostos;
        DecimalFormat df = new DecimalFormat(".##");
        df.setRoundingMode(RoundingMode.DOWN);
        String resultado = df.format(totalPremio);
        return resultado;
    }
}
