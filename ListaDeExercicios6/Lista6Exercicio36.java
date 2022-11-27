/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
positivo imprimir a sequência de termos: 1, 1/2, 1/3, 1/4, 1/5, ...*/
import java.util.Scanner;
public class Lista6Exercicio36{
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a quantidade de termos: ");
		int quantidadeTermos = ler.nextInt();
		if(quantidadeTermos < 0){
			System.out.print("Valor invalido. Digite a quantidade de termos: ");
			quantidadeTermos = ler.nextInt();
		}
		else if(quantidadeTermos > 0){
			for(int i = 1;i <= quantidadeTermos;i++){
				if(i == 1){
					System.out.print("1");
				}
				else{
					System.out.printf("1/%d", i);
				}
			}
		}
	}
}
