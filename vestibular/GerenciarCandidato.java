package vestibular;

import estabelecimento.Produto;

import java.util.ArrayList;
import java.util.List;

public class GerenciarCandidato {
    private List<Candidatos> candidatos = new ArrayList<>();

    private int quantidade;

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarCandidato(int numeroMatricula, double nota, int quantidade){
        setQuantidade(quantidade);
        for (int i = 0; i < quantidade; i ++) {


            this.candidatos.add(new Candidatos(numeroMatricula, nota));
        }
    }

    public List<Candidatos> getCandidatos() {
        return candidatos;
    }

    public void excluirPeloNumero(int numeroMatricula){
        for (int i = 0; i < candidatos.size(); i ++) {
            if (candidatos.get(i).getNumeroMatricula().equals(numeroMatricula)) {
                candidatos.remove(i);
                break;
            }
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void exibirCandidatos(String resposta) {

        if (resposta.equals("sim")) {
            for (Candidatos candidato : candidatos) {
                System.out.println("número de matrícula:  " + candidato.getNumeroMatricula() + " nota: " + candidato.getNota() + " quantidade: " + getQuantidade());
            }
        }
    }


}
