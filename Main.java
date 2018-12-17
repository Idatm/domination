

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Main 

{
	/**int PLATEAU_HEIGHT = 900;
	int PLATEAU_WIDTH = 900;
	**/
	


	public static void main(String[] args)
	{
		
		
		
		int menu = 0;
		System.out.println("Saisir 1 pour afficher la liste des dominos");
		System.out.println("Saisir 2 pour afficher la liste de ch�teau et de roi");
		System.out.println("Saisir 3 pour saisir le nombre de joueur");
		System.out.println("Saisir 4 pour afficher le royaume");
		System.out.println("Saisir 5 pour quitter");


		Scanner scan = new Scanner(System.in);
		menu = scan.nextInt();

		switch(menu) 
		{
		
			case 1:
				// Permet de lire le fhichier csv o� on trouve les dominos
				lireCSVFile();
				break;
				
		
		
			case 2:
				// listeChateau est une variable de type ArrayList qui contient des Strings
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
				listeRoi.add("roiBleu");
				
				//Appel de la m�thode
				materielJeu(listeChateau, listeRoi);
				break;
			
			case 3:
				nombreJoueur();
				break;
			case 4:
				// cr�ation de la matrice 9*9 pour la taille du royaume
				int [][] royaume = new int[9][9];
				Royaume(royaume);
			case 5:
				System.exit(0);
			
		
		}
		
	
	
	}
	
	// Permet de lire le fhichier csv o� on trouve les dominos
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
	
	
	
	public static void materielJeu(ArrayList listeChateau, ArrayList listeRoi)

	{
		// On parcourt la liste de ch�teau o� on y met tous les ch�teaux du jeu
		for (int i = 0; i < listeChateau.size(); i++) 
		{
			System.out.println("L'�l�ment � l'index " + i + " = " + listeChateau.get(i));
		}
		
		// On parcourt la liste de roi o� on y met tous les rois du jeu
		for (int i = 0; i < listeRoi.size(); i++) 
		{
			System.out.println("L'�l�ment � l'index " + i + " = " + listeRoi.get(i));
		}
	
	} /*public static void materielJeu(ArrayList listeChateau, ArrayList listeRoi)*/
	
	
	
	public static void nombreJoueur() 
	{
		Scanner scanner = new Scanner(System.in);
		int nombreDominos = 48; // Il y a 48 dominos dans le jeu


		
		Joueur[] listeJoueurs = null;
		int nombreJoueurs = 0; // on part du principe qu'il n'y a aucun joueur au d�but du jeu
		System.out.println("Combien de joueurs pour cette partie ?" + "\n");
		nombreJoueurs = scanner.nextInt();
		
		
		// Tant que le nombre de joueurs est inf�rieur � 2, on demande � l'utilisateur de saisir un nombre de joueur
		while(nombreJoueurs < 2 ) 
		{
			System.out.println("Vous ne pouvez pas jouer car il n'y a pas assez de joueur" + "\n");
			System.out.println("Veuillez saisir � nouveau le nombre de joueurs compris entre 2 et 4");
			nombreJoueurs = scanner.nextInt();
		}
		//System.out.println("Le nombre de joueurs pour cette partie est " + nombreJoueurs + " joueurs.");
		
		// Tant que le nombre de joueurs est sup�rieur � 4, on demande � l'utilisateur de saisir un nombre de joueur
		while(nombreJoueurs > 4 ) 
		{
			System.out.println("Vous ne pouvez pas jouer car il y a trop de joueur" + "\n");
			System.out.println("Veuillez saisir � nouveau le nombre de joueurs compris entre 2 et 4.");
			nombreJoueurs = scanner.nextInt();
			//System.out.println("Le nombre de joueurs pour cette partie est " + nombreJoueurs + " joueurs.");

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
	
	
	
	// On cr�� une matrice pour notre royaume � cause de sa taille 9*9 qui est le m�me format que la matrice
	public static void Royaume(int[][] royaume) 
	{	
		//Initilisation de notre variable royaume
		//int[][] royaume = new int[9][9];
		for(int i =0; i<9; i++) 
		{
			for(int j=0; j<9; j++) 
			{
				if(i==0 || j==0 || i==9 || i==9) 
				{
					royaume[i][j] = 1;
				}
				else 
				{
					royaume[i][j] = 0;

				}
			}
		}
		
		for(int i =0; i<9; i++) 
		{
			for(int j=0; j<9; j++) 
			{
				System.out.println(royaume[i][j] + " ");
			}
		}
	
		
	}

	

}