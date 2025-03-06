import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;
        int tentativas = 0;

        System.out.println("========================================");
        System.out.println("      Bem-vindo ao Jogo de Adivinhação! ");
        System.out.println("========================================");
        System.out.println("Tente adivinhar o número entre 1 e 100.");
        System.out.println("Digite '0' para sair do jogo.");
        System.out.println("========================================");

        do {
            System.out.print("\nDigite seu palpite: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa == 0) {
                System.out.println("Você escolheu sair do jogo. O número secreto era " + numeroSecreto + ". Até a próxima!");
                break;
            }
            
            if (tentativa < numeroSecreto) {
                System.out.println("\uD83D\uDD3B Muito baixo! Tente novamente.");
            } else if (tentativa > numeroSecreto) {
                System.out.println("\uD83D\uDD3A Muito alto! Tente novamente.");
            } else {
                System.out.println("\n\u2728 Parabéns! Você acertou o número " + numeroSecreto + " em " + tentativas + " tentativas! \u2728");
            }
        } while (tentativa != numeroSecreto);

        System.out.println("\nObrigado por jogar! Até a próxima!\n");
        scanner.close();
    }
}
