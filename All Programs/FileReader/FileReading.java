//this program is for reading the file and writing it to a new file
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileReading {

	public static void main(String[] args) throws IOException {
		String fileread="";//first we made a empty string
		File f=new File("C:\\Users\\rajri\\Downloads\\lockfolder.txt");//now used the file keyword to import the file
		try (Scanner scan = new Scanner(f)) {
			while(scan.hasNextLine()) {
				fileread=fileread.concat(scan.nextLine()+"\n");//used the concat and scan to update the fileread string with new data
			}
		}
		System.out.println(fileread);
		FileWriter writer = new FileWriter("C:\\Users\\rajri\\Downloads\\new.txt"); //used filewriter to write the file to a new location
		writer.write(fileread);//writing fileread string to that new location 
		writer.close();//closing the writer
	}
}