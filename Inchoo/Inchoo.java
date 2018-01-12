package vjezbanje;

public class Inchoo {
	
	//Prva proba

	public static void main(String[] args) {

		int[][] niz = new int[4][4];
		int DD = 0;
		int redci = 5;
		int stupci = 5;
		int i = niz.length - 1;
		int j = 0;
		
			
		for (j = niz.length-1; j >= 0; j--) {
			niz[i][j] = ++DD;
		}
		j++;

		for (i = ((niz.length - 1) - 1); i >= 0; i--) {
			niz[i][j] = ++DD;
		}
		i++;

		for (j = 1; j <= niz.length - 1; j++) {
			niz[i][j] = ++DD;
		}
		j--;

		for (i = 1; i <= ((niz.length - 1) - 1); i++) {
			niz[i][j] = ++DD;
		}
		i--;
		j--;
		niz[i][j] = ++DD;
		

		for (i = 0; i < niz.length; i++) {
			for (j = 0; j < niz.length; j++) {
				
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
