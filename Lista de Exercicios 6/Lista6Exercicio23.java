/*Nome: Lucas Felipe da Silva Nunes
Enunciado: A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Escreva um programa em
Java para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
a) Média de salário da população;
b) Média do número de filhos;
c) Maior salário dos habitantes;
d) Percentual de pessoas com salário menor que R$ 150,00*/
import java.util.Scanner;
public class Lista6Exercicio23{
	public static void main (String args[]){
		double salario = 0, mediaSalario = 0, mediaNumeroFilhos = 0, maiorSalario = 0, percentualSalarioMenorQue150 = 0;
		int numeroFilhos = 0, i = 0;
		Scanner ler = new Scanner(System.in);
		for(i = 0;salario >= 0;i++){
			System.out.printf("Digite o salario da pessoa %d (digite um numero negativo para encerrar o ciclo): ", i + 1);
			salario = ler.nextDouble();
			if(salario >= 0){
				mediaSalario += salario;
				if(salario < 150){
					percentualSalarioMenorQue150++;
				}
				if(i == 0 || salario > maiorSalario){
					maiorSalario = salario;
				}
				System.out.printf("Digite o numero de filhos da pessoa %d: ", i + 1 );
				numeroFilhos = ler.nextInt();
				mediaNumeroFilhos += numeroFilhos;
			}
		}
		System.out.print(i);
		mediaSalario /= (i - 1);
		mediaNumeroFilhos /= (i - 1);
		percentualSalarioMenorQue150 *= 100 / (i - 1);
		System.out.printf("a) A media de salario da populacao e %.2f\nb) A media do numero de filhos e %f\nc) O maior salario dos habitantes e %.2f\nd) O percentual de pessoas com salario menor que R$ 150,00 e %.2f", mediaSalario, mediaNumeroFilhos, maiorSalario, percentualSalarioMenorQue150);
	}
}
