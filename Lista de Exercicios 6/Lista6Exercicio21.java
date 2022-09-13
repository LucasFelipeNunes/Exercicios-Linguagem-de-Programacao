/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java para ler uma quantidade e a seguir ler esta quantidade de números.
Depois de ler todos os números o algoritmo deve apresentar na tela o maior dos números lidos e a média
dos números lidos.*/
import java.util.Scanner;
public class Lista6Exercicio21{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		double maiorNumero = 0, mediaNumeros = 0, numero = 0;
		System.out.print("Digite a quantidade inteira de numeros: ");
		int quantidade = ler.nextInt();
		for(int i = 1;i <= quantidade;i++){
			System.out.printf("Digite o numero %d: ", i);
			numero = ler.nextDouble();
			mediaNumeros += numero / quantidade;
			if(numero > maiorNumero || i == 1){
				maiorNumero = numero;
			}
		}
		System.out.printf("O maior dos numeros e %f, e a media dos numeros lidos e %f: ", maiorNumero, mediaNumeros);
	}
}
