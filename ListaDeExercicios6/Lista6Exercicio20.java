/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java que leia 100 valores e no final, escreva o maior e o menor valor lido.*/
import java.util.Scanner;
public class Lista6Exercicio20{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		double maiorValor = 0, menorValor = 0, valorDigitado = 0;
		for(int i = 1;i <= 5;i++){
			System.out.printf("Digite o valor %d: ", i);
			valorDigitado = ler.nextDouble();
			if(valorDigitado > maiorValor || i == 1){
				maiorValor = valorDigitado;
			}
			if(valorDigitado < menorValor || i == 1){
				menorValor = valorDigitado;
			}
		}
		System.out.printf("O maior valor lido e %f e o menor valor lido e %f", maiorValor, menorValor);
	}
}
