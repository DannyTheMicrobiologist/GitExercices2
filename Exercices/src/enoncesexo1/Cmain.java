package enoncesexo1;

import java.util.Scanner;

public class Cmain {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la marque du véhicule");
		String str = sc.nextLine();
		
		if (str.equals("")) { CVoiture voiture1 = new CVoiture();
		voiture1.afficher();
			
		}
		
		else { System.out.println("Veuillez saisir la puissance du véhicule");
		String str1 = sc.nextLine();
		CVoiture voiture1 = new CVoiture(str, Integer.parseInt(str1));
		voiture1.afficher();
		}
		

	}

}
