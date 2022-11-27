/*Nome: Lucas Felipe da Silva Nunes
Enunciado:  Escreva um programa em Java para ler 10 valores, calcular e escrever a média aritmética desses valores
lidos.*/
import java.util.Scanner;
public class Lista6Exercicio10{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		double mediaAritmetica = 0, valor = 0;
		for(int i = 1;i <= 10;i++){
			System.out.printf("Digite o valor %d: ", i);
			valor = ler.nextDouble();
			mediaAritmetica += valor/10;
		}
		System.out.printf("A media aritmetica dos valores lidos e %f", mediaAritmetica);
	}
}
