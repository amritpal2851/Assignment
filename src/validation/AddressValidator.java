package validation;
import org.apache.log4j.Logger;
import userdata.*;
public class AddressValidator {
    SetUserData user=new SetUserData();
    public void addressValidating(){
        Logger log=Logger.getLogger(AddressValidator.class);
        if(GetUserData.address.length()<5 || GetUserData.address.length()>50){
            System.out.println("Please enter valid address between 9 to 50 characters long:");
            user.setAddress();
            log.info("User Enter Wrong Address "+ GetUserData.address);
        }
    }
}
