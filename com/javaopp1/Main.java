package com.javaopp1;

import com.javaopp1.java_opp_1.IntroducaoJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //INTRODUÇÃO JAVA

        IntroducaoJava objIntroducao = new IntroducaoJava();

        //------- Exercício 1 ---------------
        System.out.println("EXERCÍCIO 1 => " + objIntroducao.exercicio1());

        //------- Exercício 2 ---------------
        System.out.println("EXERCÍCIO 2 => " + objIntroducao.exercicio2());

        //------- Exercício 3 ---------------
        Scanner entrada  = new Scanner(System.in);
        System.out.println("EXERCÍCIO 3 => Entre com o número de dias!");
        int numDias = entrada.nextInt();
        System.out.println("O valor total da campanha é: $"+objIntroducao.exercicio3(numDias).toString()+" dólares");

        //------- Exercício 4 ---------------
        Scanner premio  = new Scanner(System.in);
        System.out.println("EXERCÍCIO 4 => Entre o valor do prêmio!");
        double valorPremio = premio.nextDouble();
        System.out.println("O Valor do Prêmio é: "+objIntroducao.exercicio4(valorPremio)+" dólares");
    }
}
