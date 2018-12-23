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
	private char [][] grille; // Tableau à 2D sous forme de grille
	
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
				// Le '-' permet de remplir le plateau puisqu'il représente le vide
				grille[i][j] = '-';
			}
		}
		
		
	}
	
	// Permet d'afficher la plateau qu'on a créé
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
	public void placer(int l, int c, char R) 
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
		
		
		// Si la grille est vide, on va pouvoir la remplir
		if (grille[l][c] == '-') 
		{
				grille[l][c] = R; // le caractère t permet de placer n'importe quel élément dans la grille, ici il représente le plateau de jeu !! 

			
		}
		else 
		{
			System.out.println("Erreur, cette zone n'est pas vide !");
		}
		
		
		
	}
	

	
		/** Lister tous les types de composants du plateau de jeu 
		 * EMPTY -> quand il n'y a rien
		 * DOMINO_PART -> quand il y a un domino
		 * CHATEAU_PART -> quand il y a un château
		 * ROYAUME_PART -> où il y a le royaume du joueur
		 * **/
		/*public enum elementPlateau 
		{
			EMPTY, DOMINO_PART, CHATEAU_PART, ROYAUME_PART;
		}
		
		// Hauteur et largeur du plateau (nombre de cellules)
		private int HEIGHT;
		private int WIDTH;
		
		// Tableau à 2D pour le plateau
		private elementPlateau[][] plateau;
		
		private final int PieceSize = 5;
		/** Couleur emplacement:
		 * Domino
		 * Chateau
		 * Royaume
		 **/
		/*private final Color DominoColor = Color.red; 
		private final Color ChateauColor = Color.pink; 
		private final Color RoyaumeColor = Color.orange; 
		
		// Constructeur
		public Plateau(int WIDTH, int HEIGHT) 
		{	
			super("Domination");
			this.WIDTH = WIDTH;
			this.HEIGHT = HEIGHT;
			// On ajoute à notre plateau représenté par un tableau en 2D les composants 
			plateau = new elementPlateau[WIDTH][HEIGHT];
			
			// Réinitialiser le plateau de jeu
			this.resetPlateau();
			this.setBackground(Color.black);
			this.setFocusable(true);
			
			this.setSize(WIDTH * PieceSize, HEIGHT * PieceSize);
			this.setVisible(true);
			this.setLocationRelativeTo(null);
			this.addWindowListener(new WindowAdapter() 
			{
				// pour fermer la fenêtre
				public void windowsClosing(WindowEvent we) 
				{
					System.exit(0);
				}
			});
			this.setResizable(false);
			
			
		}
		
		// Réinitialise tout le plateau à vide sans les composants
		private void resetPlateau() 
		{
			for (int i = 0; i < WIDTH; i++) 
			{
				for(int j=0; j < HEIGHT; j++) 
				{
					plateau[i][j] = elementPlateau.EMPTY;
					
				}
			}
	
		}
		
		/** 
		 * Créer une cellule pour qu'elle appartienne au plateau de jeu (DOMINO_PART, EMPTY, CHATEAU_PART, ROYAUME_PART)
		 * x cellule du plateau -> X
		 * y cellule du plateau -> Y
		 * i éléments du plateau de type elementPlateau.DOMINO_PART etc..
		 * 
		 * **/
		/*private void setElementPlateau(int x, int y, elementPlateau i) 
		{
			plateau[x][y] = i;
		}
		
		
		
		
		public void paint(Graphics g) 
		{
			super.paint(g);
			
			for(int i=0; i < WIDTH; i++) 
			{
				for(int j=0; j < HEIGHT; j++) 
				{
					g.setColor(DominoColor);
					g.setColor(ChateauColor);
					g.setColor(RoyaumeColor);
					g.fillRect(i*PieceSize, j*PieceSize, PieceSize, PieceSize);

				}
				Toolkit.getDefaultToolkit().sync();
				g.dispose();
			}
		}*/
		
		
		
}
