package pp3FileHandling;

import java.io.*;

public class Write 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception
	{
		File f1=new File("D://Java//PracticeProjects5//Filesss.txt");
		FileWriter fw=new FileWriter(f1);
		fw.write("This is a Practice Project");
		fw.write("/n");
		fw.write("File is created");
		fw.flush();
		System.out.println("Data has been inputed into a file");
	}
}
