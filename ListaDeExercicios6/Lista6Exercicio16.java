/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java que calcule e escreva a média aritmética dos números inteiros entre 15
(inclusive) e 100 (inclusive).*/
import java.util.Scanner;
public class Lista6Exercicio16{
	public static void main (String args[]){
		double mediaAritmetica = 0;
		for(int i = 15;i <= 100;i++){
			mediaAritmetica += (double) i / 86;
		}
		System.out.print("A media dos numeros entre 15 (inclusive) e 100 (inclusive) e " + mediaAritmetica);
	}
}
