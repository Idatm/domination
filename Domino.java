
public class Domino {
	
	//Initialisation
	private int face_numero;
	private String face_paysageDroit;
	private String face_paysageGauche;
	private int nbCouronneDroit;
	private int nbCouronneGauche;
	private int orientation = 0;
	
	
	// Constructeur
	Domino(int face_numero, String face_paysageDroit, String face_paysageGauche, int nbCouronneDroit, int nbCouronneGauche, int orientation){
		
		this.face_numero = face_numero;
		this.face_paysageDroit = face_paysageDroit;
		this.face_paysageGauche = face_paysageGauche;
		this.nbCouronneDroit = nbCouronneDroit;
		this.nbCouronneGauche = nbCouronneGauche;
		this.orientation = orientation;
	}
	
	
	// Face numero 
	public void setFace_numero(int numero) {
		face_numero = numero;
	}
	
	public int getFace_numero() {
		return face_numero;
	}
	
	// Face paysage droit
	public void setFace_paysageDroit(String paysage) {
		face_paysageDroit=paysage;
		
	}
	public String getFace_paysageDroit() {
		return face_paysageDroit;
	}
	
	// Face paysage Gauche
	public void set_face_paysageGauche(String paysage) {
		face_paysageGauche=paysage;
		
	}
	
	public String getFace_paysageGauche() {
		return face_paysageGauche;
	}
	
	
	// nombre de couronne cote droit
	public void setNbCouronneDroit(int nouveauNbCouronneDroit) {
		nbCouronneDroit = nouveauNbCouronneDroit;
	}
	public int getNbCouronneDroit() {
		return nbCouronneDroit;
	}
	
	
	// nombre couronne cote gauche
	public void setNbCouronneGauche(int nouveauNbCouronneGauche) {
		nbCouronneGauche = nouveauNbCouronneGauche;
	}
	
	public int getNbCouronneGauche() {
		return nbCouronneGauche;
	}
	
	public void setOrientation(int nouveauOrientation) {
		orientation = nouveauOrientation;
		
	}
	
	public int getOrientation() {
		return orientation;
	}
	
	

}
