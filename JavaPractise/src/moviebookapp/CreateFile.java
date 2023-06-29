package moviebookapp;
import java.io.*;
public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\HP\\Desktop\\File.txt");
		if(f.createNewFile())
		{
			System.out.println("file successfully");
		}
		else
		{
			System.out.println("file exist");
		}

	}

}
