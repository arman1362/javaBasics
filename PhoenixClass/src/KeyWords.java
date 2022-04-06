
public class KeyWords {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				// break;
				continue; // it will skip 5
			}
			System.out.println(i);
		}
		System.out.println("--------");

		for (int j = 0; j < 10; j++) {
			if (j > 5 && j < 8) {
				continue; // it will skip 6 and 7
			}

			System.out.println(j);
		}

		System.out.println("-------------");

		for (int k = 0; k < 10; k++) {
			if (k % 2 == 0) {
				continue; // skipping even numbers
			}
			System.out.println(k);
		}

		System.out.println("-------------");

		for (int l = 0; l < 10; l++) {
			if (l % 2 != 0) {
				continue; // skipping odd numbers
			}
			System.out.println(l);
		}

		System.out.println("-------------");

		outer: for (int m = 0; m < 10; m++) {
			inner: for (int n = 0; n < 10; n++) {
				System.out.print(m * n + "\t");
				if (m * n > 20) {
					break outer;
				}
			}

			System.out.println();
		}

		// Final keyword will make constant variables
		// 1. final variables: you can not assign a new value to the final variable
		// after the first time
		// 2. final methods: final methods can not be overriden
		// 3. final class: final classes can not be inherited

		final int x = 10;
//		x = 20;

	}
}
