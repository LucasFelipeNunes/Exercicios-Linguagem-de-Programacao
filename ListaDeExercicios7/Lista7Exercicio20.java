import java.util.Scanner;

public class Lista7Exercicio20 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
        int quantidade = 1;
		String frase = ler.nextLine();
		for(int i = 0;i < frase.length();i++){
			if(frase.charAt(i) == ' '){
				quantidade++;
			}
		}

        System.out.println(quantidade + " palavras");
    }
    
}
