

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVRead {

	public static void main(String[] args) throws Exception
	{
		BufferedReader CSVFile = new BufferedReader(new FileReader("dominos.csv"));
		String dataRow = CSVFile.readLine(); /** Lit la première ligne**/
		
		/** La boucle while vérifie si les données sont nules. 
		 * Si elles le sont, on atteint directement la fin du fichier
		 * Sinon, on continue de le lire
		 */
		while(dataRow != null) 
		{
			String[] dataArray = dataRow.split(",");
			for (String item:dataArray) 
			{
				System.out.println(item + "\t");

			}
			System.out.println(); // affiche la ligne données
			dataRow = CSVFile.readLine(); // Lit la nouvelle ligne de données

		}
		CSVFile.close(); // Ferme le fichier une fois que toutes les données ont été lues
		
		//System.out.println(dataRow);

	}

}