package main;
import userdata.*;
import filehandling.*;
import java.util.Scanner;
import validation.*;

public class main {
    public static void main(String[] args) {
       FileInfoWriter fileWriter=new FileInfoWriter();
       FileCreator makeNewFile=new FileCreator();
       makeNewFile.filemaking();
        NameValidator person=new NameValidator();
        IdValidator idValid=new IdValidator();
        AddressValidator location=new AddressValidator();
        AgeValidator ageCheck=new AgeValidator();
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to File Management System:\nPlease Choose Operation ");
        System.out.println("Please enter option\n1->Adding Record\n2->Read File\n3->Delete File");
        int check=input.nextInt();
        GetUserData data=new GetUserData();
        SetUserData user=new SetUserData();
        switch(check) {
            case 1:
                //fileWriter.setHeader();
                while(true){
                    user.setId();
                idValid.validating();
                user.setName();
                person.nameValidating();
                user.setAge();
                ageCheck.validatingAge();
                user.setAddress();
                location.addressValidating();
                fileWriter.fileWriting();
                System.out.println("Do you want to enter more data\n1->Yes\nAnyOtherNumber->NO ");
                int check2=input.nextInt();
                if(check2==1){
                    continue;
                }
                else
                    break;
                }
                break;

            case 2:
               ReadFile.readingFIle();
                break;
            case 3:
                ReadFile.readingFIle();
                CsvDelete delete = new CsvDelete();
                delete.deletingRecord();
                break;

        }



    }
}
