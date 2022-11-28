import java.util.Scanner;

public class Lista7Exercicio24 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma sequencia de bits: ");
		String frase = ler.nextLine();
        int quantidade = 0;
        int maiorQuantidade = 0;

		for(int i = 0;i < frase.length();i++){
            
            if (frase.charAt(i) == '1') {
                quantidade++;
            } else {
                quantidade = 0;
            }

            maiorQuantidade = Math.max(maiorQuantidade, quantidade);


		}

        System.out.print(maiorQuantidade + " VEZES");
    }
}
