/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa em Java para ler o salário fixo e o valor das vendas efetuadas pelo
vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das
vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu
salário total.*/
import java.util.Scanner;
public class Lista5Exercicio10{
	public static void main (String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o salario fixo do vendedor: ");
		double salarioFixo = ler.nextDouble();
		System.out.print("Digite o valor das vendas efetuadas pelo vendedor: ");
		double valorVendas = ler.nextDouble();
		if(valorVendas <= 1500){
			System.out.print("O salario total do vendedor este mes foi " + (salarioFixo + 0.03 * valorVendas));
		}
		else{
			System.out.print("O salario total do vendedor este mes foi " + (salarioFixo + 45 + 0.05 * (valorVendas - 1500)));
		}
	}
}
