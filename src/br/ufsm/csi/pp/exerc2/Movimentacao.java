package br.ufsm.csi.pp.exerc2;

public class Movimentacao {

    private String descricao;
    private double valor;
    private TipoMovimentacao tipoMovimentacao;

    public enum TipoMovimentacao { CREDITO, DEBITO, RENDIMENTO_FINANCEIRO }

    public Movimentacao(String descricao, double valor, TipoMovimentacao tipoMovimentacao) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public TipoMovimentacao getTipoMovimentacao() {
        return tipoMovimentacao;
    }
    public boolean isCredito() {
        return tipoMovimentacao == TipoMovimentacao.CREDITO;
    }

    public boolean isDebito() {
        return tipoMovimentacao == TipoMovimentacao.DEBITO;
    }

    public boolean isRendimento() {
        return tipoMovimentacao == TipoMovimentacao.RENDIMENTO_FINANCEIRO;
    }
}
