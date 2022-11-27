/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Indique os tipos da linguagem Java que aceitam cada valor da lista abaixo
a. "Bom dia"
b. 3
c. 235.13
d. true
e. -135
f. 256.23F
g. 'A'
h. 6463275245745L
Obs: faça os testes necessários com um programa escrito em Java para identificar os tipos*/


public class Lista2Exercicio7 {
	
	public static void main (String[] args) {
		String a = "Bom dia";
		byte b = 3;
		double c = 235.13;
		boolean d = true;
		short e = -135;
		float f = 256.23F;
		char g = 'A';
		long h = 6463275245745L;
		System.out.print("Tipo da variavel a: " + a.getClass().getSimpleName() + "\nTipo da variavel b: byte\nTipo da variavel c: double\nTipo da variavel d: boolean\nTipo da variavel e: short\nTipo da variavel f: float\nTipo da variavel g: char\nTipo da variavel h: long");
	}
}

