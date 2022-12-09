/*Nome: Lucas Felipe da Silva Nunes
28) Escreva um programa que leia uma String e "dobre" ela ao meio concatenado seus
caracteres.
Ex:
Entrada: Macaco Caco quer banana (tamanho ímpar)
Saída: Maancaancaob rCeaucqo
Entrada: Batatinha quando nasce (tamanho par)
Saída: Beactsaatniondhnaa uq*/
import java.util.Scanner;
public class Lista7Exercicio28{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma string: ");
		String frase = ler.nextLine();
		System.out.print("Ela \"dobrada\" ao meio, com os caracteres concatenados, fica: ");
		for (int i = 0; i < frase.length()/2; i++)
		{
			System.out.print(frase.charAt(i) + "" + frase.charAt(frase.length() - i - 1));
		}
		if(frase.length()%2 == 1){
			System.out.print(frase.charAt(frase.length()/2));
		}
	}
}
