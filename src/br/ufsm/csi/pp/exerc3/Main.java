package br.ufsm.csi.pp.exerc3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Criação do banco utilizando a interface Map
        Map<String, ContaBancaria> banco = new HashMap<>();

        // Criação e inserção de 10.000 contas no banco
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 10000; i++) {
            String numeroConta = "Conta-" + i;
            double saldoInicial = i * 1000; // Exemplo: Conta-1 tem saldo 1000, Conta-2 tem saldo 2000, e assim por diante
            ContaBancaria conta = new ContaBancaria(numeroConta, saldoInicial);
            banco.put(numeroConta, conta);
        }
        long endTime = System.currentTimeMillis();
        long tempoInsercao = endTime - startTime;
        System.out.println("Tempo de inserção: " + tempoInsercao + "ms");

        // Percorrer as contas no banco
        startTime = System.currentTimeMillis();
        for (Map.Entry<String, ContaBancaria> entry : banco.entrySet()) {
            String numeroConta = entry.getKey();
            ContaBancaria conta = entry.getValue();
            // Fazer alguma operação com a conta (exemplo: imprimir o número da conta e o saldo)
            System.out.println("Número da conta: " + numeroConta + ", Saldo: " + conta.getSaldo());
        }
        endTime = System.currentTimeMillis();
        long tempoPercorrer = endTime - startTime;
        System.out.println("Tempo de percorrimento: " + tempoPercorrer + "ms");

        // Buscar as contas no banco
        startTime = System.currentTimeMillis();
        for (int i = 1; i <= 10000; i++) {
            String numeroConta = "Conta-" + i;
            ContaBancaria conta = banco.get(numeroConta);
            // Fazer alguma operação com a conta (exemplo: imprimir o número da conta e o saldo)
            System.out.println("Número da conta: " + numeroConta + ", Saldo: " + conta.getSaldo());
        }
        endTime = System.currentTimeMillis();
        long tempoBusca = endTime - startTime;
        System.out.println("Tempo de busca: " + tempoBusca + "ms");
    }
}
