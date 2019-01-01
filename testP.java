package projet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class testP extends JFrame
{
	
/* PLUS BESOIN DE CETTE CLASSE */
	public static void main(String[] args) 
	{
		testP plateau = new testP(90,90, Color.black);
		
		

	}

	
			/** Lister tous les types de composants du plateau de jeu 
			 * EMPTY -> quand il n'y a rien
			 * DOMINO_PART -> quand il y a un domino
			 * CHATEAU_PART -> quand il y a un château
			 * ROYAUME_PART -> où il y a le royaume du joueur
			 * **/
			public enum elementPlateau 
			{
				EMPTY, DOMINO_PART, CHATEAU_PART, ROYAUME_PART;
			}
			
			// Hauteur et largeur du plateau (nombre de cellules)
			private int HEIGHT;
			private int WIDTH;
			
			// Tableau à 2D pour le plateau
			private elementPlateau[][] plateau;
			
			private final int PieceSize = 10;
			/** Couleur emplacement:
			 * Domino
			 * Chateau
			 * Royaume
			 **/
			private final Color DominoColor = Color.red; 
			private final Color ChateauColor = Color.pink; 
			private final Color RoyaumeColor = Color.orange; 
			
			// Constructeur
			public testP(int WIDTH, int HEIGHT, Color color) 
			{	
				super("Domi");
				this.WIDTH = WIDTH;
				this.HEIGHT = HEIGHT;
				// On ajoute à notre plateau représenté par un tableau en 2D les composants 
				plateau = new elementPlateau[WIDTH][HEIGHT];
				// Réinitialiser le plateau de jeu
				//this.resetPlateau();
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
			private void setElementPlateau(int x, int y, elementPlateau i) 
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
			}
			
			
			
	}


