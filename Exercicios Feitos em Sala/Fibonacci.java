import java.util.Scanner;

public class Fibonacci{
	public static void main (String[] args){
		int termoImpresso = 0, termoPassado = 1, termoRetrasado = 0;
		System.out.print("0, 1, ");
		for(int i = 2;i < 10;i++){
			termoImpresso = termoPassado + termoRetrasado;
			System.out.print(termoImpresso + ", ");
			termoRetrasado = termoPassado;
			termoPassado = termoImpresso;
		}
	}
}
