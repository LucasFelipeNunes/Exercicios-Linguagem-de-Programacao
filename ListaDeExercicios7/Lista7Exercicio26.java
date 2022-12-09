/*Nome: Lucas Felipe da Silva Nunes
26) Escreva um programa para gerar aleatoriamente uma String com 100 letras minúsculas.
Apresentar, caso haja:
- as letras do alfabeto que NÃO constam na sequência;
- a maior sequência de letras repetidas;
- a maior sequência de vogais; e
- a maior sequência alfabética.*/
import java.util.Scanner;
public class Lista7Exercicio26{
	public static void main(String[] args){
		StringBuilder sequencia = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            sequencia.append((char) (Math.random() * 26 + 97));
        }
        System.out.print("Sequencia gerada: " + sequencia.toString() + "\nLetras não encontradas na sequencia: ");
        int contador = 0;
        String letrasNaoEncontradas = "";
        for (int i = 'a'; i <= 'z'; i++) {
            contador = 0;
            for (int j = 0; j < sequencia.length(); j++) {
                if (sequencia.charAt(j) == i) {
                    contador++;
                }
            }
            if (contador == 0) {
                letrasNaoEncontradas += (char) i + " ";
            }
        }
        if (letrasNaoEncontradas.isEmpty()) {
            System.out.print("todas as letras foram encontradas!\n");
        }
        else {
            System.out.print(letrasNaoEncontradas + "\n");
        }
        System.out.print("Maior sequencia de letras repetidas encontradas: ");
        int maior = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            contador = 0;
            for (int j = 0; j < sequencia.length(); j++) {
                if (i == sequencia.charAt(j)) {
                    contador++;
                } else {
                    contador = 0;
                }
                if (contador > maior) {
                    maior = contador;
                }
            }
        }
        System.out.print(maior + "\n");
        String vogais = "aeiou";
        maior = 0;
        System.out.print("Maior sequencia de vogais encontradas: ");
        for (int i = 0; i < vogais.length(); i++) {
            contador = 0;
            for (int j = 0; j < sequencia.length(); j++) {
                if (vogais.charAt(i) == sequencia.charAt(j)) {
                    contador++;
                } else {
                    contador = 0;
                }
                if (contador > maior) {
                    maior = contador;
                }
            }
        }
        System.out.println(maior);
        System.out.print("Maior sequência alfabética encontrada: ");
        maior = 0;
        String alfabeto = "";
        for (int i = 'a'; i <= 'z'; i++) {
            alfabeto += (char) i;
        }
        for (int i = 0; i <= alfabeto.length(); i++) {
            contador = 0;
            String procurado = alfabeto.substring(0, alfabeto.length() - i);
            for (int j = 0; j < sequencia.length(); j++) {
                if (sequencia.substring(j).startsWith(procurado)) {
                    contador = procurado.length();
                } else {
                    contador = 0;
                }
                if (contador > maior) {
                    maior = contador;
                }
            }
        }
        System.out.println(maior);
	}
}
