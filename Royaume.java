package projet;

public class Royaume 
{

		
		private int nbLign;
		private int nbCol;
		private char [][] grille; // Tableau � 2D sous forme de grille
		
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
					// Le '*' permet de remplir le plateau puisqu'il repr�sente le vide
					grille[i][j] = '*';
				}
			}
			
			
		}
		
		// Permet d'afficher le royaume qu'on a cr��
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
		public void placer(int l, int c, char t) 
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
			
			
			// Si la grilel est vide, on va pouvoir la remplir
			if (grille[l][c] == '*') 
			{
					grille[l][c] = t; // le caract�re t permet de placer n'importe quel �l�ment dans la grille, ici il repr�sente le royaume !! 
		
				
			}
			else 
			{
				System.out.println("Erreur, cette zone n'est pas vide !");
			}
			
			
			
		}
}