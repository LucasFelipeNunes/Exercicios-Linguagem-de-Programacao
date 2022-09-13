/*Nome: Lucas Felipe da Silva Nunes
Enunciado: A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar
mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo
de 50%. Escreva um programa em Java que leia o número de horas trabalhadas em um mês, o
salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas
extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas)*/
import java.util.Scanner;
public class Lista5Exercicio9{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a quantidade (maior que 160) de horas trabalhadas neste mes pelo funcionario: ");
		double horasTrabalhadas = ler.nextDouble();
		while(horasTrabalhadas < 160){
			System.out.print("Valor invalido. Digite a quantidade (maior que 160) de horas trabalhadas neste mes pelo funcionario: ");
			horasTrabalhadas = ler.nextDouble();
		}
		System.out.print("Digite o salario por hora do funcionario: ");
		double salarioPorHora = ler.nextDouble();
		double salarioTotal = 160 * salarioPorHora;
		if(horasTrabalhadas > 160){
			salarioTotal += (horasTrabalhadas - 160) * 1.5 * salarioPorHora;
		}
		System.out.print("O salario total do funcionario neste mes e " + salarioTotal);
	}
}
