package enoncesexo1;

public class CChassis {

	private double m_fPoidsChassis;

	public CChassis(double m_fPoidsChassis) {
		super();
		this.m_fPoidsChassis = m_fPoidsChassis;
	}
	
	public CChassis() {
		
	}

	public void afficher() {
		 System.out.println("CChassis [m_fPoidsChassis=" + m_fPoidsChassis + "]");
	}

	public double getPoids() {
		return m_fPoidsChassis;
	}
	
	
	
}
