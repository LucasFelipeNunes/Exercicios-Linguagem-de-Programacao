/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java para ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever
a tabuada de 1 a 10 do valor lido.*/
import java.util.Scanner;
public class Lista6Exercicio7{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um valor inteiro entre 1 e 10: ");
		int valor = ler.nextInt();
		while(valor <= 0 || valor > 10){
			System.out.print("Valor invalido. Digite um valor inteiro entre 1 e 10: ");
			valor = ler.nextInt();
		}
		for(int i = 1;i <= 10;i++){
			System.out.printf("%d ", valor*i);
		}
	}
}
