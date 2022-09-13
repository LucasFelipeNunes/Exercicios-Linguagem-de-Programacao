/*Nome: Lucas Felipe da Silva Nunes
Enunciado: O mesmo exercício anterior, mas agora, considere que o segundo valor lido poderá ser maior ou menor
que o primeiro valor lido, ou seja, deve-se testá-los.*/
import java.util.Scanner;
public class Lista6Exercicio15{
	public static void main (String args[]){
		int soma = 0;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor 1: ");
		int valor1 = ler.nextInt();
		System.out.print("Digite o valor 2: ");
		int valor2 = ler.nextInt();
		if(valor2 > valor1){
			for(int i = valor1;i <= valor2;i++){
				soma += i;
			}
		}
		else{
			for(int i = valor2;i <= valor1;i++){
				soma += i;
			}
		}
		System.out.print("A soma dos valores entre os lidos (incluindo eles) e " + soma);
	}
}
