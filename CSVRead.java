

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVRead {

	public static void main(String[] args) throws Exception
	{
		BufferedReader CSVFile = new BufferedReader(new FileReader("dominos.csv"));
		String dataRow = CSVFile.readLine(); /** Lit la premi�re ligne**/
		
		/** La boucle while v�rifie si les donn�es sont nules. 
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
			System.out.println(); // affiche la ligne donn�es
			dataRow = CSVFile.readLine(); // Lit la nouvelle ligne de donn�es

		}
		CSVFile.close(); // Ferme le fichier une fois que toutes les donn�es ont �t� lues
		
		//System.out.println(dataRow);

	}

}