	
	public class Domino 
	
	{
		int faceNumero;
		String facePaysageDroite;
		String facePaysageGauche;
		/**boolean nombreCouronne1 = false;  booléen car la réponse est soit oui soit non donc soit 1 soit 0
		boolean nombreCouronne2 = false; **/
		int nombreCouronne1;
		int nombreCouronne2;
	
	
		String orientation;
		
		/* Création du constructeur*/
		Domino(int faceNumero,	String type1, String type2,String orientation, int couronne1, int couronne2)
		{
			this.faceNumero = faceNumero;
			this.facePaysageDroite = type1;
			this.facePaysageGauche = type2;
			this.orientation = orientation;
			this.nombreCouronne1 = couronne1;
			this.nombreCouronne2 = couronne2;
	
			
			
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
		
		// retourne le nombre de couronne1
		public int getCouronne1() 
		{
			return nombreCouronne1;
		}
		
		// retourne le nombre de couronne2
				public int getCouronne2() 
				{
					return nombreCouronne2;
				}
		// Définit le nombre de couronne1
		void setCouronne1(int nombre) 
		{
			 nombreCouronne1 += nombre;
	
		}
		
		// Définit le nombre de couronne2
	     void setCouronne2(int nombre) 
		{
			 nombreCouronne2 += nombre;

	
	    }
		
	
	 
	



}