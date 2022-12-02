/*Nome: Lucas Felipe da Silva Nunes
Enunciado: 1) Escreva um programa em Java para ler um valor e escrever a mensagem É MAIOR QUE
10 se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!.*/
import java.util.Scanner;
public class Lista5Exercicio1{
	public static void main(String [] args){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um valor:\t");
		System.out.print((ler.nextDouble() > 10) ? "É MAIOR QUE 10" : "NÃO É MAIOR QUE 10");
	}
}
