package vjezbanje;

////ZADATAK:
//Na osnovu unesenih redova i kolona generirati tablicu u kojoj
//u doljem desnom uglu se poèinje s brojem jedan. Brojevi se uveæavaju za 1 
// u smjeru kazaljke na satu sve do broja redova*kolona.
import javax.swing.JOptionPane;

public class InchooNew {

	public static void main(String[] args) {

		int brojRedaka = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka"));
		int brojStupaca = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
		int[][] niz = popuniMatricu(brojRedaka, brojStupaca);
		ispisMatrice(brojRedaka, brojStupaca, niz);

	}
	
	private static int[][] popuniMatricu(int a, int b) {

		int[][] mat = new int[a][b];
		int kraj = a * b;
		int element = 0;
		int i = a - 1;
		int j = b;
		int DDj = b - 1;
		int DDi = a - 1;
		int DLi = a - 1;
		int GDi = 0;
		int GLi = 0;
		int DLj = 0;
		int GDj = b - 1;
		int GLj = 0;

		do {
			j--;
			for (j = DDj; j >= DLj; j--) {
				mat[i][j] = ++element;
			}
			j++;
			if (element == kraj) {
				break;
			}

			for (i = DLi - 1; i >= GLi; i--) {
				mat[i][j] = ++element;
			}
			i++;
			if (element == kraj) {
				break;
			}

			for (j = GLj + 1; j <= GDj; j++) {
				mat[i][j] = ++element;
			}
			j--;
			if (element == kraj) {
				break;
			}

			for (i = GDi + 1; i <= (DDi - 1); i++) {
				mat[i][j] = ++element;
			}
			i--;
			if (element == kraj) { // prekida prije nego smanji j za jos jedan i preko veæ postojalog èlana niza ga
									// napise
				break;
			}

			DDi -= 1; // Pomjeranje granica jer nakon svakog kruga dobijemo manju matricu
			DDj -= 1;
			DLi -= 1;
			DLj += 1;
			GLi += 1;
			GLj += 1;
			GDi += 1;
			GDj -= 1;

		} while (element < kraj);
		return mat;
	}

	private static void ispisMatrice(int brojRedaka, int brojStupaca, int[][] niz) {
		
		for (int i = 0; i < brojRedaka; i++) {
			for (int j = 0; j < brojStupaca; j++) {
				
				if (niz[i][j] < 10) {
					System.out.print(niz[i][j] + "   ");
				} else if (niz[i][j] > 9 & niz[i][j] < 100) {
					System.out.print(niz[i][j] + "  ");
				} else {
					System.out.print(niz[i][j] + " ");
				}
			}
			System.out.println();
		}

	}
}
