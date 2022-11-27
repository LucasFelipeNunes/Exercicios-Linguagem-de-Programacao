/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java para ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive)
e N (inclusive). Considere que o N será sempre maior que ZERO.*/
import java.util.Scanner;
public class Lista6Exercicio4{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um valor N inteiro e positivo: ");
		int N = ler.nextInt();
		for(int i = 1;i <= N;i++){
			System.out.printf("%d ", i);
		}
	}
}
