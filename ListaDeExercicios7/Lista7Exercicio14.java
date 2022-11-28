import java.util.Scanner;

public class Lista7Exercicio14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva uma frase: ");
        String frase = ler.nextLine();
        String caracter = ler.next();
        String transformada = "";
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == caracter.charAt(0)){
                transformada += "*";
            } else {
                transformada += frase.charAt(i);
            }
        }

        System.out.println(transformada);
        
    }
}
