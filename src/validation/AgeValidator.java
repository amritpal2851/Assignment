package validation;
import org.apache.log4j.Logger;
import userdata.*;
public class AgeValidator {
    GetUserData data=new GetUserData();
    SetUserData user=new SetUserData();
    public void validatingAge(){
        Logger log=Logger.getLogger(AgeValidator.class);
        if(GetUserData.age==0 || GetUserData.age>100){
            System.out.println("Please enter valid age: ");
            user.setAge();
            log.info("User Enter Wrong Name" + GetUserData.age);
        }
    }
}
