package projet;

import java.util.Scanner;

public class Joueur 

{
	boolean type;
	String chateau;
	String roi;
	private int nombreJoueurs;
	
	/* Cr�ation du constructeur*/
	/*public Joueur(String roi, String chateau, boolean type)
	{
		this.roi = roi;
		this.type = type;
		this.chateau = chateau;
		
	}*/
	public Joueur()
	{}
	// D�finit le roi du joueur
	void setRoi(String roiJoueur) 
	{
		roiJoueur = roi;
	}
	
	
	// D�finit le type de joueur
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
	
	//Permet de saisir le nombre de joueurs pour la partie
	public void nombreJoueur() 
	{
		Scanner scanner = new Scanner(System.in);
		
		//Joueur[] listeJoueurs = null;
		//int nombreJoueurs = 0; // on part du principe qu'il n'y a aucun joueur au d�but du jeu
		System.out.println("Combien de joueurs pour cette partie ?" + "\n");
		nombreJoueurs = scanner.nextInt();
		
		
		// Tant que le nombre de joueurs est inf�rieur � 2, on demande � l'utilisateur de saisir un nombre de joueur
		while(nombreJoueurs < 2 ) 
		{
			System.out.println("Vous ne pouvez pas jouer car il n'y a pas assez de joueur" + "\n");
			System.out.println("Veuillez saisir � nouveau le nombre de joueurs compris entre 2 et 4");
			nombreJoueurs = scanner.nextInt();
		}
		
		// Tant que le nombre de joueurs est sup�rieur � 4, on demande � l'utilisateur de saisir un nombre de joueur
		while(nombreJoueurs > 4 ) 
		{
			System.out.println("Vous ne pouvez pas jouer car il y a trop de joueur" + "\n");
			System.out.println("Veuillez saisir � nouveau le nombre de joueurs compris entre 2 et 4.");
			nombreJoueurs = scanner.nextInt();
		}
	
		if (nombreJoueurs == 2) 
		{
			int nombreTuiles = 1;
			int nombreChateau = nombreJoueurs/nombreJoueurs;
			int nombreRoi = nombreJoueurs;
			System.out.println("Le nombre de joueurs pour cette partie est " + nombreJoueurs + " joueurs." + "\n" + "Chaque joueur poss�de " + nombreTuiles + " tuile" + ". " + "\n" + "Le nombre de ch�teau par joueur est " + nombreChateau + "." + "\n" + "Le nombre de roi par joueur est " + nombreRoi + ".");
		}	
		
		else if (nombreJoueurs == 3) 
		{
			int nombreTuiles = 1;
			int nombreChateau = nombreJoueurs/nombreJoueurs;
			int nombreRoi = nombreJoueurs/nombreJoueurs;
			System.out.println("Le nombre de joueurs pour cette partie est " + nombreJoueurs + " joueurs." + "\n" + "Chaque joueur poss�de " + nombreTuiles + " tuile" + ". " + "\n" + "Le nombre  de ch�teau par joueur est " + nombreChateau + "." + "\n" + "Le nombre de roi par joueur est " + nombreRoi + ".");
			
		}	
		
		else if (nombreJoueurs == 4) 
		{
			int nombreTuiles = 1;
			int nombreChateau = nombreJoueurs/nombreJoueurs;
			int nombreRoi = nombreJoueurs/nombreJoueurs;
			System.out.println("Le nombre de joueurs pour cette partie est " + nombreJoueurs + " joueurs." + "\n" + "Chaque joueur poss�de " + nombreTuiles + " tuile" + ". " + "\n" + "Le nombre  de ch�teau par joueur est " + nombreChateau + "." + "\n" + "Le nombre de roi par joueur est " + nombreRoi + ".");	
		}
	} /*public void nombreJoueur()*/


}
