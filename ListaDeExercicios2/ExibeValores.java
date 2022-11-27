/*Nome: Lucas Felipe da Silva Nunes
Enunciado: Crie um arquivo chamado ExibeValores.java. Implemente um programa em Java que armazene
em variáveis os valores 19, 1571, 100000, 2147483648, 3.14, 3.141592653589793, true e 'K'.
Utilize sempre o tipo primitivo adequado que ocupe o menor espaço possível. Defina os nomes que
achar mais apropriado para essas variáveis. Por fim, exiba os valores dessas variáveis na saída
padrão.*/
public class ExibeValores
{
	public static void main (String[] args)
	{
		byte umByte = 19;
		short doisBytes = 1571;
		int quatroBytes = 100000;
		long oitoBytes = 2147483648l;
		float poucasCasasDecimais = 3.14f;
		double muitasCasasDecimais = 3.141592653589793;
		boolean variavelBooleana = true;
		char caractere = 'K';
		System.out.println(umByte + " " + doisBytes + " " + quatroBytes + " " + oitoBytes + " " + poucasCasasDecimais + " " + muitasCasasDecimais + " "  + variavelBooleana + " "  + caractere);
	}
}
