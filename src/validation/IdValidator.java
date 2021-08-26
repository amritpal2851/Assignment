package validation;
import org.apache.log4j.Logger;
import userdata.*;

public class IdValidator {
    Logger log=Logger.getLogger(IdValidator.class);
    GetUserData data=new GetUserData();
    SetUserData user=new SetUserData();
    public void validating(){
        if(GetUserData.id<101 || GetUserData.id>999){
            System.out.println("Invalid Id, please enter your Id again: ");
            user.setId();
            log.info("User enter wrong ID number"+ GetUserData.id);
        }
    }
}
