/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa que imprima o número de consoantes de uma frase fornecida pelo
usuário.*/
import java.util.Scanner;
public class Lista7Exercicio13{
	public static void main(String[] args){
		int quantidadeConsoantes = 0;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = ler.nextLine();
		for(int i = 97;i < 123;i++){
			for(int j = 0;j < frase.length();j++){
				if((frase.charAt(j) == (char)i || frase.charAt(j) == (char)(i - 32)) && i != 97 && i != 65 && i != 101 && i != 69 && i != 105 && i != 73 && i != 79 && i != 111 && i != 117 && i != 56){
					quantidadeConsoantes++;
				}
			}
		}
		System.out.print("A quantidade de consoantes na frase digitada e " + quantidadeConsoantes);
	}
}
