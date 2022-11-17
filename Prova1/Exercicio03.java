import java.util.Scanner;
public class Exercicio03{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		boolean ePrimo = true;
		int numeroAleatorio = 0, numeroDigitado = 0;
		do{
			System.out.print("Digite um número inteiro positivo: ");
			numeroDigitado = ler.nextInt();
			if(numeroDigitado < 0){
				System.out.print("Valor inválido. ");
			}
		}while(numeroDigitado < 0);
		if(numeroDigitado > 0){
			System.out.print("Os numeros aleatorios gerados foram:s");
			for(int i = 0;i < numeroDigitado;i++){
				numeroAleatorio = (int) (Math.random() * 1000);
				System.out.print("\n" + numeroAleatorio + " ");
				for(int j = 2;j < numeroAleatorio;j++){
					if(numeroAleatorio%j == 0){
						ePrimo = false;
					}
				}
				System.out.print((ePrimo && numeroAleatorio != 0 && numeroAleatorio != 1) ? "e primo" : "nao e primo");
				ePrimo = true;
			}
		}
		System.out.print("\nFim do Programa.");
	}
}
