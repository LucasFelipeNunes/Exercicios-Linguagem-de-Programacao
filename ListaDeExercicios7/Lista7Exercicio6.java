import java.util.Scanner;
public class Lista7Exercicio6 {
    public static void main(String[] args){
		Scanner lerString = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);

		int quantidadeLetra = 0;
        System.out.print("Digite uma letra: ");
        char letra = ler.next().charAt(0);

		System.out.print("Digite uma frase: ");
		String frase = lerString.nextLine();
        
		for(int i = 0;i < frase.length();i++){
			if((int) frase.charAt(i) == (int) letra || (int) frase.charAt(i) == (int) letra - 32){
				quantidadeLetra++;
			}
		}
		System.out.print("A quantidade de letras A (ou a) na frase digitada e " + quantidadeLetra);
	}
}
