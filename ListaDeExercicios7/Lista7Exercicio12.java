import java.util.Scanner;

public class Lista7Exercicio12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quantidade = 0;
        System.out.println("Escreva uma frase: ");
        String frase = ler.nextLine();;
        int[] vogais  = new int[5];
        

        for (int i = 0; i < frase.length(); i++) {

            if(frase.charAt(i) == 'A' || frase.charAt(i) == 'a') {
                vogais[0]++;
            } else if(frase.charAt(i) == 'E' || frase.charAt(i) == 'e') {
                vogais[1]++;
            } else if(frase.charAt(i) == 'I' || frase.charAt(i) == 'i') {
                vogais[2]++;
            } else if(frase.charAt(i) == 'O' || frase.charAt(i) == 'o') {
                vogais[3]++;
            } else if(frase.charAt(i) == 'U' || frase.charAt(i) == 'u') {
                vogais[4]++;
            }
        }

        
        System.out.println("A " + vogais[0]);
        System.out.println("E " + vogais[0]);
        System.out.println("I " + vogais[0]);
        System.out.println("O " + vogais[0]);
        System.out.println("U " + vogais[0]);
        
    }
}
