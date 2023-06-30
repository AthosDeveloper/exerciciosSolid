package pais;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pais {
    private String codigoIso;
    private String nome;
    private double populacao;
    private double dimensao;

   private List<Pais> vizinhos = new ArrayList<>();
    public Pais(String codigoIso, String nome, double dimensao){
        this.codigoIso = codigoIso;
        this.nome = nome;
   this.dimensao = dimensao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pais pais = (Pais) o;

        if (Double.compare(pais.populacao, populacao) != 0) return false;
        if (Double.compare(pais.dimensao, dimensao) != 0) return false;
        if (!Objects.equals(codigoIso, pais.codigoIso)) return false;
        if (!Objects.equals(nome, pais.nome)) return false;
        return Objects.equals(vizinhos, pais.vizinhos);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = codigoIso != null ? codigoIso.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        temp = Double.doubleToLongBits(populacao);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(dimensao);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (vizinhos != null ? vizinhos.hashCode() : 0);
        return result;
    }

    public List<Pais> getVizinhos() {
        return vizinhos;
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public  double obterDensidade(){
        double densidade = populacao *dimensao;
        return  densidade;
    }


    public List<Pais> mostrarVizinhoIncomum(Pais outroVizinho) {
       List<Pais> vizinhosComuns = new ArrayList<>();
for (Pais vizinho: vizinhos){
    if (outroVizinho.getVizinhos().contains(vizinho)){ vizinhosComuns.add(vizinho);
    }
}
return  vizinhosComuns;
    }
    public  boolean eVizinho(Pais outroPais){
        this.getVizinhos().add(outroPais);
        return  vizinhos.contains(outroPais);
    }
    public  void verificar(Pais outroPais){
        if (eVizinho(outroPais)){
            System.out.println("o país " + outroPais.getNome() + " é vizinho.");
        } else {
            System.out.println("Não é vizinho.");


        }


    }

    @Override
    public String toString(){
        return "Código iso: " + getCodigoIso() + " Nome: " + getNome() + " dimensão: " + getDimensao();
    }
}
