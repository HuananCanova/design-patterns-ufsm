package br.ufsm.csi.pp.exerc1;

public class Imovel implements FormaGeometrica, Forma3D{
    private Peça[] pecas;
    private String identificacao;
    private String proprietario;
    private String endereco;
    private TipoUso tipoUso;


    @Override
    public double calculoVolume() {
        return calculoArea() * calculoVolume();
    }

    @Override
    public double calculoArea() {
        double areaTotal = 0;
        for (FormaGeometrica formaGeometrica : pecas){
            areaTotal = areaTotal + formaGeometrica.calculoArea();
        }
        return areaTotal;
    }
}
