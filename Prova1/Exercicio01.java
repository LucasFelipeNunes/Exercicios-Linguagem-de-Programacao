import java.util.Scanner;
public class Exercicio01 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		int numero1 = ler.nextInt();
		System.out.print("Digite o segundo numero: ");
		int numero2 = ler.nextInt();
		System.out.print("Digite o terceiro numero: ");
		int numero3 = ler.nextInt();
		System.out.print((numero1 >= numero2) ? (numero2 > numero3) ? (numero1 + " " + numero2 + " " + numero3) : (numero1 + " " + numero3 + " " + numero2) : (numero3 > numero2) ? (numero2 > numero1) ? (numero3 + " " + numero2 + " " + numero1) : (numero3 + " " + numero1 + " " + numero2) : (numero1 > numero3) ? (numero2 + " " + numero1 + " " + numero3) : (numero2 + " " + numero3 + " " + numero1));
	}
}

