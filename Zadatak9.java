package zadaca;

import javax.swing.JOptionPane;

public class Zadatak9 {

	public static void main(String[] args) {
		// Kreirati program koji za dva unesena broja ispisuje sve prim brojeve izmeðu njih.

		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		for(int i = prvi; i<=drugi; i++) {
			
			if(i%2!=0 & i%3!=0 & i%5!=0 & i%7!=0) {
				
				System.out.println(i);
				
			}
			
			
		}

		
		
	}

}
