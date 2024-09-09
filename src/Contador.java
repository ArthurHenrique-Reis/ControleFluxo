import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Solicitando os parâmetros
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Exibindo a mensagem de erro caso a exceção seja lançada
            System.out.println(exception.getMessage());
        }

        terminal.close();
    }

    // Método que contém a lógica de contagem
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se o primeiro parâmetro é maior que o segundo e lança a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula a quantidade de interações com base na diferença entre os dois parâmetros
        int contagem = parametroDois - parametroUm;

        // Realiza o loop para imprimir os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
