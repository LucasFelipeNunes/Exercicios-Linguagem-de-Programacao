import java.util.Scanner;

public class ProvaCristo{
	public static void main (String[] args){
		double numero = 0;
		do{
			Scanner ler = new Scanner (System.in);
			System.out.print("Digite um numero: ");
			numero = ler.nextDouble();
			System.out.print((numero != 0) ? "O numero da casa das dezenas deste numero " + (((int)(numero / 10) % 2) == 0 ? "e par.\n" : "e impar.\n") : "");
		}while(numero != 0);
	}
}
		
