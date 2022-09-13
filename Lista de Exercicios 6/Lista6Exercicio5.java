/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Modifique o exercício anterior para aceitar somente valores maiores que 0 para N. Caso o valor
informado (para N) não seja maior que 0, deverá ser lido um novo valor para N.*/
import java.util.Scanner;
public class Lista6Exercicio5{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um valor N inteiro e positivo: ");
		int N = ler.nextInt();
		while(N <= 0){
			System.out.print("Valor invalido. Digite um valor N inteiro e positivo: ");
			N = ler.nextInt();
		}
		for(int i = 1;i <= N;i++){
			System.out.printf("%d ", i);
		}
	}
}
