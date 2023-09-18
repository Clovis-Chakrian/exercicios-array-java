public class Ex04 {
	public static void main(String[] args) {
		int arrA[] = {2, 12, 4, 15, 20, 30, 2, 25};
		int arrB[] = {5, 3, 12, 30, 14, 15, 22, 13};
		mostraInterseccao(arrA, arrB);
	}

	public static void mostraInterseccao(int arrA[], int arrB[]) {
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrB.length; j++) {
				if (arrA[i] == arrB[j]) {
					System.out.print("| " + arrA[i] + " |");
				}
			}
		}

		System.out.println("\n\n");
	}
}
