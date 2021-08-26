package filehandling;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import org.apache.log4j.Logger;


public class FileHeader {
    public static void  setHeader(){
        Logger log=Logger.getLogger(FileHeader.class);
        try{
            File file = new File("UserDataEntry.csv");
            FileWriter writer= new FileWriter(file,true);
            writer.write("Id,    Name,   Age, Address\n");
            writer.close();
        }catch(FileNotFoundException e){
            System.out.println("File not Found: ");
            log.error("File Not found");

        }catch (Exception e){
            log.error("Unexpected Exception Occur");
        }
}
}
