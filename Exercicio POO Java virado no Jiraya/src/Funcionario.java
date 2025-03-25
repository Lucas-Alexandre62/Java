public class Funcionario{
    String nome;
    int idade;
    double salario[] = new double[3];

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salários: "+ salario[0] + ", " + salario[1] + ", " + salario[2]);
    }

    public void mediaSalarios(){
        double media = (salario[0]+salario[1]+salario[2])/3;
        System.out.println("Média salarial: " + media);
    }
}