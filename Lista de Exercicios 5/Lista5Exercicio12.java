/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Desenvolva um programa em Java que receba o preço de um produto e seu código de
origem e mostre o preço do produto junto de sua procedência, o valor calculado do frete e o
valor final a ser pago pelo produto, conforme tabela a seguir: 
CODIGO DE ORIGEM	REGIAO DE PROCEDENCIA	FRETE
		1					Norte			10%
	2, 5, 9					Sul				3%
	3,10 ate 15				Leste			1,2%
	7 ou 20					Oeste			7,3%
Qualquer outro				Importado		22,2%*/
import java.util.Scanner;
public class Lista5Exercicio12{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o preco do produto: ");
		double precoProduto = ler.nextDouble();
		System.out.print("Digite o seu codigo de origem: ");
		int codigoOrigem = ler.nextInt();
		if(codigoOrigem == 1){
			System.out.printf("O valor final a ser pago pelo produto e %.2f", 1.1 * precoProduto);
		}
		else if(codigoOrigem == 2 || codigoOrigem == 5 || codigoOrigem == 9){
			System.out.printf("O valor final a ser pago pelo produto e %.2f", 1.03 * precoProduto);
		}
		else if(codigoOrigem == 3 || (codigoOrigem >= 10 && codigoOrigem <= 15)){
			System.out.printf("O valor final a ser pago pelo produto e %.2f", 1.012 * precoProduto);
		}
		else if(codigoOrigem == 7 || codigoOrigem == 20){
			System.out.printf("O valor final a ser pago pelo produto e %.2f", 1.073 * precoProduto);
		}
		else{
			System.out.printf("O valor final a ser pago pelo produto e %.2f", 1.222 * precoProduto);
		}
	}
}
