package br.ufsm.csi.pp.testes;

public class Quadrado {
    private double lado;
    private double peDireito;

    public Quadrado(double lado, double peDireito) {
        this.lado = lado;
        this.peDireito = peDireito;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularVolume() {
        return calcularArea() * peDireito;
    }
}

