/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java para ler 10 valores e escrever quantos desses valores lidos estão no
intervalo [10,20] (incluindo os valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo.*/
import java.util.Scanner;
public class Lista6Exercicio9{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		int quantidadeValoresEntre10E20 = 0;
		double valor = 0;
		for(int i = 1;i <= 10;i++){
			System.out.printf("Digite o valor %d: ", i);
			valor = ler.nextDouble();
			if(valor >= 10 && valor <= 20){
				quantidadeValoresEntre10E20++;
			}
		}
		System.out.printf("%d dos valores lidos esta(o) no intervalo [10,20]", quantidadeValoresEntre10E20);
	}
}
			
