import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int arr[] = new int[20], arrInvertido[] = new int[20];
		lerArray(arr);
		arrInvertido = inverteArray(arr);
		mostraArr(arr);
		mostraArr(arrInvertido);

	}

	public static void lerArray(int arr[]) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Digite ao lado o item " + i + " do array: ");
			arr[i] = scan.nextInt();
		}
	}

	public static int[] inverteArray(int arr[]) {
		int arrB[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arrB[i] = arr[arr.length - i - 1];
		}

		return arrB;
	}

	public static void mostraArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("| " + arr[i] + " |");
		}

		System.out.println("\n");
	}
}
