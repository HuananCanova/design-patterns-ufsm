package br.ufsm.csi.pp.exerc2;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    private String numero;
    private String cpfTitular;
    private double saldo;
    private boolean especial;
    private double limite;
    private List<Movimentacao> movimentacaoList;

    public Conta(String numero, String cpfTitular, double saldo, boolean especial, double limite) {
        this.numero = numero;
        this.cpfTitular = cpfTitular;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
        this.movimentacaoList = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public double getLimite() {
        return limite;
    }

    public List<Movimentacao> getMovimentacaoList() {
        return movimentacaoList;
    }

    public void depositar(double valor){
        saldo += valor;
        Movimentacao movimentacao = new Movimentacao("deposito: ", valor, Movimentacao.TipoMovimentacao.CREDITO);
        movimentacaoList.add(movimentacao);
    }

    public boolean sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            Movimentacao movimentacao = new Movimentacao("Saque", valor, Movimentacao.TipoMovimentacao.DEBITO);
            return true;
        }else{
            System.out.println("Saldo insuficiente para saque!\n" +"Saldo: "+ saldo + "< valor de saque: " + valor);
        }
        return false;
    }

    public abstract double calcularImpostoDevido();

    public abstract void atualizarRendimento();

    public abstract String getTipoConta();


}
