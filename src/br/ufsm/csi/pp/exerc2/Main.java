package br.ufsm.csi.pp.exerc2;
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaPoupanca contaPoupanca = new ContaPoupanca("12345", "953345345",3400 ,false,0);

        ContaCorrente contaCorrente = new ContaCorrente("54321", "23784739404", 200, false, 500);
        FundoRendaFixa fundoRendaFixa = new FundoRendaFixa("98765", "0348903445", 1000,false, 0);
        FundoRendaVariavel fundoRendaVariavel = new FundoRendaVariavel("56789", "39487238342",10000, false, 0);

        banco.criarConta(contaPoupanca);
        banco.criarConta(contaCorrente);
        banco.criarConta(fundoRendaFixa);
        banco.criarConta(fundoRendaVariavel);

        banco.depositar(contaPoupanca, 500);
        banco.sacar(contaCorrente, 1000);
        banco.depositar(fundoRendaFixa, 1000);
        banco.sacar(fundoRendaVariavel, 2000);

        banco.emitirSaldo(contaPoupanca);
        banco.emitirSaldo(contaCorrente);
        banco.emitirSaldo(fundoRendaFixa);
        banco.emitirSaldo(fundoRendaVariavel);

    }
}