/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java para ler o ano atual e o ano de nascimento de uma pessoa.
Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário
considerar o mês em que a pessoa nasceu).*/
import java.util.Scanner;
public class Lista5Exercicio5{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o ano atual: ");
		int anoAtual = ler.nextInt();
		System.out.print("Digite o ano de seu nascimento: ");
		int anoNascimento = ler.nextInt();
		if(anoAtual - anoNascimento <= 16){
			System.out.print("Voce podera votar este ano");
		}
		else{
			System.out.print("Voce nao podera votar este ano");
		}
	}
}
