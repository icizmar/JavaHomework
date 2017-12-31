package zadaca;

public class Zadatak8 {

	public static void main(String[] args) {
		// Kreirati program koji ispisuje tablicu množenja 15x15

		int[][] a = new int[15][15];

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				a[i][j] = (i + 1) * (j + 1);

				if (a[i][j] < 10) {

					System.out.print(a[i][j] + "   ");

				} else if (a[i][j] > 9 & a[i][j] < 100) {

					System.out.print(a[i][j] + "  ");

				} else {

					System.out.print(a[i][j] + " ");

				}

			}
			System.out.println();
		}

	}

}
