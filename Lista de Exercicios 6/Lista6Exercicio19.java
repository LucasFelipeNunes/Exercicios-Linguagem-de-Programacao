/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um programa em
Java que permita a entrada das seguintes informações: a) o número total de mercadorias no estoque; b) o
valor de cada mercadoria. Ao final imprimir o valor total em estoque e a média de valor das mercadorias.*/
import java.util.Scanner;
public class Lista6Exercicio19{
	public static void main (String args[]){

		double valorTotal = 0, valorMercadoria = 0;
		Scanner ler = new Scanner(System.in);
		Scanner lerString = new Scanner(System.in);
		int quantidadeMercadorias = 0;
		boolean maisMercadorias = false;
		do {
			System.out.print("Digite o valor da mercadoria: ");
			valorMercadoria = ler.nextDouble();
			valorTotal += valorMercadoria;
			quantidadeMercadorias++;
			System.out.print("Mais Mercadorias? (S/N): ");
			maisMercadorias = lerString.next().equals("S");
		} while (maisMercadorias);
		
		

		double mediaValores = valorTotal / quantidadeMercadorias;
		System.out.printf("O valor total em estoque e %.2f e a media de valor das mercadorias e %.2f", valorTotal, mediaValores);
	}
}
