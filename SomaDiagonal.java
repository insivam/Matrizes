/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
 * e
 * em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
 * diagonal, ou seja, diagonal principal.
 */

public class SomaDiagonal {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int soma = 0, somaDiagonal = 0, temp;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(System.console().readLine());
                soma += matriz[i][j];
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("===========");
        System.out.println(" MATRIZ M2 ");
        System.out.println("===========");

        for (int c = 0; c < 3; c++) {
            System.out.print("|");
            for (int l = 0; l < 3; l++) {
                temp = matriz[c][l];
                if (temp < 10) {
                    System.out.print("0");
                }
                System.out.print(temp + "|");
            }
            System.out.println();
        }

        System.out.println("\n===============================================");
        System.out.println("A soma dos valores da matriz é: " + soma);
        System.out.println("A soma dos valores da diagonal principal é: " + somaDiagonal);
        System.out.println("===============================================");
    }
}