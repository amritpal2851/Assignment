package validation;
import filehandling.FileCreator;
import userdata.*;
import org.apache.log4j.Logger;
public class NameValidator {
    SetUserData user=new SetUserData();
    public void nameValidating(){
        Logger log=Logger.getLogger(NameValidator.class);
        if(GetUserData.name.length()<=0 || GetUserData.name.length()>25){
            System.out.println("Name is invalid, please enter your name again ");
            user.setName();
            log.error("User Enter wrong Name "+ GetUserData.name);

        }
    }
}
