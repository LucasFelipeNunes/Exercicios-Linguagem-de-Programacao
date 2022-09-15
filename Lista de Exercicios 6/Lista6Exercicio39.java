/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
positivo imprimir a sequência de termos: 1/50 + 2/49, 3/48 + ... + 50/1. Exemplo com entrada de 50
termos. Apresentar a soma desta sequência no final.*/
import java.util.Scanner;
public class Lista6Exercicio39{
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a quantidade de termos: ");
		int quantidadeTermos = ler.nextInt();
		double soma = 0;
		if(quantidadeTermos < 0){
			System.out.print("Valor invalido. Digite a quantidade de termos: ");
			quantidadeTermos = ler.nextInt();
		}
		else if(quantidadeTermos > 0){
			for(int i = 1;i <= quantidadeTermos;i++){
				System.out.printf(" %d/%d,", i, quantidadeTermos + 1 - i);
				soma += (double) i / (double) (quantidadeTermos + 1 - i);
			}
		}
		System.out.print("\nA soma desses termos e " + soma);
	}
}
