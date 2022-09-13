/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Desenvolva um programa em Java que receba dois valores numéricos e uma das opções
que representam uma das operações aritméticas (ler em String e testar como char): ‘+’ , ‘-‘, ‘*’
e ‘/’. Calcule e mostre a operação efetuada e o seu resultado. */
import java.util.Scanner;
public class Lista5Exercicio11{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		double valor1 = ler.nextDouble();
		System.out.print("Digite o segundo valor: ");
		double valor2 = ler.nextDouble();
		System.out.print("Digite a operacao aritmetica a ser feita (+, -, * ou /): ");
		String operacao = ler.nextLine();
		System.out.print(operacao);
		while(operacao != "+" && operacao != "-" && operacao != "*" && operacao != "/"){
			System.out.print("Operacao invalida. Digite a operacao aritmetica a ser feita (+, -, * ou /): ");
			operacao = ler.nextLine();
		}
		if(operacao == "+"){
			System.out.print("O resultado e " + (valor1 + valor2));
		}
		else if(operacao == "-"){
			System.out.print("O resultado e " + (valor1 - valor2));
		}
		else if(operacao == "*"){
			System.out.print("O resultado e " + (valor1 * valor2));
		}
		else if(operacao == "/"){
			System.out.print("O resultado e " + (valor1 / valor2));
		}
	}
}
