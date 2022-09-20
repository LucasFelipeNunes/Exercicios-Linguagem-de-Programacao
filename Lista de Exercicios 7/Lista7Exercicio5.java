/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa que calcule e escreva a quantidade de vezes que o
caractere ‘a’ aparece em uma frase fornecida pelo usuário. Nota Importante: para a
contagem, o caractere pode ser maiúsculo ou minúsculo.*/
import java.util.Scanner;
public class Lista7Exercicio5{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int quantidadeLetrasA = 0;
		System.out.print("Digite uma frase: ");
		String frase = ler.nextLine();
		for(int i = 0;i < frase.length();i++){
			if(frase.charAt(i) == 'a' || frase.charAt(i) == 'A'){
				quantidadeLetrasA++;
			}
		}
		System.out.print("A quantidade de letras A (ou a) na frase digitada e " + quantidadeLetrasA);
	}
}
