package p1;

import java.util.Arrays;

public class checkPrimeNumber {
	public static void main(String[] args) {

		int num = 7;
		int arrayLength = 9999;
		int count;

		int list[] = new int[arrayLength];
		for (int x = 0; x < list.length; x++)
			list[x] = x + 1;
	//	System.out.println(Arrays.toString(list));

		for (int y = 0; y < list.length; y++) {
			count = 0;
			for (int x = 1; x < (list[y] + 1); x++) {
				if ((list[y] % x) == 0)
					count++;
			}
			if (count == 2)
				System.out.print(list[y]+ " ");
		}

	}

}
