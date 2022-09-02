import java.util.Scanner;
public class FrasePreferida
{
	public static void main(String[] args)
	{
		System.out.printf("Informe sua frase preferida: ");
		Scanner LerFrasePreferida = new Scanner(System.in);
		System.out.println(LerFrasePreferida.nextLine());
	}
}
