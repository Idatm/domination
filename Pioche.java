package projet;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

public class Pioche extends CSVRead

{
	//private int nombreJoueurs;
	Joueur nbJoueurs = new Joueur();
	//Pioche pioche = new Pioche();
	private int size_1 = 24;
	private int size_2 = 36;
	private int nombreRoi;
	
	public Pioche() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void removeElement() 
	{
		System.out.println("REMOVE");
		System.out.println("Liste à l'état initial : " + csvValeurs);
		
		//On parcourt notre liste avec une boucle for jusqu'à l'index 5 puiqu'on souhaite garder que les dominos dans cette liste
		/*for(int i =0; i < 5; i++) 
		{
			csvValeurs.remove(0);
		}
		System.out.println("Liste à l'état final : " + csvValeurs);*/
		for(int i =0; i < 1; i++) 
		{
			csvValeurs.remove(0);
		}
		System.out.println("Liste à l'état final : " + csvValeurs);

	} // 	public void removeElement() 
	
	// On va retirer le bon nombre de domino dans la liste suivant le nombre de joueur saisi
		public void removeDomino() 
		{
			//Joueur nbJoueurs = new Joueur();
		
			System.out.println("REMOVE DOMINO");
			// Affiche la liste de dominos à l'état initial
			System.out.println("Liste à l'état initial : " + parts + " de taille " + parts.size());
			System.out.println(" ");
			int i=0;
			
			// Si le nombre de joueurs = 2 => on retire 24 dominos	
			if(nbJoueurs.nombreJoueur() == 2)
			{
				while(parts.size() != size_1) // // size_1 = 24
				{
				
						parts.remove(0);
		
				}
				System.out.println("New :" + parts);
		
			}
		
			else if(nbJoueurs.nombreJoueur() == 3) 
			{
				while(parts.size() != size_2) // size_2 = 36
				{
					parts.remove(0);
				}
				System.out.println("New :" + parts); // Affiche la liste avec la bonne quantité de domino en lien avec le nombre de joueurs
		
			}
			else 
			{
				System.out.println(parts);
			}

		} // 	public void removeDomino() 
	
	
	
		public void premierTour() 
		{
			// On parcourt la liste de domino
			for(int i =0; i < parts.size(); i++) 
			{
				// On affiche les éléments de la liste suivant l'index
				//System.out.println(parts.get(i)); 
				
			}
			
			nbJoueurs.attributionRoi(); // Retourne la couleur de chaque roi suivant le nombre de joueur
			
			if(parts.size() == size_1) // && nombreRoi ==2 dès qu'on ajoute cette condition, la boucle if n'est pas prise en compte
			{
				
					parts.remove(2); // Enlève l'élément à l'indice 2 et non pas la quantité
					System.out.println("1. " + parts); // Affiche bien la liste de domino sans les dominos enlevés en lien avec le nombre de roi

				

			}

			else  
			{
				System.out.println("non");
			}
			
			/*if(nombreRoi == 1 && parts.size() == size_2) 
			{
				System.out.println("Chaque joueur possède 1 roi");
				parts.remove(nombreRoi); // On enlève dans la pioche de domino le nombre de roi
				System.out.println("2. " + parts); // Affiche bien la liste de domino sans les dominos enlevés en lien avec le nombre de roi

			}
			else 
			{
				System.out.println("non");
			}

			/*if(nombreRoi == 1 && parts.size() == size_1) 
			{
				System.out.println("Chaque joueur possède 1 roi");
				parts.remove(nombreRoi); // On enlève dans la pioche de domino le nombre de roi
			}

			System.out.println(parts); // Affiche bien la liste de domino sans les dominos enlevés en lien avec le nombre de roi*/

		} // public void premierTour() 


	

	
	
 
	

}

	
	

	

