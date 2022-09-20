/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa que leia duas frases e a seguir informe se as frases fornecidas são
iguais. Observação: realizar esta verificação caractere por caractere.*/
import java.util.Scanner;
public class Lista7Exercicio17{
	public static void main(String[] args){
		boolean frasesSaoIguais = true;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase1 = ler.nextLine();
		System.out.print("Digite outra frase: ");
		String frase2 = ler.nextLine();
		for(int i = 0;(i < frase1.length()) && (frasesSaoIguais == true);i++){
			for(int j = 0;(j < frase2.length()) && (frasesSaoIguais == true);j++){
				if(frase1.charAt(i) != frase1.charAt(j)){
					frasesSaoIguais = false;
				}
			}
		}
		System.out.print("As frases digitadas" + (frasesSaoIguais ? " " : " nao ") + "sao iguais.");
	}
}
