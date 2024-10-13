package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileHandling 
{
	public void viewPreviousRecords() 
	{
		Path path = Paths.get("tender\\src\\FileHandling\\previousRecords.txt");
		try 
		{
			List<String> readAllLines = Files.readAllLines(path);
			for (String line : readAllLines)
			{
				System.out.println(line);
			}
		}
		catch (IOException e)
			{
				e.printStackTrace();
			}
	}	

	public void headerTitle() throws IOException
	{
		FileReader fr = new FileReader("tender\\src\\FileHandling\\previousRecords.txt");
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
	}
	
	
	public void updatePreviousRecords() throws IOException
	{
		FileWriter fw = new FileWriter("C:\\Users\\meraj\\git\\tender\\tender\\src\\FileHandling\\previousRecords.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.close();
	}
	
	

}
