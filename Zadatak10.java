package zadaca;

import javax.swing.JOptionPane;

public class Zadatak10 {

	public static void main(String[] args) {
		// Keirati program koji unosi dvije matrice 4x4 te ispisuje njihov zbroj

		int[][] a = new int[4][4];
		int[][] b = new int[4][4];
		int[][] c = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = Integer.parseInt(
						JOptionPane.showInputDialog("Unesi[" + (i + 1) + "][" + (j + 1) + "] element a matrice"));
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				b[i][j] = Integer.parseInt(
						JOptionPane.showInputDialog("Unesi[" + (i + 1) + "][" + (j + 1) + "] element b matrice"));
			}
		}

		System.out.println("Matrica dobivena zbrajanjem: ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				c[i][j] = a[i][j] + b[i][j];

				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
