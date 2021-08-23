package com.javaopp1;

import com.javaopp1.java_opp_1.EstruturasDeControleEx1;
import com.javaopp1.java_opp_1.EstruturasDeControleEx2;
import com.javaopp1.java_opp_1.IntroducaoJava;
import com.javaopp1.java_opp_1.model.Cliente;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //INTRODUÇÃO JAVA -----------------------------------

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


        //ESTRUTURA DE CONTROLE --------------------------------

        EstruturasDeControleEx1 objEstruturaDeControle = new EstruturasDeControleEx1();

        //------- Exercício 1 ---------------
        Scanner precoDeCustoEntrada  = new Scanner(System.in);
        System.out.println("Exercício 1 => Entre com o valor do produto!");
        double precoDeCusto = precoDeCustoEntrada.nextDouble();

        Scanner numfabricaEntrada  = new Scanner(System.in);
        System.out.println("Exercício 1 => Entre com o número da fábrica!");
        int numFabrica = numfabricaEntrada.nextInt();

        double precoDeVenda = objEstruturaDeControle.precoDeVendas(precoDeCusto,numFabrica);

        if(precoDeVenda == 0){
            System.out.println("O número da fábrica deve ser: 1,2 ou 3");
        }else{
            System.out.println(precoDeVenda);
        }

        //------- Exercício 2 ---------------

        EstruturasDeControleEx2 estruturasDeControleEx2 = new EstruturasDeControleEx2();

        Scanner rgEntrada  = new Scanner(System.in);
        System.out.println("Exercício 2 => Entre com o RG do funcionário!");
        long rg = rgEntrada.nextLong();

        Scanner montanteEntrada  = new Scanner(System.in);
        System.out.println("Exercício 2 => Entre com o valor montante!");
        double montante = montanteEntrada.nextDouble();

        double total = estruturasDeControleEx2.calculoAcrecimo(rg,montante);

        if(total == 0)
            System.out.println("Entre com um valor válido!");
        else {
            System.out.println(total);
        }

        //------- Exercício 3 ---------------

        int numCliente = 0, servico;
        String nome;

        List<Cliente> cliente = new ArrayList<Cliente>();

        do {
            Cliente cli = new Cliente();

            Scanner nomeEntrada  = new Scanner(System.in);
            System.out.println("Exercício 3 => Entre com o nome do cliente!");
            nome = nomeEntrada.next();
            cli.setNome(nome);

            Scanner servicoEntrada  = new Scanner(System.in);
            System.out.println("Exercício 3 => Entre com o número do serviço!");
            servico = servicoEntrada.nextInt();

            if(servico == 1){
                cli.setValor("1500,00");
            }else{
                cli.setValor("2200,00");
            }

            cliente.add(cli);
            numCliente++;

        }while(numCliente < 7);

        Cliente cliLista;
        Iterator<Cliente> itr = cliente.iterator();
        while (itr.hasNext()) {
            cliLista = itr.next();
            System.out.println("Nome do Cliente: "+cliLista.getNome()+" | Serviço: "+servico+" | Valor a Pagar: $"+cliLista.getValor());
        }

        //------- Exercício 4 ---------------

        String diarioA, diarioB, diarioC;

        int todos = 0, ac = 0, ab = 0, bc = 0, a = 0;

        for (int i = 0; i < 2; ++i) {
            Scanner resp  = new Scanner(System.in);
            System.out.println("Você é assinante do Diário A? Sim(s) ou NÃO(n)");
            diarioA = resp.next();
            System.out.println("Você é assinante do Diário B? Sim(s) ou NÃO(n)");
            diarioB = resp.next();
            System.out.println("Você é assinante do Diário C? Sim(s) ou NÃO(n)");
            diarioC = resp.next();

            if(diarioA.equals("s") && diarioB.equals("s") && diarioC.equals("s"))
                ++todos;
            else if(diarioA.equals("s") && diarioB.equals("n") && diarioC.equals("s"))
                ++ac;
            else if(diarioA.equals("s") && diarioB.equals("s") && diarioC.equals("n"))
                ++ab;
            else if(diarioA.equals("n") && diarioB.equals("s") && diarioC.equals("s"))
                ++bc;
            else if(diarioA.equals("s") && diarioB.equals("n") && diarioC.equals("n"))
                ++a;
        }

        System.out.println("São assinantes de todos os Diários: "+todos);
        System.out.println("São assinantes do Diário A E C:"+ ac);
        System.out.println("São assinantes do Diário A E B:"+ ab);
        System.out.println("São assinantes do Diário B E C:"+ bc);
        System.out.println("São assinantes do Diário A:"+ a);
    }
}
