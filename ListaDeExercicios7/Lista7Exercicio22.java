import java.util.Scanner;

public class Lista7Exercicio22 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = ler.nextLine();
        System.out.print("Digite uma palavra: ");
        String texto = ler.nextLine();
        int quantidade = 0;
        int vezes = 0;

		for(int i = 0;i < frase.length();i++){
            quantidade = 0;

			if(i >= texto.length()-1){
                for (int j = 0; j < texto.length(); j++) {
                    if(frase.charAt(i-(texto.length()-1)+j) == texto.charAt(j)){
                        quantidade++;
                    }
                }

                if (quantidade == texto.length()) {
                    vezes++;
                }
            }
		}

        System.out.print(vezes + " VEZES");

    }
}
