package projet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Joueur 

{
	boolean type;
	String chateau;
	String roi;
	private int nombreJoueurs; // On créé cette variable pour pouvoir récupérer le nombre de joueurs
	private int nombreRoi; // On créé cette variable pour pouvoir récupérer le nombre de roi par joueur
	
	// listeChateau est une variable de type ArrayList qui contient des Strings
	private static ArrayList<String> listeChateau = new ArrayList<String>();
	
	// listeRoi est une variable de type ArrayList qui contient des Strings
	private static ArrayList<String> listeRoi = new ArrayList<String>();
	// On créé une liste de la liste de roi
	//private static List<ArrayList<String>> listeDeListeRoi = new ArrayList<ArrayList<String>>();
	
	// listeTuile est une variable de type ArrayList qui contient des Strings
	private static ArrayList<String> listeTuile = new ArrayList<String>();

	
	public Joueur() 
	{
		
		// Remplir notre liste : château
		listeChateau.add("Rose");
		listeChateau.add("Jaune");
		listeChateau.add("Vert");
		listeChateau.add("Bleu");

		// Remplir notre liste : roi
		listeRoi.add("Rose");
		listeRoi.add("Jaune");
		listeRoi.add("Vert");
		listeRoi.add("Bleu");

		// Remplie notre liste : tuile
		listeTuile.add("tuile1");
		listeTuile.add("tuile2");
		listeTuile.add("tuile3");
		listeTuile.add("tuile4");
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

	// Ne fonctionne pas donc utiliser attributionRoi
	/*public int getRoi() 
	{
		System.out.println(nombreRoi);
		return nombreRoi; // retourne la liste de roi
	}*/
	
	
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
	
	//Permet de saisir le nombre de joueurs pour la partie
	public int nombreJoueur() // ok
	{
		Scanner scanner = new Scanner(System.in);
		
		// On demande à l'utilisateur de saisir le nombre de joueur
		System.out.println("Combien de joueurs pour cette partie ?" + "\n");
		nombreJoueurs = scanner.nextInt();
		
		
		// Tant que le nombre de joueurs est inférieur à 2, on demande à l'utilisateur de saisir un nombre de joueur
		while(nombreJoueurs < 2 ) 
		{
			System.out.println("Vous ne pouvez pas jouer car il n'y a pas assez de joueur" + "\n");
			System.out.println("Veuillez saisir à nouveau le nombre de joueurs compris entre 2 et 4");
			nombreJoueurs = scanner.nextInt();
		}
		
		// Tant que le nombre de joueurs est supérieur à 4, on demande à l'utilisateur de saisir un nombre de joueur
		while(nombreJoueurs > 4 ) 
		{
			System.out.println("Vous ne pouvez pas jouer car il y a trop de joueur" + "\n");
			System.out.println("Veuillez saisir à nouveau le nombre de joueurs compris entre 2 et 4.");
			nombreJoueurs = scanner.nextInt();
		}
	
		if (nombreJoueurs == 2) 
		{
			int nombreTuiles = 1;
			int nombreChateau = nombreJoueurs/nombreJoueurs;
			int nombreRoi = nombreJoueurs;
			System.out.println("Pour cette partie, il y a " + nombreJoueurs + " joueurs.");		
		}	
		
		else if (nombreJoueurs == 3) 
		{
			int nombreTuiles = 1;
			int nombreChateau = nombreJoueurs/nombreJoueurs;
			int nombreRoi = nombreJoueurs/nombreJoueurs;
			System.out.println("Pour cette partie, il y a " + nombreJoueurs + " joueurs.");
		}	
		
		else if (nombreJoueurs == 4) 
		{
			int nombreTuiles = 1;
			int nombreChateau = nombreJoueurs/nombreJoueurs;
			int nombreRoi = nombreJoueurs/nombreJoueurs;
			System.out.println("Pour cette partie, il y a " + nombreJoueurs + " joueurs.");

		}
		//return this.nombreJoueurs; // retourne le nombre de joueur de la partie pour l'utiliser dans les autres classes
		return nombreJoueurs;

	} /*public int nombreJoueur()*/
	

	
	// Attribue un château à chaque joueur suivant le nombre de joueurs
	public  void attributionChateau() 
	{
		
		for(int i = 0; i < nombreJoueurs; i++) 
			{
				//Collections.shuffle(listeChateau);
				//System.out.println("La liste mélangée :" + listeChateau);
				System.out.println("Le joueur" + (i+1) + " possède le château "+ listeChateau.get(i) + ".");
				//listeChateau.remove(i);
			}
			System.out.println(" ");
			System.out.println("Chaque joueur possède un château.");
	} // public  void attributionChateau() 
	
	
	// Attribue une tuile à chaque joueur suivant le nombre de joueurs
	public void attributionTuile() 
	{
		/**
		 * On fait une boucle for qui va permettre de distribuer les tuiles à chaque joueur tant que i est inférieur aux nombres de joueurs saisis**/
		for(int i = 0; i < nombreJoueurs; i++) 
		{
			//Collections.shuffle(listeTuile);
			//System.out.println("La liste mélangée :" + listeTuile);
			System.out.println("Le joueur " + (i+1) + " a " + listeTuile.get(i) + ".");
			//listeTuile.remove(i);
		}
		System.out.println(" ");
		System.out.println("Chaque joueur possède une tuile.");

		
	} // public  void attributionTuile(ArrayList tuile) 
	
	// Attribue un roi suivant la couleur du château et le nombre de joueur
	public ArrayList<String> attributionRoi() 
	{
		boolean compare = listeRoi.equals(listeChateau);
		
		do 
		{
			for(int i=0; i <nombreJoueurs; i++) 
			{
				if(nombreJoueurs == 2) 
				{
					System.out.println("Le joueur " + (i+1) + " a le roi " + listeRoi.get(i) + " et le roi  " + listeRoi.get(i) + ".");
					nombreRoi = i*2;
				}
				//System.out.println("Chaque joueur possède " + nombreRoi + " roi.");

				else if(nombreJoueurs == 3) 
				{
					System.out.println("Le joueur " + (i+1) + " a le roi " + listeRoi.get(i)  + ".");
					nombreRoi = i;

				}
				else if(nombreJoueurs == 4) 
				{
					System.out.println("Le joueur " + (i+1) + " a le roi " + listeRoi.get(i)  + ".");
					nombreRoi = i;

				}
				else 
				{
					System.out.println("non.");
				}
			}
			System.out.println("Chaque joueur possède " + nombreRoi + " roi.");

			break;
			
		}
		while(!compare);
		System.out.println(" ");
		return listeRoi;

	} // public void attributionRoi()

	


}
