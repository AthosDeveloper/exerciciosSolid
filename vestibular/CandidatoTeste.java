package vestibular;

import java.util.Scanner;

public class CandidatoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GerenciarCandidato g = new GerenciarCandidato();

        System.out.println("informe o número de sua matrícula:");
        int numero = sc.nextInt();
        System.out.println("agora, informe sua nota:");
        double nota = sc.nextDouble();
        System.out.println("agora, informe a quantidade de Candidatos:");
        int quantidade = sc.nextInt();
        g.adicionarCandidato(numero, nota, quantidade);
        System.out.println("deseja ver sua lista de candidatos, sim ou não?");
        String resposta = sc.next();
        g.exibirCandidatos(resposta);
        sc.close();

    }

}