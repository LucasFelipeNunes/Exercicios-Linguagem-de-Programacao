/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Escreva um programa validador de senhas. A regra para a criação de uma senha forte é
que a senha deve ser de tamanho mínimo 10. A senha deve conter letras maiúsculas, letras
minúsculas, números e caracteres especiais/símbolos (!@#$%&*()+). Outra regra, deve ter
pelo menos 3 caracteres (maiúsculo ou minúsculo), pelo menos 3 números e pelo menos 2
símbolos. O programa deve solicitar uma senha forte ao usuário até ele conseguir uma senha
que respeite esses critérios. Após cada senha digitada, apresentar as regras e se a senha
passou pelos quesitos ou não.

Ex:
Senha: senha123

Regras
Tamanho 10: 8 (x)
Letras 3: 5 (ok)
Números 3: 3 (ok)
Símbolos 2: 0 (x)

Senha reprovada! Tente novamente.

Senha: Bgp2Ip4*@1
Regras
Tamanho 10: 10 (ok)
Letras 3: 5 (ok)
Números 3: 3 (ok)
Símbolos 2: 2 (ok)
Senha aprovada! Parabéns!*/
import java.util.Scanner;
public class Lista7Exercicio25{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		boolean senhaAprovada = true, temLetraMinuscula = false, temLetraMaiuscula = false;
		do{
			System.out.print("Digite uma senha com pelo menos 10 caracteres, sendo destes pelo menos 3 letras, 3 numeros e 2 simbolos: ");
			String senha = ler.nextLine();
			int tamanho = senha.length(), quantidadeLetras = 0, quantidadeNumeros = 0, quantidadeSimbolos = 0;
			for(int i = 0;i < senha.length();i++){
				for(int j = 65;j < 91;j++){
					if(senha.charAt(i) == (char) j){
						quantidadeLetras++;
						temLetraMaiuscula = true;
					}
					else if(senha.charAt(i) == (char) (j + 32)){
						quantidadeLetras++;
						temLetraMinuscula = true;
					}
					else if(j < 75 && senha.charAt(i) == (char) (j - 17)){
						quantidadeNumeros++;
					}
					else if((j < 76 && senha.charAt(i) == (char) (j - 32) && (j - 32) != 34 && (j - 32) != 39) || (senha.charAt(i) == (char) 64 && j == 65)){
						quantidadeSimbolos++;
					}
				}
			}
			System.out.print("Regras\nTamanho 10:\t" + tamanho + (tamanho < 10 ? " (x)" : " (ok)") + "\nLetras 3:\t" + quantidadeLetras + (quantidadeLetras < 3 ? " (x)" : " (ok)") + "\nNumeros 3:\t" + quantidadeNumeros + (quantidadeNumeros < 3 ? " (x)" : " (ok)") + "\nSimbolos 2:\t"  + quantidadeSimbolos + (quantidadeSimbolos < 2 ? " (x)" : " (ok)") + "\n\n");
			if(quantidadeNumeros < 3 || quantidadeSimbolos < 2 || quantidadeLetras < 3 || senha.length() < 10 || !temLetraMinuscula || !temLetraMaiuscula){
				senhaAprovada = false;
				System.out.print("Senha reprovada! Tente novamente.\n\n");
			}
		}while(!senhaAprovada);
		System.out.print("Senha aprovada! Parabens!");
	}
}
					
