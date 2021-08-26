package filehandling;
import java.util.Scanner;
import java.io.*;
import org.apache.log4j.Logger;

public class ReadFile {
    public static void readingFIle(){
        Logger log=Logger.getLogger(ReadFile.class);
        try{
        Scanner sc = new Scanner(new File("UserDataEntry.csv"));
        sc.useDelimiter(",");
        while (sc.hasNext())
        {
            System.out.print(sc.next());  //find and returns the next complete token from this scanner
        }
        sc.close();
    }catch (FileNotFoundException e){
            System.out.println("File Not found: ");
            log.error("File not found ");
        }
    }
}
