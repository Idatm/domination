package projet;

public class Royaume 
{

		
		private int nbLign;
		private int nbCol;
		private char [][] grille; // Tableau à 2D sous forme de grille
		
		// Constructeur de la grille pour le Royaume
		public Royaume(int n, int p) 
		{
			nbLign = n;
			nbCol = p;
			grille = new char[nbLign][nbCol];
			
			for(int i= 0; i < nbCol; i++) 
			{
				for(int j = 0; j < nbLign; j++) 
				{
					// Le '*' permet de remplir le plateau puisqu'il représente le vide
					grille[i][j] = '*';
				}
			}
			
			
		}
		
		// Permet d'afficher le royaume qu'on a créé
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
		
		// Pour placer un royaume sur le plateau ou le château à voir
		public void placer(int l, int c, char t) 
		{
			// On initialise les variables c et l à -1 pour pouvoir placer les éléments au bon endroit au début du jeu
			l = l-1; // ligne
			c = c-1; // colonne
			
			// Savoir si les éléments sont bien compris entre le nombre de lignes et le nombre de colonnes => Savoir si on est sur la grille
			if( l < 0 || c < 0 || l > nbLign || c > nbCol) 
			{
				System.out.print("Erreur !");
				return;
			}
			
			
			// Si la grilel est vide, on va pouvoir la remplir
			if (grille[l][c] == '*') 
			{
					grille[l][c] = t; // le caractère t permet de placer n'importe quel élément dans la grille, ici il représente le royaume !! 
		
				
			}
			else 
			{
				System.out.println("Erreur, cette zone n'est pas vide !");
			}
			
			
			
		}
}