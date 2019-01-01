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

public class Main extends CSVRead

{
	
	public Main() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	private static int nombreJoueurs = 0; // on part du principe qu'il n'y a aucun joueur au d�but du jeu
	

	//static ArrayList<String> csvValeurs = new ArrayList<String>();


	public static void main(String[] args) throws Exception
	{
	
		int menu = 0;
		System.out.println("Saisir 1 pour afficher la liste des dominos");
		System.out.println("Saisir 2 pour afficher les dominos m�lang�s");
		System.out.println("Saisir 3 pour saisir le nombre de joueur et leur attribuer ch�teau et roi");
		System.out.println("Saisir 4 pour afficher le plateau");
		System.out.println("Saisir 5 pour afficher le royaume");
		//System.out.println("Saisir 6 pour retirer le bon nombre de domino suivant le nombre de joueurs");
		/*System.out.println("Saisir 7 pour prendre une tuile");
		System.out.println("Saisir 8 pour prendre un roi");*/
		System.out.println("Saisir 9 pour quitter");


		Scanner scan = new Scanner(System.in);
		menu = scan.nextInt();

		switch(menu) 
		{
		
			case 1: // ok
				// Permet de lire le fichier csv o� on trouve les dominos
				CSVRead csv = new CSVRead();
				Pioche pioche_1 = new Pioche();
				/**
				 * Pour pouvoir r�cup�rer la liste de dominos intact, il faut appeler la m�thode removeElement PUIS la m�thode getArrayList**/
				csv.getArrayList(); // Pour r�cup�rer la liste de la classe CSVRead
				pioche_1.removeElement();
				pioche_1.getSubList(); // Pour r�cup�rer la liste de domino o� ils sont complets : c�d  par intervalles de 5
				break;
	
			case 2: // ok
				Pioche pioche = new Pioche();
				Joueur joueur = new Joueur();
				pioche.removeElement();
				pioche.getArrayList(); // Pour r�cup�rer la liste de la classe CSVRead
				pioche.getSubList(); // Ok pour avoir les dominos par intervalle de 5
				pioche.removeDomino(); //  ok pour avoir le bon nombre de domino suivant les joueurs
				//joueur.nombreJoueur(); // pas n�cessaire je pense !!
				System.out.println("----------------------Premier Tour----------------------");
				pioche.premierTour(); // Ok pour r�cup�rer le nombre de roi par joueur
				break;
			
			case 3: // ok
				System.out.println("----------------------Nombre de Joueurs----------------------");
				// On cr�� une variable pour le nombre de joueurs
				Joueur nombreJoueurs = new Joueur();
				//nombreJoueurs.materielJeu(); //facultatif
				nombreJoueurs.nombreJoueur(); // Affiche le nombre de joueur apr�s saisi
				System.out.println(" ");
				System.out.println("----------------------Attribution ch�teau----------------------");
				nombreJoueurs.attributionChateau();
				System.out.println(" ");
				System.out.println("----------------------Attribution roi----------------------");
				nombreJoueurs.attributionRoi();
				System.out.println(" ");
				System.out.println("----------------------Attribution tuile----------------------");
				nombreJoueurs.attributionTuile();
				System.out.println(" ");
				break;
			case 4: // ok
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
			case 5: // ok on peut en afficher plusieurs !!
				// Cr�ation d'un royaume de taille 5*5
				Royaume royaume_1 = new Royaume(5,5);
				Royaume royaume_2 = new Royaume(5,5);
				
				// On place le ch�teau au centre du royaume
				royaume_1.placer(3, 3, 'c');
				royaume_2.placer(1, 3, 'k');

				//On affiche le royaume
				System.out.println("----------------------Royaume----------------------");
				royaume_1.afficher(); // royaume n�1
				royaume_2.afficher(); // royaume n�1
				break;
				
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				System.exit(0);
				break;
		}

	} // 	public static void main(String[] args) throws Exception


} // public class Main extends CSVRead

