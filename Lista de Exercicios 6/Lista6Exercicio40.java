/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
positivo imprimir a sequência de termos: 1, 2, 3, ..., 10, 10, 9, 8, ..., 1. Exemplo com entrada de 20
termos.*/
import java.util.Scanner;
public class Lista6Exercicio40{
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a quantidade de termos: ");
		int quantidadeTermos = ler.nextInt();
		if(quantidadeTermos < 0){
			System.out.print("Valor invalido. Digite a quantidade de termos: ");
			quantidadeTermos = ler.nextInt();
		}
		else if(quantidadeTermos > 0){
			for(int i = 1;i <= quantidadeTermos / 2;i++){
				System.out.printf(" %d,", i);
			}
			if(quantidadeTermos % 2 == 1){
				System.out.printf(" %d,", quantidadeTermos / 2 + 1);
			}
			for(int i = quantidadeTermos / 2;i >= 1;i--){
				System.out.printf(" %d,", i);
			}
		}
	}
}
