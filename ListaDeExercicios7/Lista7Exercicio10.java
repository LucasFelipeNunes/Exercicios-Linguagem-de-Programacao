import java.util.Scanner;

public class Lista7Exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quantidade = 0;
        System.out.println("Escreva uma frase: ");
        String frase = ler.nextLine();;
        
        

        for (int i = 0; i < frase.length(); i++) {

            if(frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
                quantidade++;
            }
        }

        System.out.println(quantidade);
    }
   

}
