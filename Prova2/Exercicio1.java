/*Alunos:	Lucas Felipe da Silva Nunes
			Luiz Gustavo Duarte Chagas*/
import java.util.Scanner;
public class Exercicio1{
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		String comecoEFim = "";
		boolean eValida = false;
		do{
			System.out.print("Digite a frase: ");
			String frase = ler.nextLine();
			System.out.print("Digite o comeco e o fim (dividido por :), ou X no comeco do padrao: ");
			comecoEFim = ler.nextLine();
			if((comecoEFim.charAt(0) == 'X' || comecoEFim.charAt(0) == 'x') && comecoEFim.length() == 1){
				// Encerra o programa caso seja digitado 'x' ou 'X'
				System.out.print("Fim!");
				break;
			}
			if(comecoEFim.contains(":")){
				String[] vetor = comecoEFim.split(":");
				if(vetor.length == 0 && comecoEFim.length() == 1){
					// Se for digitado apenas dois-pontos, imprime a frase inteira.
					System.out.println(frase);
				}
				else if(comecoEFim.charAt(0) == ':'){
					//Se for digitado um numero apenas apos os dois-pontos, a impressao comeca do inicio da frase e termina no numero digitado
					int fim = Integer.parseInt(vetor[1]);
					if(fim < 0){
						//Se o valor do fim for negativo, ele é somado ao length da frase
						fim += frase.length();
					}
					if(fim >= frase.length() || fim < 0){
						//Se o valor do fim continuar negativo, ou se ele exceder a quantidade de posicoes da frase, ele dá erro e volta ao loop
						System.out.print("Erro!\n");
						continue;
					}
					System.out.println();
					System.out.println(frase.substring(0,fim));
				}
				else if(comecoEFim.charAt(comecoEFim.length() - 1) == ':'){
					//Se for digitado um numero apenas antes dos dois-pontos, a impressao comeca na posicao do numero digitado e termina no final da frase
					int comeco = Integer.parseInt(vetor[0]);
					if(comeco < 0){
						//Se o valor do inicio for negativo, ele é somado ao length da frase
						comeco += frase.length();
					}
					if(comeco < 0 || comeco >= frase.length()){
						//Se o valor do inicio continuar negativo, ou se ele exceder a quantidade de posicoes da frase, ele dá erro e volta ao loop
						System.out.print("Erro!\n");
						continue;
					}
					System.out.println();
					System.out.println(frase.substring(comeco,frase.length()));
				}
				else{
					//Se for digitado um numero antes e outro apos os dois-pontos, a impressao comeca na posicao do primeiro numero e termina na posicao do segundo numero digitado
					int comeco = Integer.parseInt(vetor[0]);
					if(comeco < 0){
						//Se o valor do inicio for negativo, ele é somado ao length da frase
						comeco += frase.length();
					}
					if(comeco < 0 || comeco >= frase.length()){
						//Se o valor do inicio continuar negativo, ou se ele exceder a quantidade de posicoes da frase, ele dá erro e volta ao loop
						System.out.print("Erro!\n");
						continue;
					}
					int fim = Integer.parseInt(vetor[1]);
					if(fim < 0){
						//Se o valor do fim for negativo, ele é somado ao length da frase
						fim += frase.length();
					}
					if(fim >= frase.length() || fim < 0){
						//Se o valor do inicio continuar negativo, ou se ele exceder a quantidade de posicoes da frase, ele dá erro e volta ao loop
						System.out.print("Erro!\n");
						continue;
					}
					if(comeco > fim){
						//Se o valor do comeco for maior que o do fim, dá erro e volta ao loop
						System.out.print("Erro!\n");
						continue;
					}
					System.out.println();
					System.out.println(frase.substring(comeco,fim));
				}
			}
			else{
				//Se o fatiamento estiver fora de padrão, é exibido um erro e o ciclo continua
				System.out.print("Formato invalido");
			}
			System.out.println();
			
		//Rodar enquanto nao tiver um break
		}while(true);
	}
}
