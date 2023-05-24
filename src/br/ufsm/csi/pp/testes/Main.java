package br.ufsm.csi.pp.testes;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(20, 10);

        double areaTotal = quadrado.calcularArea();
        double volumeTotal = quadrado.calcularVolume();

        System.out.println("Área total do quadrado: " + areaTotal + " metros quadrados");
        System.out.println("Volume total do quadrado: " + volumeTotal + " metros cúbicos");
    }
}

