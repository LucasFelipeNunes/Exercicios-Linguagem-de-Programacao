/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Declarar uma variável do tipo String com seu valor inicial igual a branco (“”) e a
seguir atribuir as letras minúsculas do alfabeto (abcde...z), uma-a-uma, as primeiras
vinte e seis posições da variável String. Imprimir o resultado.*/
public class Lista7Exercicio3{
	public static void main(String[] args){
		String abecedario = "";
		for(int i = 97;i < 123;i++){
			abecedario += (char)i;
		}
		System.out.print(abecedario);
	}
}
