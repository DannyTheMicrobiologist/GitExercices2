package exercice1;

import java.util.ArrayList;

public class adresses {
	
	private static int sfr = 0;
	private static int bouygues = 0;
	private static int numericable = 0;
	private static int orange = 0;
	
	public static void csfr() {
		sfr = sfr+1;
	}
	
	public static void cbouygues() {
		bouygues = bouygues + 1;
	}
	
	public static void cnumericable() {
		numericable = numericable + 1;
	}
	
	public static void corange() {
		orange = orange + 1 ;
	}

	public static int getSfr() {
		return sfr;
	}

	public static int getBouygues() {
		return bouygues;
	}

	public static int getNumericable() {
		return numericable;
	}

	public static int getOrange() {
		return orange;
	}
	


	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("martin.dupont@sfr.fr");
		list.add("jean.durant@numericable.fr");
		list.add("marine.petitpont@orange.fr");
	    list.add("jeanne.dupond@numericable.fr");
	    list.add("pierre.lefevre@sfr.fr");
	    list.add("andree.jeanjean@orange.fr");
	    list.add("anne-marie.trival@bouygues.fr");
	    list.add("antoine.antoine@numericable.fr");
	    list.add("titi.grosminet@sfr.fr");
	    list.add("tom.jerry@numericable.fr");
		
		int s = (list.indexOf("@sfr"));
		int n = (list.indexOf("@numericable"));
		int b = (list.indexOf("@bouygues"));
		int o = (list.indexOf("@orange"));
		
		int size = list.size();
		
		for (int i=0; i<size;i++) {
			if (s!=0) {csfr();}
			else if(n!=0) {cbouygues();}
			else if(b!=0) {cnumericable();}
			else if(o!=0) {corange();}
	System.out.println(s);
		}	
		System.out.println(getSfr());
		System.out.println(getBouygues());
		System.out.println(getOrange());
		System.out.println(getNumericable());

		
		
	}

}

