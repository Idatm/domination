package projet;

import java.awt.Color;
import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Main 

{
	
	private static int nombreJoueurs = 0; // on part du principe qu'il n'y a aucun joueur au d�but du jeu
	
	// listeChateau est une variable de type ArrayList qui contient des Strings
	private static ArrayList<String> listeChateau = new ArrayList<String>();
	private static ArrayList<String> listeRoi = new ArrayList<String>();
	private static ArrayList<String> listeTuile = new ArrayList<String>();



	public static void main(String[] args)
	{
	
			// On ajoute les �l�ments dans nos listes	
				// Remplir notre liste : ch�teau
				listeChateau.add("chateauRose");
				listeChateau.add("chateauJaune");
				listeChateau.add("chateauVert");
				listeChateau.add("chateauBleu");
				
				// Remplir notre liste : roi
				listeRoi.add("roiRose");
				listeRoi.add("roiJaune");
				listeRoi.add("roiVert");
				listeRoi.add("roiBleu");
				listeRoi.add("roiRose");
				listeRoi.add("roiJaune");
				listeRoi.add("roiVert");
				listeRoi.add("roiBleu");
				
				// Remplie notre liste : tuile
				listeTuile.add("tuile1");
				listeTuile.add("tuile2");
				listeTuile.add("tuile3");
				listeTuile.add("tuile4");

		
		
		int menu = 0;
		System.out.println("Saisir 1 pour afficher la liste des dominos");
		System.out.println("Saisir 2 pour afficher la liste de ch�teau, de roi et de tuile");
		System.out.println("Saisir 3 pour saisir le nombre de joueur");
		System.out.println("Saisir 4 pour afficher le royaume");
		System.out.println("Saisir 5 pour afficher le plateau");
		System.out.println("Saisir 6 pour prendre un ch�teau");
		System.out.println("Saisir 7 pour prendre une tuile");
		System.out.println("Saisir 8 pour prendre un roi");
		System.out.println("Saisir 9 pour quitter");


		Scanner scan = new Scanner(System.in);
		menu = scan.nextInt();

		switch(menu) 
		{
		
			case 1:
				// Permet de lire le fhichier csv o� on trouve les dominos
				/*lireCSVFile();
				break;*/
				
		
		
			case 2:
			
		      /** // listeChateau est une variable de type ArrayList qui contient des Strings
				ArrayList<String> listeChateau = new ArrayList<String>();
				ArrayList<String> listeRoi = new ArrayList<String>();
	
				// Remplir notre liste : ch�teau
				listeChateau.add("chateauRose");
				listeChateau.add("chateauJaune");
				listeChateau.add("chateauVert");
				listeChateau.add("chateauBleu");
				
				// Remplir notre liste : roi
				listeRoi.add("roiRose");
				listeRoi.add("roiJaune");
				listeRoi.add("roiVert");
				listeRoi.add("roiBleu");
				listeRoi.add("roiRose");
				listeRoi.add("roiJaune");
				listeRoi.add("roiVert");
				listeRoi.add("roiBleu");**/
				
				//Appel de la m�thode
				materielJeu(listeChateau, listeRoi, listeTuile);
				break;
			
			case 3:
				System.out.println("----------------------Nombre de Joueurs----------------------");
				Joueur nombreJoueurs = new Joueur();
				nombreJoueurs.nombreJoueur();
				//nombreJoueur();
				break;
			case 4:
				// Cr�ation d'un royaume de taille 5*5
				Royaume royaume_1 = new Royaume(5,5);
				
				// On place le ch�teau au centre du royaume
				royaume_1.placer(3, 3, 'c');
				
				//On affiche le royaume
				System.out.println("----------------------Royaume----------------------");
				royaume_1.afficher();
				
				/**PLUS BESOIN !! **/
				//Placement
				// cr�ation de la matrice 5*5 pour la taille du royaume
				/*int [][] royaume = new int[5][5];
				Royaume(royaume);*/
				break;
			case 5:
				// Cr�ation du plateau de jeu
				Plateau plateau = new Plateau(25,25);
			
				//Placement de 4 royaumes sur le plateau
				plateau.placer(3, 3, 'R'); // avec R un caract�re et non un string !! => PLACEMENT ROYAUME
				plateau.placer(10, 19, 'R'); // avec R un caract�re et non un string !! => PLACEMENT ROYAUME
				plateau.placer(14, 23, 'R'); // avec R un caract�re et non un string !! => PLACEMENT ROYAUME
				plateau.placer(7, 11, 'R'); // avec R un caract�re et non un string !! => PLACEMENT ROYAUME
				
				// Affichage
				System.out.println("----------------------Plateau----------------------");
				System.out.println("R = Royaume");
				System.out.println(" ");
				plateau.afficher();
				break;
			case 6:
				attributionChateau(listeChateau);
				break;
			case 7:
				attributionTuile(listeTuile);
				break;
			case 8:
				attributionRoi(); // m�thode pas termin�e !!!
				break;
			case 9:
				System.exit(0);
				break;
			
		
		}
		
	
	
	}
	
	/**
	 *  Permet de lire le fhichier csv o� on trouve les dominos
	
	public static void lireCSVFile()  
	{ 
		// .csv virgule qui s�pare les valeurs 
				String fileName = "dominos.csv"; // enregistr� dans le m�me dossier que le main
				File file = new File(fileName); // lit le fichier
		
				
				try 
				{
					Scanner inputStream = new Scanner(file); 
					while(inputStream.hasNext()) 
					{
					
						String data = inputStream.next();
						System.out.println(data + " ");
					
					}
		
					// Ferme le fichier
					inputStream.close();
				}
				// catch l'exception si on ne trouve pas le fichier car il est plac� au mauvais endroit
				catch(FileNotFoundException e) 
				{
					e.printStackTrace();
				}
	} /*public static void lireCSVFile() */
	
	
	
	public static void materielJeu(ArrayList listeChateau, ArrayList listeRoi, ArrayList listeTuile)

	{
		// On parcourt la liste de ch�teau o� on y met tous les ch�teaux du jeu
		System.out.println("-----------------Liste ch�teau--------------------");
		for (int i = 0; i < listeChateau.size(); i++) 
		{	
			System.out.println("L'�l�ment � l'index " + i + " = " + listeChateau.get(i));
			
		}
		System.out.println("");
		
		
		// On parcourt la liste de roi o� on y met tous les rois du jeu
		System.out.println("-----------------Liste roi--------------------");
		for (int i = 0; i < listeRoi.size(); i++) 
		{
			System.out.println("L'�l�ment � l'index " + i + " = " + listeRoi.get(i));
			

		}
		System.out.println("");
		// On parcourt la liste de tuile o� on y met toutes les tuiles du jeu
		System.out.println("-----------------Liste tuile--------------------");
				for (int i = 0; i < listeTuile.size(); i++) 
				{
					System.out.println("L'�l�ment � l'index " + i + " = " + listeTuile.get(i));
				}
		
	
	} /*public static void materielJeu(ArrayList listeChateau, ArrayList listeRoi)*/
	
	
	
	
	/*public static void nombreJoueur() 
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
	} /*public static void nombreJoueur()*/
	

	public static void attributionTuile(ArrayList tuile) 
	{
		int choix = 0;
		// On m�lange la liste de ch�teau
		 // On m�lange la liste de ch�teaux avant la distribution
		
		System.out.println("------------------------------------ATTRIBUTION TUILE AUX JOUEURS-------------------------------------------------------");
		System.out.println("Saisir 1 s'il y a 2 joueurs");
		System.out.println("Saisir 2 s'il y a 3 joueurs");
		System.out.println("Saisir 3 s'il y a 4 joueurs");
		
		
		Scanner scan = new Scanner(System.in);
		choix = scan.nextInt();
		switch(choix) 
		{
		case 1: // 2 joueurs
			for(int i=0; i < 1; i++) 
			{
						/**Joueur 1
						 * On attribue une tuile au joueur**/
				
						//On m�lange � nouveau la liste
						Collections.shuffle(listeTuile);
						
						// On affiche la liste m�lang�e
						System.out.println("La liste m�lang�e : " + listeTuile);
						
						// On attribue � joueur 1 son ch�teau
						System.out.println("Le premier joueur a " + listeTuile.get(i));
						
						// On enl�ve de la liste, le ch�teau du joueur 1
						listeTuile.remove(i);
						
						//On affiche la liste en l'�tat
						System.out.println("Il reste ces tuiles dans la liste : " +listeTuile);
						System.out.println(" ");
						
						/**Joueur 2
						 * Une fois que joueur 1 a choisi, c'est au tour de joueur 2
						 * On attribue au joueur 2 un ch�teau pris au hasard dans la liste des ch�teaux
						 * Une fois que le ch�teau est pris, on le retire de la liste
						 * On affiche la liste en l'�tat c'est-�-dire avec les ch�teaux restant**/
						
						//On m�lange � nouveau la liste
						Collections.shuffle(listeTuile);
						
						// On affiche la liste m�lang�e
						System.out.println("La liste m�lang�e : " + listeTuile);
						
						// On attribue � joueur 2 son ch�teau
						System.out.println("Le second joueur a " + listeTuile.get(i));
						
						System.out.println("Tous les joueurs ont une tuile de d�part.");
					
			}
			break;
		case 2: // 3 joueurs
			for(int i=0; i < 1; i++) 
			{
						/**Joueur 1
						 * On attribue une tuile au joueur**/
				
						//On m�lange � nouveau la liste
						Collections.shuffle(listeTuile);
						
						// On affiche la liste m�lang�e
						System.out.println("La liste m�lang�e : " + listeTuile);
						
						// On attribue � joueur 1 son ch�teau
						System.out.println("Le premier joueur a " + listeTuile.get(i));
						
						// On enl�ve de la liste, le ch�teau du joueur 1
						listeTuile.remove(i);
						
						//On affiche la liste en l'�tat
						System.out.println("Il reste ces tuiles dans la liste : " +listeTuile);
						System.out.println(" ");
						
						/**Joueur 2
						 * Une fois que joueur 1 a choisi, c'est au tour de joueur 2
						 * On attribue au joueur 2 un ch�teau pris au hasard dans la liste des ch�teaux
						 * Une fois que le ch�teau est pris, on le retire de la liste
						 * On affiche la liste en l'�tat c'est-�-dire avec les ch�teaux restant**/
						
						//On m�lange � nouveau la liste
						Collections.shuffle(listeTuile);
						
						// On affiche la liste m�lang�e
						System.out.println("La liste m�lang�e : " + listeTuile);
						
						// On attribue � joueur 2 sa tuile
						System.out.println("Le second joueur a " + listeTuile.get(i));
						
						// On enl�ve de la liste, la tuile du joueur 2
						listeTuile.remove(i);
						
						//On affiche la liste en l'�tat
						System.out.println("Il reste ces tuiles dans la liste : " +listeTuile);
						System.out.println(" ");
						
						// On attribue � joueur 3 sa tuile
						System.out.println("Le troisi�me joueur a " + listeTuile.get(i));
						System.out.println("Tous les joueurs ont une tuile de d�part.");
					
			}
			break;
		case 3: // 4 joueurs
			for(int i=0; i < 1; i++) 
			{
						/**Joueur 1
						 * On attribue une tuile au joueur**/
				
						//On m�lange � nouveau la liste
						Collections.shuffle(listeTuile);
						
						// On affiche la liste m�lang�e
						System.out.println("La liste m�lang�e : " + listeTuile);
						
						// On attribue � joueur 1 son ch�teau
						System.out.println("Le premier joueur a " + listeTuile.get(i));
						
						// On enl�ve de la liste, le ch�teau du joueur 1
						listeTuile.remove(i);
						
						//On affiche la liste en l'�tat
						System.out.println("Il reste ces tuiles dans la liste : " +listeTuile);
						System.out.println(" ");
						
						/**Joueur 2
						 * **/
						//On m�lange � nouveau la liste
						Collections.shuffle(listeTuile);
						
						// On affiche la liste m�lang�e
						System.out.println("La liste m�lang�e : " + listeTuile);
						
						// On attribue � joueur 2 sa tuile
						System.out.println("Le second joueur a " + listeTuile.get(i));
						
						// On enl�ve de la liste, la tuile du joueur 2
						listeTuile.remove(i);
						
						//On affiche la liste en l'�tat
						System.out.println("Il reste ces tuiles dans la liste : " +listeTuile);
						System.out.println(" ");
						
						/**Joueur 3
						 * **/
						// On attribue � joueur 3 sa tuile
						System.out.println("Le troisi�me joueur a " + listeTuile.get(i));
						// On enl�ve de la liste, la tuile du joueur 3
						listeTuile.remove(i);
						
						//On affiche la liste en l'�tat
						System.out.println("Il reste ces tuiles dans la liste : " +listeTuile);
						System.out.println(" ");
						
						/**Joueur 4**/
						System.out.println("Le dernier joueur a " + listeTuile.get(i));
						System.out.println("Tous les joueurs ont une tuile de d�part.");
					
			}
			break;
		}
	} // public static void attributionTuile(ArrayList tuile) 
	
	public static void attributionChateau(ArrayList listeChateau) 
	{
		
			int choix = 0;
			// On m�lange la liste de ch�teau
			 // On m�lange la liste de ch�teaux avant la distribution
			
			System.out.println("------------------------------------ATTRIBUTION CH�TEAU AUX JOUEURS-------------------------------------------------------");
			System.out.println("Saisir 1 s'il y a 2 joueurs");
			System.out.println("Saisir 2 s'il y a 3 joueurs");
			System.out.println("Saisir 3 s'il y a 4 joueurs");
			
			
			Scanner scan = new Scanner(System.in);
			choix = scan.nextInt();
			switch(choix) 
			{
				case 1: // 2 joueurs
					for(int i=0; i < 1; i++) 
					{
								/**Joueur 1
								 * On attribue au joueur 1 un ch�teau pris au hasard dans la liste des ch�teaux
								 * Une fois que le ch�teau est pris, on le retire de la liste
								 * On affiche la liste en l'�tat c'est-�-dire avec les ch�teaux restant**/
						
								//On m�lange � nouveau la liste
								Collections.shuffle(listeChateau);
								
								// On affiche la liste m�lang�e
								System.out.println("La liste m�lang�e : " + listeChateau);
								
								// On attribue � joueur 1 son ch�teau
								System.out.println("Le premier joueur a " + listeChateau.get(i));
								
								// On enl�ve de la liste, le ch�teau du joueur 1
								listeChateau.remove(i);
								
								//On affiche la liste en l'�tat
								System.out.println("Il reste ces ch�teaux dans la liste : " +listeChateau);
								System.out.println(" ");
								
								/**Joueur 2
								 * Une fois que joueur 1 a choisi, c'est au tour de joueur 2
								 * On attribue au joueur 2 un ch�teau pris au hasard dans la liste des ch�teaux
								 * Une fois que le ch�teau est pris, on le retire de la liste
								 * On affiche la liste en l'�tat c'est-�-dire avec les ch�teaux restant**/
								
								//On m�lange � nouveau la liste
								Collections.shuffle(listeChateau);
								
								// On affiche la liste m�lang�e
								System.out.println("La liste m�lang�e : " + listeChateau);
								
								// On attribue � joueur 2 son ch�teau
								System.out.println("Le second joueur a " + listeChateau.get(i));
								
								System.out.println("Tous les joueurs ont un ch�teau.");
							
					}
					break;
				case 2: // 3 joueurs
					for(int i=0; i < 1; i++) 
					{
								/**Joueur 1
								 * On attribue au joueur 1 un ch�teau pris au hasard dans la liste des ch�teaux
								 * Une fois que le ch�teau est pris, on le retire de la liste
								 * On affiche la liste en l'�tat c'est-�-dire avec les ch�teaux restant**/
						
								//On m�lange � nouveau la liste
								Collections.shuffle(listeChateau);
								
								// On affiche la liste m�lang�e
								System.out.println("La liste m�lang�e : " + listeChateau); 
								
								// On attribue � joueur 1 son ch�teau
								System.out.println("Le premier joueur a " + listeChateau.get(i));
								
								// On enl�ve de la liste, le ch�teau du joueur 1
								listeChateau.remove(i);
								
								//On affiche la liste en l'�tat
								System.out.println("Il reste ces ch�teaux dans la liste : " +listeChateau);
								System.out.println(" ");
								
								/**Joueur 2
								 * Une fois que joueur 1 a choisi, c'est au tour de joueur 2
								 * On attribue au joueur 2 un ch�teau pris au hasard dans la liste des ch�teaux
								 * Une fois que le ch�teau est pris, on le retire de la liste
								 * On affiche la liste en l'�tat c'est-�-dire avec les ch�teaux restant**/
								
								//On m�lange � nouveau la liste
								Collections.shuffle(listeChateau);
								
								// On affiche la liste m�lang�e
								System.out.println("La liste m�lang�e : " + listeChateau);
								
								// On attribue � joueur 3 son ch�teau
								System.out.println("Le second joueur a " + listeChateau.get(i));
								
								// On enl�ve de la liste, le ch�teau du joueur 2
								listeChateau.remove(i);
								
								//On affiche la liste en l'�tat
								System.out.println("Il reste ces ch�teaux dans la liste : " +listeChateau);
								System.out.println(" ");
								
								
								/**Joueur 3
								 * Une fois que joueur 2 a choisi, c'est au tour de joueur 3
								 * On attribue au joueur 3 un ch�teau pris au hasard dans la liste des ch�teaux
								 * Une fois que le ch�teau est pris, on le retire de la liste
								 * On affiche la liste en l'�tat c'est-�-dire avec les ch�teaux restant**/
								
								//On m�lange � nouveau la liste
								Collections.shuffle(listeChateau);
								
								// On affiche la liste m�lang�e
								System.out.println("La liste m�lang�e : " + listeChateau);
								
								// On attribue � joueur 3 son ch�teau
								System.out.println("Le troisi�me joueur a " + listeChateau.get(i));
								System.out.println("Tous les joueurs ont un ch�teau.");

					}
					break;
				case 3: // 4 joueurs
					for(int i=0; i < 1; i++) 
					{
								/**Joueur 1
								 * On attribue au joueur 1 un ch�teau pris au hasard dans la liste des ch�teaux
								 * Une fois que le ch�teau est pris, on le retire de la liste
								 * On affiche la liste en l'�tat c'est-�-dire avec les ch�teaux restant**/
						
								//On m�lange � nouveau la liste
								Collections.shuffle(listeChateau);
								
								// On affiche la liste m�lang�e
								System.out.println("La liste m�lang�e : " + listeChateau); 
								
								// On attribue � joueur 1 son ch�teau
								System.out.println("Le premier joueur a " + listeChateau.get(i));
								
								// On enl�ve de la liste, le ch�teau du joueur 1
								listeChateau.remove(i);
								
								//On affiche la liste en l'�tat
								System.out.println("Il reste ces ch�teaux dans la liste : " +listeChateau);
								System.out.println(" ");
								
								/**Joueur 2
								 * Une fois que joueur 1 a choisi, c'est au tour de joueur 2
								 * On attribue au joueur 2 un ch�teau pris au hasard dans la liste des ch�teaux
								 * Une fois que le ch�teau est pris, on le retire de la liste
								 * On affiche la liste en l'�tat c'est-�-dire avec les ch�teaux restant**/
								
								//On m�lange � nouveau la liste
								Collections.shuffle(listeChateau);
								
								// On affiche la liste m�lang�e
								System.out.println("La liste m�lang�e : " + listeChateau);
								
								// On attribue � joueur 2 son ch�teau
								System.out.println("Le second joueur a " + listeChateau.get(i));
								
								// On enl�ve de la liste, le ch�teau du joueur 2
								listeChateau.remove(i);
								
								//On affiche la liste en l'�tat
								System.out.println("Il reste ces ch�teaux dans la liste : " +listeChateau);
								System.out.println(" ");
								
								
								/**Joueur 3
								 * Une fois que joueur 2 a choisi, c'est au tour de joueur 3
								 * On attribue au joueur 3 un ch�teau pris au hasard dans la liste des ch�teaux
								 * Une fois que le ch�teau est pris, on le retire de la liste
								 * On affiche la liste en l'�tat c'est-�-dire avec les ch�teaux restant**/
								
								//On m�lange � nouveau la liste
								Collections.shuffle(listeChateau);
								
								// On affiche la liste m�lang�e
								System.out.println("La liste m�lang�e : " + listeChateau);
								
								// On attribue � joueur 3 son ch�teau
								System.out.println("Le troisi�me joueur a " + listeChateau.get(i));
								
								// On enl�ve de la liste, le ch�teau du joueur 3
								listeChateau.remove(i);
								
								//On affiche la liste en l'�tat
								System.out.println("Il reste ces ch�teaux dans la liste : " +listeChateau);
								System.out.println(" ");
								
								/**Joueur 4
								 * Une fois que joueur 3 a choisi, c'est au tour de joueur 4
								 * On attribue au joueur 4 un ch�teau pris au hasard dans la liste des ch�teaux
								 **/
								
								// On attribue � joueur 3 son ch�teau
								System.out.println("Le dernier joueur a " + listeChateau.get(i));
								System.out.println("Tous les joueurs ont un ch�teau.");
								
					
					}
					break;
		}
					
	
		      
								
		
	} // public static void attributionChateau() 
	
	public static void attributionRoi() 
	{
				// On cr�e un bool�en joueurs pour notre boucle while (tant qu'il y a des joueurs)
				boolean joueurs=true;
					// Pour 2 joueurs
					if(nombreJoueurs == 2) 
					{
						/*Joueur joueur_1 = new Joueur("roiRose","chateauRose",true);
						Joueur joueur_2 = new Joueur("roiBleu","chateauBleu",true);

						joueur_1.getChateau();
						joueur_1.getRoi();
						System.out.println(joueur_1);

						joueur_2.getChateau();
						joueur_2.getRoi();*/
					}
				
	} // public static void attributionRoi() 
	
	
	
	/** Plus besoin de cette m�thode !!**/
	// On cr�� une matrice pour notre royaume � cause de sa taille 5*5 qui est le m�me format que la matrice
	/*public static void Royaume(int[][] royaume) 
	{	
		//Initialisation du royaume
		for(int i =0; i<5; i++) 
		{
			for(int j=0; j<5; j++) 
			{
				if(i==0 || j==0 || i==5 || i==5) 
				{
					royaume[i][j] = 1;
				}
				else 
				{
					royaume[i][j] = 0;
				}
			}
		}
		
		for(int i =0; i<5; i++) 
		{
			for(int j=0; j<5; j++) 
			{
				System.out.print("_" + royaume[i][j] + "|");
			}
			System.out.println("  ");
		}
	
		
	} // public static void Royaume(int[][] royaume)*/
	
	// Placer le ch�teau au centre du royaume
	public static void Chateau(ArrayList listeChateau) 
	{
		
	}

	

}
