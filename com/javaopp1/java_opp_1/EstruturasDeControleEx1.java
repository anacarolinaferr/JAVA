package com.javaopp1.java_opp_1;

public class EstruturasDeControleEx1 {

    public Double precoDeVendas(Double precoDeCusto,Integer fabrica){

        double custoEnvio = 0, precoDeVenda, lucro;

        switch (fabrica){
            case 1: custoEnvio = precoDeCusto * 0.07;
            break;
            case 2: custoEnvio = precoDeCusto * 0.15;
            break;
            case 3: custoEnvio = precoDeCusto * 0.22;
            break;
            default: custoEnvio = 0;
        }

        if(custoEnvio!=0){
            lucro = (precoDeCusto + custoEnvio) * 0.25;
            precoDeVenda = precoDeCusto + custoEnvio + lucro;
        }else{
            precoDeVenda = 0;
        }

        return precoDeVenda;
    }

}
