import java.util.Scanner;
public class Exercicio04{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		boolean ePrimo = true;
		int numeroAleatorio = 0, numeroDigitado = 0, contador = 0;
		do{
			System.out.print("Digite um número inteiro positivo: ");
			numeroDigitado = ler.nextInt();
			if(numeroDigitado < 0){
				System.out.print("Valor inválido. ");
			}
		}while(numeroDigitado < 0);
		if(numeroDigitado > 0){
			System.out.print("Os numeros aleatorios gerados foram:");
			while(contador < numeroDigitado){
				numeroAleatorio = (int) (Math.random() * 1000);
				for(int j = 2;j < numeroAleatorio;j++){
					if(numeroAleatorio%j == 0){
						ePrimo = false;
					}
				}
				if(ePrimo && numeroAleatorio != 0 && numeroAleatorio != 1){
					System.out.print(" " + numeroAleatorio);
					contador++;
				}
				ePrimo = true;
			}
		}
		System.out.print("\nFim do Programa.");
	}
}

