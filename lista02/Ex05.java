public class Ex05 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		String nomes[] = {"Ana", "Clóvis", "Hilaria", "Joao"};
		mostraArr(arr);
		mostraArr(nomes);
		bubbleSort(arr);
		bubbleSort(nomes);
		mostraArr(arr);
		mostraArr(nomes);

	}

	public static void bubbleSort(int arr[]) {
		int i = arr.length;
		while (i >= 2) {
			for (int j = 0; j < i - 1; j++) {
				if (arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}

			i--;
		}
	};

	public static void bubbleSort(String arr[]) {
		int i = arr.length;
		while (i >= 2) {
			for (int j = 0; j < i - 1; j++) {
				if (arr[j].compareToIgnoreCase(arr[j+1]) < 0) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}

			i--;
		}
	};

	public static void mostraArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("| " + arr[i] + " |");
		}

		System.out.println("\n");
	};

	public static void mostraArr(String arr[]) {
		for (String s : arr) {
			System.out.print("| " + s + " |");
		}

		System.out.println("\n\n");
	};
}
