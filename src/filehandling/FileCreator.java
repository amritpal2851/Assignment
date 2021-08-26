package filehandling;
import java.io.File;
import java.io.IOException;
import org.apache.log4j.Logger;
public class FileCreator {
    public void filemaking(){
        Logger log=Logger.getLogger(FileCreator.class);
        try {
        File file = new File("D:UserDataEntry.csv");
        if (file.createNewFile()) {
            System.out.println("File " + file.getName() + " is created successfully.");
            FileHeader.setHeader();
        } else {
            System.out.println("File is already exist in the directory.");
            log.error(" File already exists");
        }

    } catch (IOException exception) {
        System.out.println("An unexpected error is occurred.");
        exception.printStackTrace();
        log.error("IOException");
    }

    }
}
