package br.ufsm.csi.pp.exerc1;

public class Quadrado implements FormaGeometrica{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculoArea() {
        return lado * lado;
    }
}
