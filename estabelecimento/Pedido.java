package estabelecimento;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Produto> produtos = new ArrayList<>();
    private int quantidade;

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarProduto(String nome, double preco, int quantidade){
        setQuantidade(quantidade);
        for (int i = 0; i < quantidade; i ++) {


            this.produtos.add(new Produto(nome, preco));
        }
    }

    public void excluirPeloNome(String nome){
        for (int i = 0; i < produtos.size(); i ++) {
            if (produtos.get(i).getNome().equals(nome)) {
                produtos.remove(i);
                break;
            }
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void exibirProdutos(String resposta) {

        if (resposta.equals("sim")) {
            for (Produto produto : produtos) {
                System.out.println("nome do produto: " + produto.getNome() + " preço: " + produto.getPreco() + " quantidade: " + getQuantidade());
            }
        }
    }


    }
