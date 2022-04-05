/* Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
 * que gere aleatoriamente um vetor com os lançamentos, escreva esse vetor. A seguir determine e
 * imprima a média aritmética dos lançamentos, contabilize e apresente também
 * quantas foram as ocorrências da maior pontuação.
 */

public class InfoDados {

    public static void main(String[] args) {
        int[] lista = new int[10];
        int maior = 0, c = 0, valor, i;
        double media = 0.0;

        // Bonitin
        System.out.println("===================================");
        System.out.println("        LANÇAMENTO DE DADOS        ");
        System.out.println("===================================");

        // Sorteia os valores e coloca na lista
        for (i = 0; i < 10; i++) {
            valor = (int) (Math.random() * 6) + 1;
            lista[i] = valor;
            media += valor;
            if (valor > maior) {
                maior = valor;
            }

            // Formata o texto e mostra na tela
            if (i + 1 < 10)
                System.out.print("            ");
            else
                System.out.print("           ");

            System.out.println((i + 1) + "º dado: " + valor);
        }

        // Calcula quantidade de vezes o maior número foi sorteado
        for (i = 0; i < 10; i++) {
            if (lista[i] == maior) {
                c++;
            }
        }

        // Mostra os valores previamentes calculados na tela
        System.out.println("\n===================================");
        System.out.println("A média dos números do dado foi " + (media / 10));
        System.out.println("O maior número foi: " + maior);
        System.out.println("O maior número ocorreu " + c + " vezes");
        System.out.println("===================================");
    }
}
