/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Crie um arquivo chamado ADivisivelPorB.java. Implemente um programa em Java que guarde
dois valores numéricos inteiros: a e b, informados pelo usuário, sendo a de 0 até 1000 (inclusos) e b
de 0 a 20 (inclusos). Valide os valores digitados pelo usuário, informando caso não sejam validos.
Valide, também, se o valor de 1 é maior ou igual ao valor de b, caso não seja, informe ao usuário.
Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou a mensagem Não é
divisível, caso contrário.*/
import java.util.Scanner;
public class ADivisivelPorB {
	public static void main (String[] args) {
		Scanner myObj = new Scanner(System.in);
		double a = 0, b = 0;
		do
		{
			System.out.printf("Digite um valor entre 0 e 1000 (inclusos) para o valor de a: ");
			a = myObj.nextInt();
			if(a < 0 || a > 1000)
			{
				System.out.printf("Valor inválido. ");
			}
		} while(a < 0 || a > 1000);
		do
		{
			System.out.printf("Digite um valor entre 0 e 20 (inclusos) para o valor de b: ");
			b = myObj.nextDouble();
			if(b < 0 || b > 20)
			{
				System.out.printf("Valor inválido. ");
			}
		} while(b < 0 || b > 20);
		if(a%b == 0)
		{
			System.out.println("E divisivel");
		}
		else
		{
			System.out.println("Nao e divisivel");
		}
	}
}
