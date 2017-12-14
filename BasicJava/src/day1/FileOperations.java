package day1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException 
	{
		readFromFile();
		writeToFile();

	}
	private static void readFromFile()
	{
		try {	
				FileReader fr= new FileReader("C:\\Java-Tester-Workspace\\ReadFile1.txt");
				BufferedReader br= new BufferedReader(fr);
				String s;
				while((s=br.readLine())!= null)
				{
					System.out.println(s);
				}
			br.close();
			fr.close();
			} 
		catch (FileNotFoundException e) 
			{
				System.out.println(e.getMessage());
			}
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	private static void writeToFile() throws IOException
	{
		String content="Please write something here";
		File  f = new File("C:\\Java-Tester-Workspace\\ReadFile.txt");
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileWriter fw= new FileWriter(f.getAbsoluteFile());
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write(content);
		bw.newLine();
		content="\nplease write second sentence here";
		bw.newLine();
		bw.write(content);
		
		content="\nplease write third sentence here";
		bw.newLine();
		bw.write(content);
		
		
		bw.close();
		fw.close();
		System.out.println("finished writing to file");
		
	}

}
