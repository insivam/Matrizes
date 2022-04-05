/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

import java.util.Scanner;

public class MaiorVetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //
        int[] vetor = new int[5];
        int maior = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            vetor[i] = entrada.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("=====================");
        System.out.println("A maior nota é: " + maior);
        System.out.println("=====================");
        entrada.close();
    }
}