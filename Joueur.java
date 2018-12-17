
public class Joueur 

{
	boolean type;
	String chateau;
	String roi;
	
	
	/* Création du constructeur*/
	public Joueur(String roi, String chateau, boolean type)
	{
		this.roi = roi;
		this.type = type;
		this.chateau = chateau;
		
	}
	
	// Définit le roi du joueur
	void setRoi(String roiJoueur) 
	{
		roiJoueur = roi;
	}
	
	
	// Définit le type de joueur
	void setType(boolean typeJoueur) 
	{
		typeJoueur = type;
	}
	
	
	
	// retourne le roi
	public String getRoi() 
	{
		return roi;
	}
	
	
	// retourne le type de joueur
	public boolean getType() 
	{
		return type;
	}
	
	
	// retourne le chateau
	public String getChateau() 
	{
		return chateau;
	}
	


}