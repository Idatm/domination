package projet;

public class DemiDomino extends Domino
{
	
	int nombreCouronne1;
	int nombreCouronne2;
	DemiDomino(int faceNumero, String type1, String type2, String orientation)
	{
		// Apr�s l'ex�cution de cette ligne, toutes les valeurs par d�fauts de la classe Domino vont �tre ensemble
		super(faceNumero, type1, type2, orientation);
		
		
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
			// D�finit le nombre de couronne1
			void setCouronne1(int nombre) 
			{
				 nombreCouronne1 += nombre;
		
			}
			
			// D�finit le nombre de couronne2
		     void setCouronne2(int nombre) 
			{
				 nombreCouronne2 += nombre;

		
		    }

}
