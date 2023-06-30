package pais;

import java.text.DecimalFormat;
import java.util.List;

public class PaisesTeste {
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat();
        Pais brasil = new Pais("BRA", "Brasil", 8.514876);
        Pais argentina = new Pais("arg", "Argentina", 2.796427);
        Pais alemanha = new Pais("AL", "alemanha", 5.9836);
        Pais paraguai = new Pais("PRY", "Paraguai", 406752.0);

        brasil.getVizinhos().add(argentina);
brasil.getVizinhos().add(paraguai);
argentina.getVizinhos().add(brasil);
paraguai.getVizinhos().add(argentina);
  brasil.verificar(argentina);
  brasil.verificar(paraguai);
  argentina.verificar(paraguai);
        List<Pais> obtendoVizinhosComuns = brasil.mostrarVizinhoIncomum(argentina);
        System.out.println("vizinhos comuns entre Brasil e Argentina: ");
        for (Pais vizinho: obtendoVizinhosComuns){
            System.out.println(vizinho.getNome());

        }
        brasil.setPopulacao(203000000);
        System.out.println("A densidade do brasil é de:  " + d.format(brasil.obterDensidade()));

    }
}
