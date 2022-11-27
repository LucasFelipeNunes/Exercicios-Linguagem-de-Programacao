/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java para ler o código e o preço de 15 produtos, calcular e escrever:
- o maior preço lido;
- a média aritmética dos preços dos produtos*/
import java.util.Scanner;
public class Lista6Exercicio22{
	public static void main (String args[]){
		double maiorValor = 0, mediaAritmetica = 0;
		Scanner ler = new Scanner(System.in);
		for(int i = 0;i < 15;i++){
			System.out.printf("Digite o preco do produto %d: ", i + 1);
			double precoProduto = ler.nextDouble();
			mediaAritmetica += precoProduto / 15;
			if(precoProduto > maiorValor || i == 0){
				maiorValor = precoProduto;
			}
		}
		System.out.printf("O maior preco lido foi %f e a media aritmetica dos precos e %f", maiorValor, mediaAritmetica);
	}
}
