/*Nome: Lucas Felipe da Silva Nunes
Enunciado: */
import java.util.Scanner;
public class Lista1Exercicios10a20 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		String exercicio = "";
		do{
			System.out.print("Digite o numero inteiro entre 10 e 20 do exercicio que voce gostaria de ver: ");
			exercicio = ler.nextLine();
			if(exercicio.intern() != "10" && exercicio.intern() != "11" && exercicio.intern() != "12" && exercicio.intern() != "13" && exercicio.intern() != "14" && exercicio.intern() != "15" && exercicio.intern() != "16" && exercicio.intern() != "17" && exercicio.intern() != "18" && exercicio.intern() != "19" && exercicio.intern() != "20"){
				System.out.print("Valor invalido. ");
			}
		}while(exercicio.intern() != "10" && exercicio.intern() != "11" && exercicio.intern() != "12" && exercicio.intern() != "13" && exercicio.intern() != "14" && exercicio.intern() != "15" && exercicio.intern() != "16" && exercicio.intern() != "17" && exercicio.intern() != "18" && exercicio.intern() != "19" && exercicio.intern() != "20");
		switch(exercicio){
			case "10":
				System.out.print("\nEnunciado: 10 - Qual alternativa possui apenas nomes válidos para arquivos de código fonte Java?\na. Fatec.java e Treinamentos.java.\nb. fatec.java e Treinamentos.Java.\nc. Fatec.JAVA e Treinamentos.java.\nd. FATEC.JAVA e Treinamentos.JAVA.\ne. Fatec.Java e Treinamentos.Java.");
				System.out.print("Resposta: a. Fatec.java e Treinamentos.java."); 
			break;
			case "11":
				System.out.print("\nEnunciado: 11 - Qual é o comando utilizado para executar o compilador da linguagem Java?\na. JavaC\nb. javac\nc. java-compiler\nd. java-run\ne. jc");
				System.out.print("Resposta: b. javac");
			break;
			case "12":
				System.out.print("\nEnunciado: 12 - Qual é o comando utilizado para executar um programa Java? \na. javac\nb. JAVA\nc. java\nd. java-run\ne. jvm");
				System.out.print("Resposta: b. javac");
			break;
			case "13":
				System.out.print("\nEnunciado: 13 - Qual é a extensão dos arquivos que armazenam código compilado de um programa Java?\na. .java\nb. .class\nc. .exe\nd. .prog\ne. .sh");
				System.out.print("Resposta: b. .class");
			break;
			case "14":
				System.out.print("\nEnunciado: 14 - Ao compilar o arquivo Programa.java , quantos arquivos com a extensão .class serão gerados?\nclass Maria {\n\tpublic static void main(String[] args) {\n\t\tSystem.out.println(\"Maria\");\n\t}\n}\nclass Lobato {\n\tpublic static void main(String[] args) {\n\t\tSystem.out.println(\"Lobato\");\n\t}\n}\nclass Jonas {\n\tpublic static void main(String[] args) {\n\t\tSystem.out.println(\"Jonas\");\n\t}\n}\na. Nenhum\nb. Um\nc. Dois\nd. Três\ne. Quatro");
				System.out.print("Resposta: d. Três");
			break;
			case "15":
				System.out.print("\nEnunciado: 15 - Para verificar a versão do compilador Java ou do ambiente de execução Java, qual opção podemos utilizar ao executar os comandos javac ou java?\na. -version\nb. -v\nc. -ver\nd. -versao");
				System.out.print("Resposta: a. -version");
			break;
			case "16":
				System.out.print("\nEnunciado: 16 - Qual alternativa declara corretamente o método main? \na. public static main(String[] args)\nb. public static void Main(String[] args)\nc. void main(String[] args)\nd. static void Main()\ne. public static void main(String[] args)");
				System.out.print("Resposta: e. public static void main(String[] args)");
			break;
			case "17":
				System.out.print("\nEnunciado: 17 - Qual código pode ser utilizado para exibir a mensagem Fatec em Java?\na. system.out.println(\"Fatec \")\nb. System.out.println(\"Fatec \")\nc. System.Console.WriteLine(\"Fatec \")\nd. system.console.writeline(\"Fatec \")\ne. print(\"Fatec \")");
				System.out.print("\n\nResposta: b. System.out.println(\"Fatec \")");
			break;
			case "18":
				System.out.print("\nEnunciado: 18 - Qual sequência de escape indica uma \"quebra de linha\"?\na. \\n\nb. \\r\nc. \\f\nd. \\t\ne. \\b\n");
				System.out.print("\nResposta: a. \\n");
			break;
			case "19":
				System.out.print("\nEnunciado: 19 - Quais são os marcadores utilizados para inserir comentários nos programas em Java?\na. // e %\nb. #, //, /* e */\nc. //, /* e */\nd. <!- - e - ->\ne. % e #");
				System.out.print("\n\nResposta: c. //, /* e */");
			break;
			default:
				System.out.print("\nEnunciado: 20 - Considere o seguinte programa em Java.\n\nclass Argumentos{\n\tpublic static void main(String[] args){\n\t\tSystem.out.println(args[0]);\n\t\tSystem.out.println(args[1]);\n\t}\n}\n\nO que seria exibido na saída padrão se a classe Argumentos fosse executada com o seguinte comando?\njava Argumentos Fatec Livros\na. java e Argumentos\nb. Argumentos e Fatec\nc. Fatec e Livros\nd. java e Fatec\ne. Argumentos e Livros");
				System.out.print("\n\nResposta: a. java e Argumentos");
		}
	}
}

