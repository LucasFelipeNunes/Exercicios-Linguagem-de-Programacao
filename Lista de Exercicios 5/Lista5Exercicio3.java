/*Nome: Lucas Felipe da Silva Nunes
Enunciado: As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
forem compradas pelo menos 12. Escreva um programa em Java que leia o número de maçãs
compradas, calcule e escreva o custo total da compra.*/
import java.util.Scanner;
public class Lista5Exercicio3{
	public static void main (String args[]){
		int quantidade = 0;
		double custoTotal = 0;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a quantidade (positiva) de macas compradas: ");
		quantidade = ler.nextInt();
		while(quantidade <= 0){
			System.out.print("Valor invalido. Por favor, digite a quantidade (positiva) de macas compradas: ");
			quantidade = ler.nextInt();
		}
		if(quantidade < 12){
			custoTotal += 1.3 * quantidade;
		}
		else{
			custoTotal += 1 * quantidade;
		}
		System.out.printf("O custo total da compra e RS %.2f", custoTotal);
	}
}
