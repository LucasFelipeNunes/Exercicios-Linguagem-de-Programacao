/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa que apresente um menu com 3 opções:
1 – Criptografar
2 – Descriptografar
3 – Sair

Caso o usuário digite uma opção inválida, uma mensagem de erro deve ser apresentada e
novamente, solicitado uma estrada.

Se selecionado a opção 1, criptografar, solicitar a entrada do texto plano e como saída, exibir o
resultado do Zenit Polar e retornar ao menu principal.

Se selecionado a opção 2, descriptografar, solicitar a mensagem cifrada com Zenit Polar e
como saída, apresentar a mensagem original e retornar ao menu principal.

Por último, se selecionado a opção 3, finalizar o programa.*/
import java.util.Scanner;
public class Lista7Exercicio29{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		boolean sair = false;
		String opcao = "", fraseCriptografada = "", fraseDescriptografada = "";
		do{
			do{
				System.out.print("Escolha uma das seguintes opcoes:\n1 - Criptografar\n2 - Descriptografar\n3 - Sair\nDigite aqui: ");
				opcao = ler.nextLine();
				if(opcao.length() != 1 || opcao.charAt(0) != '1' && opcao.charAt(0) != '2' && opcao.charAt(0) != '3'){
					System.out.print("\nOpcao invalida. ");
				}
			}while(opcao.length() != 1 || opcao.charAt(0) != '1' && opcao.charAt(0) != '2' && opcao.charAt(0) != '3');
			if(opcao.charAt(0) == '1'){
				System.out.print("Digite uma frase para ser criptografada: ");
				fraseDescriptografada = ler.nextLine();
				for(int i = 0;i < fraseDescriptografada.length();i++){
					switch(fraseDescriptografada.charAt(i)){
						case 'p':
							fraseCriptografada += 'z';
						break;
						case 'P':
							fraseCriptografada += 'Z';
						break;
						case 'o':
							fraseCriptografada += 'e';
						break;
						case 'O':
							fraseCriptografada += 'E';
						break;
						case 'l':
							fraseCriptografada += 'n';
						break;
						case 'L':
							fraseCriptografada += 'N';
						break;
						case 'a':
							fraseCriptografada += 'i';
						break;
						case 'A':
							fraseCriptografada += 'I';
						break;
						case 'r':
							fraseCriptografada += 't';
						break;
						case 'R':
							fraseCriptografada += 'T';
						break;
						default:
							fraseCriptografada += fraseDescriptografada.charAt(i);
						break;
					}
				}
				System.out.print("A frase criptografada e " + fraseCriptografada + "\n\n");
			}
			else if(opcao.charAt(0) == '2'){
				System.out.print("Digite uma frase para ser descriptografada: ");
				fraseCriptografada = ler.nextLine();
				for(int i = 0;i < fraseCriptografada.length();i++){
					switch(fraseCriptografada.charAt(i)){
						case 'z':
							fraseDescriptografada += 'p';
						break;
						case 'Z':
							fraseDescriptografada += 'P';
						break;
						case 'e':
							fraseDescriptografada += 'o';
						break;
						case 'E':
							fraseDescriptografada += 'O';
						break;
						case 'n':
							fraseDescriptografada += 'l';
						break;
						case 'N':
							fraseDescriptografada += 'L';
						break;
						case 'i':
							fraseDescriptografada += 'a';
						break;
						case 'I':
							fraseDescriptografada += 'A';
						break;
						case 't':
							fraseDescriptografada += 'r';
						break;
						case 'T':
							fraseDescriptografada += 'R';
						break;
						default:
							fraseDescriptografada += fraseCriptografada.charAt(i);
						break;
					}
				}
				System.out.print("A frase descriptografada e " + fraseDescriptografada + "\n\n");
			}
			else{
				sair = true;
			}
			fraseCriptografada = fraseDescriptografada = "";
		}while(!sair);
	}
}
		
