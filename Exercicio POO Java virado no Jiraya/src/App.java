public class App {
    public static void main(String[] args) throws Exception {
        
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João";
        funcionario.idade = 25;
        funcionario.salario = new double[]{1000, 2000, 3000};

        funcionario.imprimirDados();
        funcionario.mediaSalarios();

    }
}
