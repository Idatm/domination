	package projet;
	
	public class Domino 
	
	{
		int faceNumero;
		String facePaysageDroite;
		String facePaysageGauche;
		String orientation;
		
		/* Création du constructeur*/
		Domino(int faceNumero,	String type1, String type2,String orientation)
		{
			this.faceNumero = faceNumero;
			this.facePaysageDroite = type1;
			this.facePaysageGauche = type2;
			this.orientation = orientation;
			
	
			
			
		}
		
		// retourne la face numéro du domino
		public int getFaceNumero() 
		{
			return faceNumero;
		}
		
		// retourne le côté droit de la face paysage du domino
		public String getfacePaysageDroite() 
		{
			return facePaysageDroite;
		}
	
		// retourne le côté gauche de la face paysage du domino
		public String getfacePaysageGauche() 
		{
			return facePaysageGauche;
		}
		
		// retourne l'orientation du domino
		public String getOrientation() 
		{
			return orientation;
		}
		
		
		
	
	 
	



}
