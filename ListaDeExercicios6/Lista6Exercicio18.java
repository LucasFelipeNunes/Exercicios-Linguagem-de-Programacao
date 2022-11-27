/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um programa em
Java que permita a entrada das seguintes informações: a) o número total de mercadorias no estoque; b) o
valor de cada mercadoria. Ao final imprimir o valor total em estoque e a média de valor das mercadorias.*/
import java.util.Scanner;
public class Lista6Exercicio18{
	public static void main (String args[]){
		double valorTotal = 0, valorMercadoria = 0;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o numero total de mercadorias no estoque: ");
		int quantidadeMercadorias = ler.nextInt();
		for(int i = 1;i <= quantidadeMercadorias;i++){
			System.out.printf("Digite o valor da mercadoria %d: ", i);
			valorMercadoria = ler.nextDouble();
			valorTotal += valorMercadoria;
		}
		double mediaValores = valorTotal / quantidadeMercadorias;
		System.out.printf("O valor total em estoque e %f e a media de valor das mercadorias e %f", valorTotal, mediaValores);
	}
}
