/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java para ler um valor e escrever se é positivo ou negativo
(considere o valor zero como positivo).*/
import java.util.Scanner;
public class Lista5Exercicio2{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		double valor = ler.nextDouble();
		if(valor >= 0){
			System.out.print("Este valor e positivo");
		}
		else{
			System.out.print("Este valor e negativo");
		}
	}
}
