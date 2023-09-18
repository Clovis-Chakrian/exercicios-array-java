import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int notas[], nNotas;
		float media;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite ao lado quantas notas você deseja inserir para calcular a média: ");
		nNotas = scan.nextInt();
		notas = new int[nNotas];
		System.out.println("O tamanho vai ser: " + nNotas);
		System.out.println("Agora sua vez de começar a inserir as notas");
		lerNotas(notas);
		media = calcMedia(notas);
		System.out.println("\nA média foi: " + media);
		mostrarMaioresEMenoresNotas(notas, media);
		System.out.println("Fim do programa! Obrigado por usar meu programa :)");
	}

	public static void mostrarMaioresEMenoresNotas(int notas[], float media) {
		System.out.println("Notas maiores que a média:");
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > media) {
				System.out.print("| " + notas[i] + " |");
			}
		}
		System.out.println("\n\nNotas menores que a média:");
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < media) {
				System.out.print("| " + notas[i] + " |");
			}
		}
		System.out.println("\n");
	}

	public static void lerNotas(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = lerInteiro(10, "Digite a nota do aluno " + (i+1) + " ao lado:");
		}
	}

	public static float calcMedia(int notas[]) {
		int soma = 0;
		float media;
		
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}

		media = soma / notas.length;

		return media;
	}

	public static int lerInteiro(int limite, String pergunta) {
		int resposta = 0;
		boolean perguntar = true;
		Scanner scan = new Scanner(System.in);
		while (perguntar) {
			System.out.println("");
			System.out.println("* O valor digitado deve estar entre 0 e " + limite);
			System.out.print(pergunta + " ");
			resposta = scan.nextInt();
			if (resposta <= 50 && resposta >= 0) {
				perguntar = false;
				break;
			}
		}
		

		return resposta;
	};
}
