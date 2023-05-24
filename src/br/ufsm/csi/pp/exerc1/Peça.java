package br.ufsm.csi.pp.exerc1;

import java.text.Normalizer;

public class Peça implements FormaGeometrica, Forma3D{
    FormaGeometrica[] formaGeometricas;
    String identificacao;
    double peDireito;


    @Override
    public double calculoArea() {
        double areaTotal = 0;
        for (FormaGeometrica formaGeometrica: formaGeometricas){
            areaTotal = areaTotal + formaGeometrica.calculoArea();
        }
        return areaTotal;
    }

    @Override
    public double calculoVolume() {
        return calculoArea() * peDireito;
    }
}
