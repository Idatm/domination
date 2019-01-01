package projet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Plateau extends JFrame

{
	private int nbLign;
	private int nbCol;
	private char [][] grille; // Tableau � 2D sous forme de grille
	
	// Constructeur de la grille
	public Plateau(int n, int p) 
	{
		nbLign = n;
		nbCol = p;
		grille = new char[nbLign][nbCol];
		
		for(int i= 0; i < nbCol; i++) 
		{
			for(int j = 0; j < nbLign; j++) 
			{
				// Le '-' permet de remplir le plateau puisqu'il repr�sente le vide
				grille[i][j] = '-';
			}
		}
		
		
	}
	
	// Permet d'afficher la plateau qu'on a cr��
	public void afficher() 
	{
		for(int i= 0; i < nbCol; i++) 
		{
			for(int j = 0; j < nbLign; j++) 
			{
				System.out.print("|" + grille[i][j]);;
			}
			System.out.println("|");;

		}
		System.out.println(" ");;

	}
	
	// Pour placer un royaume sur le plateau ou le ch�teau � voir
	public void placer(int l, int c, char R) 
	{
		// On initialise les variables c et l � -1 pour pouvoir placer les �l�ments au bon endroit au d�but du jeu
		l = l-1; // ligne
		c = c-1; // colonne
		
		// Savoir si les �l�ments sont bien compris entre le nombre de lignes et le nombre de colonnes => Savoir si on est sur la grille
		if( l < 0 || c < 0 || l > nbLign || c > nbCol) 
		{
			System.out.print("Erreur !");
			return;
		}
		
		
		// Si la grille est vide, on va pouvoir la remplir
		if (grille[l][c] == '-') 
		{
				grille[l][c] = R; // le caract�re t permet de placer n'importe quel �l�ment dans la grille, ici il repr�sente le plateau de jeu !! 

			
		}
		else 
		{
			System.out.println("Erreur, cette zone n'est pas vide !");
		}
		
		
		
	}
	

	

		
		
}
