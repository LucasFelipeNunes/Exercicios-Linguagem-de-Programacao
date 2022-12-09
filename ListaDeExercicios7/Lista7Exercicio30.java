/*Nome: Lucas Felipe da Silva Nunes
Enunciado: ROT-13 (ou rot13, rot-13, Rot13, etc) é o nome que se costuma usar para um procedimento
simples mas eficaz para garantir que textos eletrônicos não sejam lidos por distração ou
acidente. ROT-13 vem do inglês, ROTate by 13 places, "ROTacionar 13 posições".
Especificamente, a cifra ROT-13 tem se mostrado útil principalmente para proteger endereços
de correio eletrônico (evitando SPAM, o envio de mensagens não solicitadas) e para "proteger"
mensagens que o remetente pode preferir não.
Como era de se esperar, o ROT-13 é usado principalmente em grupos de discussão (como na
usenet) e em listas de discussão como as dos Yahoo.
Um detalhe importante: não há qualquer diferença entre o procedimento para codificar um
texto em ROT-13 e o procedimento para decodificá-lo; simplesmente aplicamos o mesmo
procedimento uma segunda vez.
30) Da mesma forma que o exercício anterior, implemente um programa para criptografar e
descriptografar utilizando a cifra ROT-13.*/
import java.util.Scanner;
public class Lista7Exercicio30{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		String opcao = "", fraseCriptografada = "", fraseDescriptografada = "";
		boolean sair = false;
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
					if(fraseDescriptografada.charAt(i) >= 'a' && fraseDescriptografada.charAt(i) <= 'z' || fraseDescriptografada.charAt(i) >= 'A' && fraseDescriptografada.charAt(i) <= 'Z'){  
						if(fraseDescriptografada.charAt(i) <= 'm' || fraseDescriptografada.charAt(i) <= 'M'){
							fraseCriptografada += (char) (fraseDescriptografada.charAt(i) + 13);
						}
						else{
							fraseCriptografada += (char) (fraseDescriptografada.charAt(i) + 13);
						}
					}
					else{
						fraseCriptografada += fraseDescriptografada.charAt(i);
					}
				}
				System.out.print("A frase criptografada e " + fraseCriptografada + "\n\n");
			}
			else if(opcao.charAt(0) == '2'){
				System.out.print("Digite uma frase para ser criptografada: ");
				fraseDescriptografada = ler.nextLine();
				for(int i = 0;i < fraseDescriptografada.length();i++){
					if(fraseCriptografada.charAt(i) >= 'a' && fraseCriptografada.charAt(i) <= 'z' || fraseCriptografada.charAt(i) >= 'A' && fraseCriptografada.charAt(i) <= 'Z'){  
						if(fraseCriptografada.charAt(i) <= 'm' || fraseCriptografada.charAt(i) <= 'M'){
							fraseDescriptografada += (char) (fraseCriptografada.charAt(i) + 13);
						}
						else{
							fraseDescriptografada += (char) (fraseCriptografada.charAt(i) + 13);
						}
					}
					else{
						fraseDescriptografada += fraseCriptografada.charAt(i);
					}
				}
				System.out.print("A frase descriptografada e " + fraseDescriptografada + "\n\n");
			}
			else{
				sair = true;
			}
		}while(!sair);
	}
}
