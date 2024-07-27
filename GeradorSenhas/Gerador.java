package GeradorSenhas;

import java.util.Random;
import java.util.Scanner;

public class Gerador {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("**********************************");
        System.out.println(" BEM VINDO AO GERADOR DE SENHAS");
        System.out.println("**********************************");

        System.out.print("Digite a quantidade de números para gerar: ");
        int numberOfRandomNumbers = scanner.nextInt();

        System.out.print("Digite a quantidade de letras que gostaria: ");
        int numberOfRandomLetters = scanner.nextInt();

        StringBuilder randomLetters = new StringBuilder();
        StringBuilder randomNumbers = new StringBuilder();

        for (int i = 0; i < numberOfRandomLetters; i++) {
            char randomLetter = (char) (random.nextInt(26) + 'a');
            randomLetters.append(randomLetter);
        }

        for (int i = 0; i < numberOfRandomNumbers; i++) {
            int randomNumber = random.nextInt(10); // Generate a random digit between 0 and 9
            randomNumbers.append(randomNumber);
        }

        StringBuilder password = new StringBuilder();
        password.append(randomNumbers).append(randomLetters);
        System.out.println("Senha Gerada: " + password.toString());

    }
}
