public class Ex03 {
	public static void main(String[] args) {
		int arr[] = {5, 7, 9, 2};
		mostraSimetrico(arr);
	}

	public static void mostraSimetrico(int arr[]) {
		for (int i = 0; i  < arr.length; i++) {
			System.out.print("| " + arr[i] + " -- " + arr[arr.length - (i+1)] + " |");
		}

		System.out.println("\n");
	}
}
