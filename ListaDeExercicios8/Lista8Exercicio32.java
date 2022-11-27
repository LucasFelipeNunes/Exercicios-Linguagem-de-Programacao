import java.util.Scanner;
import java.util.Arrays;
public class Lista8Exercicio32{
	public static void main(String[] args){
		Scanner lerInt = new Scanner(System.in), lerString =  new Scanner(System.in);
		System.out.print("Frase:\t");
		String frase = lerString.nextLine();
		String aux = new String();
		String[] AN = frase.split(" ");
		System.out.print("Quantidade de palavras:\t" + AN.length + "\nVetor AN original:\t[");
		for(int i = 0;i < AN.length;i++){
			System.out.print(" \""+ AN[i] + "\"" + ((i == AN.length - 1) ? "" : ","));
		}
		for(int i = 0;i < AN.length;i++){
			for(int j = 0;j < i;j++){
				if((int)AN[j].toUpperCase().charAt(0) > (int)AN[i].toUpperCase().charAt(0)){
					aux = AN[j];
					AN[j] = AN[i];
					AN[i] = aux;
				}
			}
		}
		System.out.print(" ]\n\nVetor AN ordenado:\t[");
		for(int i = 0;i < AN.length;i++){
			System.out.print(" \""+ AN[i] + "\"" + ((i == AN.length - 1) ? "" : ","));
		}
		System.out.print(" ]");
	}
}
