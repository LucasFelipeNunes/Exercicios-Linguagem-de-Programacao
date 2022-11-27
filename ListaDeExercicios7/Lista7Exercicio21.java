/*Nome: Lucas Felipe da Silva Nunes
Enunciado:  Escreva um programa que receba uma frase, imprima cada palavras desta frase em uma
linha.*/
import java.util.Scanner;
public class Lista7Exercicio21{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = ler.nextLine();
		for(int i = 0;i < frase.length();i++){
			if(frase.charAt(i) == ' '){
				System.out.print("\n");
			}
			else{
				System.out.print(frase.charAt(i));
			}
		}
	}
}
