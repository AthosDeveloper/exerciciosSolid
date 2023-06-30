package estabelecimento;

import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pedido pedido = new Pedido();

        System.out.println("informe o nome do seu pedido:");
        String nome = sc.next();
        System.out.println("agora, informe o preço do produto:");
        double preco = sc.nextDouble();
        System.out.println("agora, informe a quantidade de produtos:");
        int quantidade = sc.nextInt();
        pedido.adicionarProduto(nome, preco, quantidade);
        System.out.println("deseja ver sua lista de produtos, sim ou não?");
        String resposta = sc.next();
        pedido.exibirProdutos(resposta);
  sc.close();
    }
}
