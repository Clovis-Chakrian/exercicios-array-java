import java.util.Random;

public class Ex08 {
	public static void main(String[] args) {
		int par[] = new int[10];
		int impar[] = new int[10];

		parOuImpar(par, impar);
		
		showArr(par);
		showArr(impar);
		System.out.println("\nHello World");
	}

	public static void parOuImpar(int par[], int impar[]) {
		int parPos = 0;
		int imparPos = 0;
		Random gerador = new Random();

		for (int i = 0; i < 10; i++) {
			int n = gerador.nextInt(20) + 1;
			if (n % 2 == 0) {
				par[parPos] = n;
				parPos++;
			} else {
				impar[imparPos] = n;
				imparPos++;
			}
		}
	}

	public static void showArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("| " + arr[i] + " |");
		}

		System.out.println("\n");
	}
}
