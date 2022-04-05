/* Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
 * que gere aleatoriamente um vetor com os lançamentos, escreva esse vetor. A seguir determine e
 * imprima a média aritmética dos lançamentos, contabilize e apresente também
 * quantas foram as ocorrências da maior pontuação.
 */

/*
programa
{
	inclua biblioteca Util --> u
	inclua biblioteca Texto --> tx
	
	funcao inicio()
	{
		cadeia espaco
		inteiro lista[10], maior = 0, c = 0, valor, i
		real media = 0.0

		// Bonitin
		escreva("===================================\n")
		escreva("        LANÇAMENTO DE DADOS        \n")
		escreva("===================================\n")

		
		para(i = 0 ; i < 10 ; i++){ 
			valor = u.sorteia(1, 6) // faz o sorteio de numeros
			lista[i] = valor // Coloca o número sorteado na lista
			media += valor // adiciona o valor sorteado na media
			se(valor > maior){ 
				maior = valor // verifica e atualiza a variavel maior
			}

			// Formata o texto e mostra na tela
			espaco = tx.preencher_a_esquerda(' ', 9, "")
			se(i+1 < 10){
				espaco = tx.preencher_a_esquerda(' ', 10, "")
			}
			
			escreva(espaco, i+1, "º dado: ", valor, "\n")
			
		}
		// Calcula quantidade de vezes o maior número foi sorteado
		para(i = 0 ; i < 10 ; i++){
			se(lista[i] == maior){
				c++
			}
		}

		// Mostra os valores previamentes calculados na tela
		escreva("\n===================================\n")
		escreva("A média dos números do dado foi ", media/10)
		escreva("\nO maior número foi: ", maior)
		escreva("\nO maior número ocorreu ", c, " vezes")
		escreva("\n===================================\n")
		
	}

}
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