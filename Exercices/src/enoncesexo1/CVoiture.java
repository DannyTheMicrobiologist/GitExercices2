package enoncesexo1;

public class CVoiture {
	
	private String m_strMarque = "Lotus";
	private double m_fVitesseMax;
	private double m_fPoidsTotal;
	private CChassis m_Chassis;
	private CMoteur m_Moteur;
	
	
public CVoiture() {
	
	
	this.m_Moteur = new CMoteur();
	this.m_Chassis = new CChassis();
	calculerPoidsTotal();
	calculerVitesseMax();

}


public void afficher() {
	System.out.println("CVoiture [m_strMarque=" + m_strMarque + ", m_fVitesseMax=" + m_fVitesseMax + ", m_fPoidsTotal="
			+ m_fPoidsTotal + ", m_fPoidsChassis=" +  "]");
	m_Moteur.afficher();
	m_Chassis.afficher();
	

}

public CVoiture(String m_strMarque, int m_nPuissanceMoteur) {
	super();
	this.m_strMarque = m_strMarque;

	this.m_Moteur = new CMoteur();
	this.m_Chassis = new CChassis();
	
	calculerPoidsTotal();
	calculerVitesseMax();
}


public CVoiture(String m_strMarque, double m_fVitesseMax, double m_fPoidsTotal) {
	super();
	this.m_strMarque = m_strMarque;
	this.m_fVitesseMax = m_fVitesseMax;
	this.m_fPoidsTotal = m_fPoidsTotal;
	
	this.m_Moteur = new CMoteur();
	this.m_Chassis = new CChassis();
	
	calculerPoidsTotal();
	calculerVitesseMax();
}


public String getM_strMarque() {
	return m_strMarque;
}


public double getM_fVitesseMax() {
	return m_fVitesseMax;
}


public double getM_fPoidsTotal() {
	return m_fPoidsTotal;
}


private void calculerPoidsTotal() {
	m_fPoidsTotal = m_Moteur.getPoids() + m_Chassis.getPoids();
}

private void calculerVitesseMax() {
	m_fVitesseMax = m_fPoidsTotal*m_Moteur.getPuissance()/500;
	
	
	
}

}
