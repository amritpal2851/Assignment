package userdata;
import java.util.Scanner;
import java.util.Set;

import filehandling.FileCreator;
import org.apache.log4j.Logger;

public class SetUserData {
    org.apache.log4j.Logger log= Logger.getLogger(SetUserData.class);
    GetUserData data=new GetUserData();
    Scanner input=new Scanner(System.in);
    public void setName(){
        String name;
        try{
        System.out.println("Please Enter your name: ");
        name=input.nextLine();
        data.setName(name);
        }catch (Exception e){
            System.out.println("User enter invalid data: ");
            log.error("Exception is" +e );
        }
    }
    public void setAge(){
        int age;
        try{
        System.out.println("Please enter your age ");
        age=input.nextInt();
        data.setAge(age);
    }catch (Exception e){
            log.error("User Wrong data type  "+e);
        }
    }
    public void setAddress(){
        String address;
        try{
        System.out.println("Please Enter your Address ");
        address=input.nextLine();
        data.setAddress(address);
    }catch(Exception e){
            log.error("User enter wrong address   " + e);
        }
    }
    public void setId(){
        int id;
        try{
        System.out.println("Please enter your Id");
        id=input.nextInt();
        data.setId(id);
    }catch (Exception e){
            log.error("User Enter wrong ID  "+ e);
        }
    }

}
