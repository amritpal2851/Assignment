package filehandling;
import java.io.*;
import java.util.Scanner;
import org.apache.log4j.Logger;

public class CsvDelete {
    public void deletingRecord()
    {
        Logger log=Logger.getLogger(CsvDelete.class);Scanner input=new Scanner(System.in);
    String tempFile="temp.csv";
    int position=0;
    String data[];
    String currentLine;
    File oldFile=new File("D:UserDataEntry.csv");
    File newFile=new File(tempFile);
    System.out.println("Please enter the Id for deleting record");
    String term= input.nextLine();
    try {
            FileWriter file=new FileWriter(tempFile,true);
            BufferedWriter writer=new BufferedWriter(file);
            PrintWriter print=new PrintWriter(writer);
            FileReader reader=new FileReader("D:UserDataEntry.csv");
            BufferedReader read=new BufferedReader(reader);

        while((currentLine=read.readLine())!=null){
                data=currentLine.split(",");
                if(!data[position].equalsIgnoreCase(term)){
                    print.println(currentLine);
                }
            }
            print.flush();
            print.close();
            reader.close();
            read.close();
            writer.close();
            file.close();
            oldFile.delete();
            File dump=new File("D:UserDataEntry.csv");
            newFile.renameTo(dump);
        System.out.println("Record for given ID deleted ");

    }catch(
    FileNotFoundException e){
        System.out.println("File Not Found");
        log.error(" File not Found");
    }
    catch(
    IOException ex){
        System.out.println("Error Occured");
        log.error("IO Exception");
    }
}

}
