package csvFileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {

	public static void main(String[] args) {
		String outputFile = "";
		try {
			FileReader F =new FileReader( "C:\\Users\\rajri\\Downloads\\SacramentocrimeJanuary2006.csv");
			BufferedReader Br= new BufferedReader(F);//I have already shown how to read file using scanner
		//so today i am using buffered reader , the reason is becuase it's faster then scanner
			while((outputFile = Br.readLine()) != null ) {
				//System.out.println(outputFile);//if i just print, it'll print everything
				//what if i just want to see the date and crime in sacramento
				//for that i'll use array method split
				String[] FilteredValues =  outputFile.split(",");
				//in this way i made an array FilteredValues which holds all the info in the form of an array
				//in which values will be seprated wherever comma is.
				System.out.println(FilteredValues[0]);
				//in my file date is at column 1, it'll just print date.
			}
			Br.close();
			F.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}catch (IOException e) {
			System.out.println("Input Output Error");
		}
	}

}
