package projet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CSVRead
{
	//Array pour stocker les valeurs
	ArrayList<String> csvValeurs = new ArrayList<String>();
	List<List<String>> parts = new ArrayList<List<String>>(); // Liste d'une liste 


	// Constructeur où on définit la liste des dominos pour l'utiliser ailleurs
	public CSVRead() throws IOException 
	{
		/**try NE FONCTIONNE PLUS JE SAIS PAS POURQUOI ( 28/12)
		{

			BufferedReader CSVFile = new BufferedReader(new FileReader("dominos.csv"));
			String dataRow = CSVFile.readLine(); /** Lit la première ligne**/
			/** La boucle while vérifie si les données sont nulles. 
			 * Si elles le sont, on atteint directement la fin du fichier
			 * Sinon, on continue de le lire
			 
			// On fait une boucle while jusqu'à que toutes les lignes du fichier csv soient lues
			  while(dataRow != null) 
			{
				// dataArray => TABLEAU !!
				String[] dataArray = dataRow.split(",");

				for(int i = dataArray.length; i <0; i++) // 
				{
					// Affiche chaque élément de chaque ligen de mon tableau dataArray où sont stockés tous les dominos
					System.out.println("Element :" + dataArray[i]);
					// Ajouter un tableau de String dans une ArrayList			
				}
				
				// Ajouter un tableau de String dans une ArrayList
				csvValeurs.addAll(Arrays.asList(dataArray));
				// Affiche la liste où sont les dominos
				System.out.println(csvValeurs);

				System.out.println(); // affiche la ligne données
				dataRow = CSVFile.readLine(); // Lit la nouvelle ligne de données
				break;
				
			}
			
			System.out.println(); // affiche la ligne données
			dataRow = CSVFile.readLine(); // Lit la nouvelle ligne de données
			CSVFile.close(); // Ferme le fichier une fois que toutes les données ont été lues
		}**/
		
		
		// .csv virgule qui sépare les valeurs // ok avec la nouvelle méthode de lecture CSV
		String fileName = "dominos.csv"; // enregistré dans le même dossier que le main
		File file = new File(fileName); // lit le fichier
		try 
		{
			Scanner inputStream = new Scanner(file); 
			while(inputStream.hasNext()) 
			{
			
				String data = inputStream.next();
				System.out.println(data + " ,");
				// Ajouter les String dans une ArrayList
				csvValeurs.add(data);
			
			}
		
			// Affiche la liste où sont les dominos
			System.out.println(csvValeurs);

			// Ferme le fichier
			inputStream.close();
		}
		// catch l'exception si on ne trouve pas le fichier car il est placé au mauvais endroit
		catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}

	}

	public ArrayList<String> getArrayList() // ok avec la nouvelle méthode de lecture CSV
	{
		System.out.println(" ");
		System.out.println("------------------------------------------getArrayList---------------------------------------------------");
		System.out.println("return " + csvValeurs);
		return csvValeurs;
	
	} // 	public ArrayList<String> getArrayList() 

	// Permet de sélectionner dans la liste des dominos les dominos entiers cà
	public List<List<String>> getSubList() // ok avec la nouvelle méthode de lecture CSV
	{
		int taille = 1;
		final int N = csvValeurs.size();
		System.out.println("------------------------------------------getSubList---------------------------------------------------");

		for(int i =0; i < N; i += taille) 
		{
			int end = Math.min(i + taille, csvValeurs.size());
			parts.add(new ArrayList<String>(csvValeurs.subList(i, end)));
		}
		System.out.println("New :" + parts);
		return parts;
	} // 	public List<List<String>> getSubList()*/
	
	
	
	/*public List<List<String>> getSubList()
	{
		int taille = 5;
		final int N = csvValeurs.size();
		System.out.println("------------------------------------------getSubList---------------------------------------------------");

		for(int i =0; i < N; i += taille) 
		{
			int end = Math.min(i + taille, csvValeurs.size());
			parts.add(new ArrayList<String>(csvValeurs.subList(i, end)));
		}
		System.out.println("New :" + parts);
		return parts;
	} // 	public List<List<String>> getSubList()*/

	

	
	
	


	


}


