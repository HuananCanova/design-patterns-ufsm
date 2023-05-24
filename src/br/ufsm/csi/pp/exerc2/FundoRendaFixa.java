package br.ufsm.csi.pp.exerc2;

public class FundoRendaFixa extends Conta{

    public FundoRendaFixa(String numero, String cpfTitular, double saldo, boolean especial, double limite) {
        super(numero, cpfTitular, saldo, especial, limite);
    }

    @Override
    public double calcularImpostoDevido() {
        double rendimento = 0;
        for (Movimentacao movimentacao: getMovimentacaoList()){
            if (movimentacao.isRendimento()){
                rendimento += movimentacao.getValor();
            }
        }
        double imposto = rendimento * 0.275;
        return imposto;
    }

    @Override
    public void atualizarRendimento() {

    }

    @Override
    public String getTipoConta() {
        return "Fundo de Renda Fixa";
    }
}
