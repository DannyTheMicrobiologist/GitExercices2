package enoncesexo1;

public class CMoteur {
	
	private int m_nPuissanceMoteur;
	private double m_fPoidsMoteur;
	
	public CMoteur() {
		// TODO Auto-generated constructor stub
	}

	public CMoteur(int m_nPuissanceMoteur, double m_fPoidsMoteur) {
		super();
		this.m_nPuissanceMoteur = m_nPuissanceMoteur;
		this.m_fPoidsMoteur = m_fPoidsMoteur;
	}

	public void afficher() {
		System.out.println("CMoteur [m_nPuissanceMoteur=" + m_nPuissanceMoteur + ", m_fPoidsMoteur=" + m_fPoidsMoteur + "]");
	}

	public int getPuissance() {
		return m_nPuissanceMoteur;
	}


	public double getPoids() {
		return m_fPoidsMoteur;
	}

	

}
