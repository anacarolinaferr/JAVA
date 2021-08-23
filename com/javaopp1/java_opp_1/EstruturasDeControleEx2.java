package com.javaopp1.java_opp_1;

public class EstruturasDeControleEx2 {

    public Double calculoAcrecimo(Long rg, Double montante){

        double totalComAcrecimo = 0;

        if(montante<0)
            totalComAcrecimo = 0;
        else if(montante<=20000)
            totalComAcrecimo = montante+(montante*0.2);
        else if(montante>20000 || montante<=45000)
            totalComAcrecimo = montante+(montante*0.1);
        else if(montante>45000)
            totalComAcrecimo = montante+(montante*0.05);

        return totalComAcrecimo;
    }

}
