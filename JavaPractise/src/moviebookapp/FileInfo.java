package moviebookapp;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\HP\\Desktop\\File.txt");
		 if (f.exists())
		 {
			 System.out.println("file name:"+f.getName());
			 System.out.println("file location:"+f.getAbsolutePath());
			 System.out.println("file Writable:"+f.canWrite());
			 System.out.println("file readable:"+f.canRead());
			 
		 }
		 else
		 {
			 System.out.println("file exists...");
		 }
			

	}

}
