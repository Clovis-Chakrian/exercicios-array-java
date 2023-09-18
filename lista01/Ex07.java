import java.util.Random;

public class Ex07 {
	public static void main (String[] args) {
		Random generator = new Random();
		float arrA[] = new float[10];
		float arrB[] = new float[2];
		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = generator.nextBoolean() ? generator.nextFloat() * 100 : (generator.nextFloat() * 100) * -1;
		}

		arrB = calcArr(arrA);
		showArr(arrA);
		showArr(arrB);
	}

	public static float[] calcArr(float arr[]) {
		float arrB[] = new float[2];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arrB[0]++;
			} else {
				arrB[1] = arrB[1] + arr[i];
			}
		}

		return arrB;
	}

	public static void showArr(float arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("| " + arr[i] + " |");
		}

		System.out.println("\n");
	}
}
