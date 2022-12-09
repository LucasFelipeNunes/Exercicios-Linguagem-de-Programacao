//Nome: Lucas Felipe da Silva Nunes
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
			else{
				sair = true;
			}
		}while(!sair);
	}
}
