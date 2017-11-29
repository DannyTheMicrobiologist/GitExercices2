package enoncesexo1;

public abstract class CVehicule {
	
	protected String m_strMarque = "Lotus";
	protected double m_fVitesseMax;
	protected double m_fPoidsTotal;
	protected CChassis m_Chassis;
	protected CMoteur m_Moteur;
	
	public CVehicule() {
	
		super();
		
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
	
	

}
