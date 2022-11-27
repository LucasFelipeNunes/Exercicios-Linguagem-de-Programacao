/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java para ler 10 números. Todos os números lidos com valor inferior a 40
devem ser somados. Escreva o valor final da soma efetuada.*/
import java.util.Scanner;
public class Lista6Exercicio13{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		double valor = 0, somaNumerosMenoresQue40 = 0;
		for(int i = 1;i <= 10;i++){
			System.out.printf("Digite o valor %d: ", i);
			valor = ler.nextDouble();
			if(valor < 40){
				somaNumerosMenoresQue40 += valor;
			}
		}
		System.out.print("A soma total dos numeros lidos menores que 40 e " + somaNumerosMenoresQue40);
	}
}
