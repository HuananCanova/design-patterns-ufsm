package br.ufsm.csi.pp.exerc2;

import java.util.List;

public class ContaCorrente extends Conta{

    public ContaCorrente(String numero, String cpfTitular, double saldo, boolean especial, double limite) {
        super(numero, cpfTitular, saldo, especial, limite);
    }

    @Override
    public double calcularImpostoDevido() {
        return 0;
    }

    @Override
    public void atualizarRendimento() {

    }

    @Override
    public String getTipoConta() {
        return "Conta Corrente";
    }
}
