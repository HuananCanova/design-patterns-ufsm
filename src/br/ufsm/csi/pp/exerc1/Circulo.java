package br.ufsm.csi.pp.exerc1;

public class Circulo implements FormaGeometrica{

    private final double PI = 3.14159;
    private double raio;
    private double grausCirculo;

    public Circulo(double raio) {
        this.raio = raio;
        this.grausCirculo = 360;
    }


    @Override
    public double calculoArea() {
        return PI * (raio*raio);
    }
}
