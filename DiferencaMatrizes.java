/*
 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
 * a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
 * das matrizes N1 e N2;
 * b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
 * posição das matrizes N1 e N2. 
 */
public class DiferencaMatrizes {

    public static void main(String[] args) {
        int[][] N1 = new int[4][6];
        int[][] N2 = new int[4][6];
        int[][] M1 = new int[4][6];
        int[][] M2 = new int[4][6];
        int temp;

        System.out.println("===================");
        System.out.println("     MATRIZ N1     ");
        System.out.println("===================");

        for (int c = 0; c < 4; c++) {
            System.out.print("|");
            for (int l = 0; l < 6; l++) {
                temp = (int) (Math.random() * 49) + 1;
                N1[c][l] = temp;
                if (temp < 10) {
                    System.out.print("0");
                }
                System.out.print(temp + "|");
            }
            System.out.println();
        }

        System.out.println("===================");
        System.out.println("     MATRIZ N2     ");
        System.out.println("===================");

        for (int c = 0; c < 4; c++) {
            System.out.print("|");
            for (int l = 0; l < 6; l++) {
                temp = (int) (Math.random() * 49) + 1;
                N2[c][l] = temp;
                if (temp < 10) {
                    System.out.print("0");
                }
                System.out.print(temp + "|");
            }
            System.out.println();
        }

        System.out.println("===================");
        System.out.println("     MATRIZ M1     ");
        System.out.println("===================");

        for (int c = 0; c < 4; c++) {
            System.out.print("|");
            for (int l = 0; l < 6; l++) {
                temp = M1[c][l] + N2[c][l];
                M1[c][l] = temp;
                if (temp < 10) {
                    System.out.print("0");
                }
                System.out.print(temp + "|");
            }
            System.out.println();
        }

        System.out.println("===================");
        System.out.println("     MATRIZ M2     ");
        System.out.println("===================");

        for (int c = 0; c < 4; c++) {
            System.out.print("|");
            for (int l = 0; l < 6; l++) {
                // temp recebe a diferença absoluta entre o elemento da matriz N1 e N2
                temp = Math.abs(N1[c][l] - N2[c][l]);
                M2[c][l] = temp;
                if (temp < 10) {
                    System.out.print("0");
                }
                System.out.print(temp + "|");
            }
            System.out.println();
        }
    }
}