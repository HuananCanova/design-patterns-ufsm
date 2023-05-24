package br.ufsm.csi.pp.exerc2;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    public List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void criarConta(Conta conta) {
        contas.add(conta);
    }

    public void excluirConta(Conta conta) {
        contas.remove(conta);
    }

    public boolean sacar(Conta conta, double valor) {
        return conta.sacar(valor);
    }

    public void depositar(Conta conta, double valor) {
        conta.depositar(valor);
    }

    public void emitirSaldo(Conta conta) {
        System.out.println("Saldo da conta " + conta.getNumero() + ": " + conta.getSaldo());
    }

}
