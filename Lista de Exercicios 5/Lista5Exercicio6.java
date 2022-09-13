/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
iguais) e escrever o maior deles.*/
import java.util.Scanner;
public class Lista5Exercicio6{
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
		if(valor1 > valor2){
			System.out.print(valor1 + " e o maior valor");
		}
		else{
			System.out.print(valor2 + " e o maior valor");
		}
	}
}
