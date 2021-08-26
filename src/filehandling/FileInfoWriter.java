package filehandling;
import org.apache.log4j.Logger;
import userdata.GetUserData;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import org.apache.log4j.Logger;

public class FileInfoWriter {
    Logger log=Logger.getLogger(FileInfoWriter.class);

    public void fileWriting(){
        try {
            File file = new File("UserDataEntry.csv");
            FileWriter writer= new FileWriter(file,true);
            writer.write(GetUserData.id+","+GetUserData.name+","+GetUserData.age+","+GetUserData.address+"\n");
            writer.close();
            System.out.println("Content is successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Unexpected error occurred");
            e.printStackTrace();
            log.error("Unexpected error occur :");
        }
    }

}
