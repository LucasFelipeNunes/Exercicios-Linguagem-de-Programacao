/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
iguais) e escrevê-los em ordem crescente.*/
import java.util.Scanner;
public class Lista5Exercicio7{
	public static void main (String args[]){
		double valor1 = 0, valor2 = 0;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		valor1 = ler.nextDouble();
		System.out.print("Digite o segundo valor: ");
		valor2 = ler.nextDouble();
		while(valor1 == valor2){
			System.out.print("Os valores nao podem ser iguais. Digite o segundo valor: ");
			valor2 = ler.nextDouble();
		}
		if(valor1 > valor2)
		{
			System.out.print("Valores em ordem crescente: " + valor2 + " " + valor1);
		}
		else{
			System.out.print("Valores em ordem crescente: " + valor1 + " " + valor2);
		}
	}
}
