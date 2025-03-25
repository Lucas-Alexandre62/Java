import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos alunos deseja cadastrar? ");
        int qtdAluno = scanner.nextInt();
        scanner.nextLine();
        Aluno[] alunos = new Aluno[qtdAluno];

        for(int i = 0; i < qtdAluno; i++){
            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.println("Digite a idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite a turma: ");
            String turma = scanner.nextLine();

            alunos[i] = new Aluno(i, nome, idade, turma);

        }
        System.out.println("\n--- ALUNOS CADASTRADOS ---");
        for (Aluno aluno : alunos) {
            System.out.println("\nID: " + aluno.Id);
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Idade: " + aluno.idade);
            System.out.println("Turma: " + aluno.turma);
        }


    }
}
