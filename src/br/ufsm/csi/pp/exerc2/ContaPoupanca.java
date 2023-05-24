package br.ufsm.csi.pp.exerc2;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String numero, String cpfTitular, double saldo, boolean especial, double limite) {
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
        return "Conta Poupança";
    }
}
