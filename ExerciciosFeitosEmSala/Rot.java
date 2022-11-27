import java.util.Scanner;

public class Rot{
	public static void main (String[] args){
		String opcao = "";
		do{
			String mensagemCriptografada = "", mensagemDescriptografada = "";
			Scanner lerString = new Scanner (System.in);
			Scanner lerInt = new Scanner (System.in);
			System.out.print("Menu:\n(1) Criptografar\n(2) Descriptografar\n(3) Sair\nOpcao: ");
			opcao = lerString.nextLine();
			while(opcao.charAt(0) != '1' && opcao.charAt(0) != '2' && opcao.charAt(0) != '3' && opcao.length() != 1){
				System.out.print("\nOpcao invalida, digite novamente:\n\nMenu:\n(1) Criptografar\n(2) Descriptografar\n(3) Sair\nOpcao: ");
				opcao = lerString.nextLine();
			}
			switch(opcao){
				case "1":
					System.out.print("Digite a mensagem a ser criptografada: ");
					mensagemDescriptografada = lerString.nextLine();
					for(int i = 0;i < mensagemDescriptografada.length();i++){
						mensagemCriptografada += ((mensagemDescriptografada.charAt(i) > 64 && mensagemDescriptografada.charAt(i) < 78) || (mensagemDescriptografada.charAt(i) > 96 && mensagemDescriptografada.charAt(i) < 110)) ? (char) ((int) (mensagemDescriptografada.charAt(i)) + 13) : ((mensagemDescriptografada.charAt(i) >= 78 && mensagemDescriptografada.charAt(i) <= 91) || (mensagemDescriptografada.charAt(i) >= 110 && mensagemDescriptografada.charAt(i) <= 123)) ? (char) ((int) (mensagemDescriptografada.charAt(i)) - 13) : (char) ((int) (mensagemDescriptografada.charAt(i)));
					}
					System.out.print(mensagemCriptografada + "\n\n");
				break;
				case "2":
					System.out.print("Digite a mensagem a ser descriptografada: ");
					mensagemCriptografada = lerString.nextLine();
					for(int i = 0;i < mensagemCriptografada.length();i++){
						mensagemDescriptografada += ((mensagemCriptografada.charAt(i) > 64 && mensagemCriptografada.charAt(i) < 78) || (mensagemCriptografada.charAt(i) > 96 && mensagemCriptografada.charAt(i) < 110)) ? (char) ((int) (mensagemCriptografada.charAt(i)) + 13) : ((mensagemCriptografada.charAt(i) >= 78 && mensagemCriptografada.charAt(i) <= 91) || (mensagemCriptografada.charAt(i) >= 110 && mensagemCriptografada.charAt(i) <= 123)) ? (char) ((int) (mensagemCriptografada.charAt(i)) - 13) : (char) ((int) (mensagemCriptografada.charAt(i)));
					}
					System.out.print(mensagemDescriptografada + "\n\n");
			}
		}while(opcao.charAt(0) != '3');
	}
}
