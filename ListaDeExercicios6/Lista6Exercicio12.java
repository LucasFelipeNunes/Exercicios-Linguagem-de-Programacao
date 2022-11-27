/*Nome: Lucas Felipe da Silva Nunes
Enunciado:  Escreva um programa em Java para ler 10 números e ao final da leitura escrever a soma total dos 10
números lidos.*/
import java.util.Scanner;
public class Lista6Exercicio12{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		double valor = 0, somaNumeros = 0;
		for(int i = 1;i <= 10;i++){
			System.out.printf("Digite o valor %d: ", i);
			valor = ler.nextDouble();
			somaNumeros += valor;
		}
		System.out.print("A soma total dos numeros lidos e " + somaNumeros);
	}
}
