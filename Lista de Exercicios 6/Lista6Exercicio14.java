/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java para ler 10 números. Todos os números lidos com valor inferior a 40
devem ser somados. Escreva o valor final da soma efetuada.*/
import java.util.Scanner;
public class Lista6Exercicio14{
	public static void main (String args[]){
		int soma = 0;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor 1: ");
		int valor1 = ler.nextInt();
		System.out.print("Digite o valor 2: ");
		int valor2 = ler.nextInt();
		for(int i = valor1;i <= valor2;i++){
			soma += i;
		}
		System.out.print("A soma dos valores entre os lidos (incluindo eles) e " + soma);
	}
}
