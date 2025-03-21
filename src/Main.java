import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        String[] nomeAlunos = new String[5];
        int[] idadeAlunos = new int[5];
        for(int i = 0; i < nomeAlunos.length; i++){

            System.out.println("Digite o nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.println("Digite a idade do aluno: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            aluno.setIdade(idade);
            nomeAlunos[i] = aluno.getNome();
            idadeAlunos[i] = aluno.getIdade();

        }
        
        System.out.println(Arrays.toString(nomeAlunos));
        System.out.println(Arrays.toString(idadeAlunos));
        scanner.close();
        
    }
}
