
package mylab.criminal;
import java.io.FileInputStream;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
interface Operations{
    boolean authentication(String username, String pin);
       void display(String idd);
}

class Criminal {
    static int idcap =Integer.parseInt(getSizeofObject("crimeSize.txt"));
    static String id;
    String name;
    String ID;
    String birthDate;
    int birthMonth;
    int birthYear;
    int age;
    String maritalStatus;
    String legalStatus;
    String placeOfBirth;
    String address;
    String crimeType;
    String crimeDescription;
    String crimeDate;
    String occupation;
    String healthStatus;
    int dateOfSentence;        //date, month, year
    int monthOfSentence;
    int yearOfSentence;
    int remainingYears;
    String placeOfPrison;
    int sentenceDuration;

    String sizeName="crimeSize.txt";
    static String getSizeofObject(String fileName){
        String numberOFObject="";
        try {
            FileInputStream fin = new FileInputStream(fileName);
            Scanner sd = new Scanner(new File(fileName));
            numberOFObject= sd.next();
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
        return numberOFObject;
    }// return  the size of object stored in the file of filename"crimeSize"
    static String generateId(){
        int nw;
        if(idcap<100 && idcap>=10){
            nw = idcap +1;
            id = "CR00"+nw;
        }else if(idcap<10){
            nw = idcap +1;
            id = "CR000"+nw;
        }else if(idcap>100 &&idcap<1000){
            nw = idcap +1;
            id = "CR0"+nw;
        }
        idcap++;
        return id;
    }
}

class Officer extends Criminal implements  Operations{
    String userName = "1";
    String password = "1";
    Scanner scan = new Scanner(System.in);
    int choose;
    String searchId;
    private void readInfo(String fileName) {
        try {
            int iterator;
            FileInputStream fin = new FileInputStream(fileName);
            do {
                iterator = fin.read();
                if (iterator != -1) System.out.print((char) iterator);
            } while(iterator != -1);
            fin.close();

        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public    void display(String idd) {
        String fileName="crime"+idd+".txt";
        readInfo(fileName);
        System.out.println();
    }
    public boolean authentication(String username, String pin) {
        boolean checked = false;
        if (username.equals(userName)) {
            if (pin.equals(password))
                checked = true;
            else
                System.out.print("incorrect password ");
        } else {
            if (pin.equals(password))
                System.out.print("incorrect username ");
            else
                System.out.print("incorrect username and  password ");
        }
        return checked;
    }
    void operation() {
        String inputName,inputPassword;
        int chance=1;
        for( ; ;) {
            System.out.println("  Enter  Your Officer user name:");
            inputName = scan.nextLine();
            System.out.println("Enter Your Officer  Password");
            inputPassword = scan.nextLine();
            if (authentication(inputName,inputPassword)) {
                System.out.println("                YOU ARE AUTHORIZED TO USE USE THIS SECTION               ");
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Enter\n 1: To See Criminal Data Using Id ");
                System.out.println(" 2: To Exit The Program ");
                choose = scan.nextInt();
                scan.nextLine();
                switch (choose) {
                    case 1:
                        System.out.println("Enter the Id to be Searched: ");
                        searchId = scan.nextLine();
                        display(searchId);
                    case 2:
                        System.out.println("----------Program Closed ----------");
                        break;
                    default:
                        System.out.println("wrong Option : Program Terminated ");
                        break;
                }
                break;
            }
            else {
                if (chance == 3) {
                    System.out.println("maximum attempt reached  authentication failed ");
                    break;
                } else {
                    chance++;
                    System.out.println((":   " + (4 - chance) + " attempt left from 3"));
                }
            }
        }
    } //end of void aa()
}//end of officer class

class Admin extends Criminal implements Operations {
    int size=Integer.parseInt(getSizeofObject("crimeSize.txt"));
    String fileUsername="username.txt";
    String filePassword="password.txt";
    String sizeToFile="";
    String fileName;
    String userName = getSizeofObject(fileUsername);
    String password = getSizeofObject(filePassword);
    Scanner scan = new Scanner(System.in);
    private void addCriminal(){
  try {
      Criminal newCriminal = new Criminal();
      System.out.println("--------enter the name of the criminal---------------------");
      newCriminal.name = this.scan.nextLine();
      newCriminal.ID = Criminal.generateId();
      System.out.println("--------enter the age of the criminal----------------------");
      newCriminal.age = this.scan.nextInt();
      scan.nextLine();
      System.out.println("--------enter tne marital status of the criminal-----------");
      newCriminal.maritalStatus = this.scan.nextLine();
      System.out.println("--------enter the birth date of the criminal---------------");
      newCriminal.birthDate = this.scan.nextLine();
      System.out.println("--------enter the birth month of the criminal--------------");
      newCriminal.birthMonth = this.scan.nextInt();
      scan.nextLine();
      System.out.println("--------enter birth year-----------------------------------");
      newCriminal.birthYear = this.scan.nextInt();
      scan.nextLine();
      System.out.println("--------enter place of birth-------------------------------");
      newCriminal.placeOfBirth = this.scan.nextLine();
      System.out.println("--------enter the address of the criminal------------------");
      newCriminal.address = this.scan.nextLine();
      System.out.println("--------enter the occupation of the criminal---------------");
      newCriminal.occupation = this.scan.nextLine();
      System.out.println("--------enter health status of the criminal----------------");
      newCriminal.healthStatus = this.scan.nextLine();
      System.out.println("--------enter criminal legal status------------------------");
      newCriminal.legalStatus = this.scan.nextLine();
      System.out.println("--------enter the type pf crime----------------------------");
      newCriminal.crimeType = this.scan.nextLine();
      System.out.println("--------enter crime date-----------------------------------");
      newCriminal.crimeDate = this.scan.nextLine();
      System.out.println("--------enter the duration the criminal is sentenced-------");
      newCriminal.sentenceDuration = this.scan.nextInt();
      scan.nextLine();
      System.out.println("--------enter the duration the criminal is sentenced-------");
      newCriminal.dateOfSentence = this.scan.nextInt();
      scan.nextLine();
      System.out.println("--------enter the year criminal got to prison--------------");
      newCriminal.yearOfSentence = this.scan.nextInt();
      scan.nextLine();
      System.out.println("--------enter remaining years criminal stays in prison-----");
      newCriminal.remainingYears = this.scan.nextInt();
      scan.nextLine();
      System.out.println("--------enter month of sentence----------------------------");
      newCriminal.monthOfSentence = this.scan.nextInt();
      scan.nextLine();
      System.out.println("--------enter the location of the criminal is detained-----");
      newCriminal.placeOfPrison = this.scan.nextLine();
      System.out.println("--------enter the crimeDescription of the crime-----------------");
      newCriminal.crimeDescription = this.scan.nextLine();
      saveToFIle(newCriminal);
      System.out.println("********criminal added successfully ***********************");
  }
  catch (Exception e){
      System.out.println("xxx-- wrong input incountered while recieving criminal data  :session terminated ");
       }
    }
    private   void saveToFIle(Criminal cr) {
        try {
            fileName = "crime" + cr.id+ ".txt";
            FileWriter fw = new FileWriter(fileName);
            fw.write("Name:                   |   -> " + cr.name);
            fw.write("\n------------------------|--------------------------");
            fw.write("\nID:                     |   -> " + cr.ID);
            fw.write("\n------------------------|--------------------------");
            fw.write("\nAge:                    |   -> " + cr.age);
            fw.write("\n------------------------|--------------------------");
            fw.write("\nMarital Status:         |   -> " + cr.maritalStatus);
            fw.write("\n------------------------|--------------------------");
            fw.write("\nLegal Status:           |   -> " + cr.legalStatus);
            fw.write("\n------------------------|--------------------------");
            fw.write("\nPlace of Birth:         |   -> " + cr.placeOfBirth);
            fw.write("\n------------------------|--------------------------");
            fw.write("\nDate of Birth:          |   -> " + cr.birthDate);
            fw.write("\n------------------------|--------------------------");
            fw.write("\nMonth of Birth:         |   -> " + cr.birthMonth);
            fw.write("\n------------------------|--------------------------");
            fw.write("\nYear of Birth:          |   -> " + cr.birthYear);
            fw.write("\n------------------------|--------------------------");
            fw.write("\nAddress:                |   -> " + cr.address);
            fw.write("\n------------------------|--------------------------");
            fw.write("\nCrime Type:             |   -> " + cr.crimeType);
            fw.write("\n------------------------|--------------------------");
            fw.write("\nCrimeDescription:       |   -> " + cr.crimeDescription);
            fw.write("\n------------------------|--------------------------");
            fw.write("\nCrime Date:             |   -> " + cr.crimeDate);
            fw.write("\n------------------------|--------------------------");
            fw.write("\nDate of Sentence:       |   -> " + cr.dateOfSentence);
            fw.write("\n------------------------|--------------------------");
            fw.write("\nMonth of sentence:      |   -> " + cr.monthOfSentence);
            fw.write("\n------------------------|--------------------------");
            fw.write("\nYear of sentence:       |   -> " + cr.yearOfSentence);
            fw.write("\n------------------------|--------------------------");
            fw.write("\nRemaining years         |   -> " + cr.remainingYears);
            fw.write("\n------------------------|--------------------------");
            fw.write("\nLocation of prison      |   -> " + cr.placeOfPrison);
            fw.write("\n---------------------------------------------------");
            fw.write("                                                     ");
            fw.close();
            size++;
            FileWriter fw1 = new FileWriter(sizeName);
            sizeToFile=Integer.toString(size);
            fw1.write(sizeToFile);
            fw1.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void display(String idd) {
        String fileName="crime"+idd+".txt";
        readInfo(fileName);
        System.out.println();
    }
    private void displayAll(){
         int numberOfObject=Integer.parseInt(getSizeofObject("crimeSize.txt"));
         for(int index=0;index<numberOfObject;index++){
             display(generateID(index));
             System.out.println("\n\n");
         }
    }
    private void readInfo(String fileName) {
        try {
            int iterator;
            FileInputStream fin = new FileInputStream(fileName);
            do {
                iterator = fin.read();
                if (iterator != -1) System.out.print((char) iterator);
            } while(iterator != -1);
            fin.close();

        }catch(IOException e) {
            System.out.println("NO CRIMINAL RECORDED WITH THIS ID ");
        }
    }
    public boolean authentication(String username, String pin) {
        boolean checked = false;
        if (username.equals(userName)) {
            if (pin.equals(password))
                checked = true;
            else
                System.out.print("incorrect password ");
        } else {
            if (pin.equals(password))
                System.out.print("incorrect username ");
            else
                System.out.print("incorrect username and  password ");
        }
        return checked;
    }
    private void setting() {
        int choice;
        String newString;
        System.out.println("enter \n   1:to change username\n   2: to change password" +
                "\n   3:to change both ");
        choice = scan.nextInt();
        scan.nextLine();
        switch (choice) {
            case 1: {
                try{
                System.out.println("enter new username");
                newString = scan.nextLine();
                userName = newString;
                    FileWriter fw = new FileWriter(fileUsername);
                    fw.write(userName);
                    fw.close();
                }catch(IOException e){
                    System.out.println("some thing went wrong while changing user name:process terminated" );
                }
            }
            break;
            case 2: {
                try{
                System.out.println("enter new password");
                newString = scan.nextLine();
                password = newString;
                FileWriter fw = new FileWriter(filePassword);
                fw.write(password);
                fw.close();
            }catch(IOException e){
                System.out.println("some thing went wrong while changing user name:process terminated" );
            }
            }
            break;
            case 3: {
                try {
                    System.out.println("enter new username");
                    newString = scan.nextLine();
                    userName = newString;
                    FileWriter fw = new FileWriter(fileUsername);
                    fw.write(userName);
                    fw.close();
                    System.out.println("enter new password");
                    newString = scan.nextLine();
                    password = newString;
                    fw = new FileWriter(filePassword);
                    fw.write(password);
                    fw.close();
                }catch (IOException e){
                    System.out.println("something went wrong while changing privacy setting ");
                }
            }
            break;
            default:
                System.out.println("wrong option :setting terminated");
                break;
        }
    }
    private String generateID(int index){
         int idcap=index;
        int nw;
        if(idcap<100 && idcap>=10){
            nw = idcap +1;
            id = "CR00"+nw;
        }else if(idcap<10){
            nw = idcap +1;
            id = "CR000"+nw;
        }else if(idcap>100 &&idcap<1000){
            nw = idcap +1;
            id = "CR0"+nw;
        }
        return id;
    }
    void operation() {
        int choice;
        int chance = 1;
        int input;
        String userName;
        String password;
        for (; ; ){
            System.out.println("Enter your Admin  username");
            userName = scan.nextLine();
            System.out.println("Enter your  Admin password");
            password = scan.nextLine();
            if (authentication(userName, password)) {
                System.out.println("YOU ARE AUTHORIZED TO USE THIS SECTION PLEASE KEEP IT CONFIDENTIAL");
                System.out.println("-----------------------HAVE A GREAT TIME------------------------- ");
                chance = 1;
                for (; ; ) {
                    System.out.println("\nEnter\n" +
                            "   1 : To Add New criminal \n" +
                            "   2:  To Search Criminal  Using Id \n" +
                            "   3:  To See All Criminal Data \n" +
                            "   4:  To Go To Setting \n" +
                            "   5:  To Terminate The Session");
                    choice = scan.nextInt();
                    scan.nextLine();
                    if (choice == 1)
                        addCriminal();
                    else if (choice == 2)
                    {
                        String inputID;
                        System.out.println("Enter The Id Of Criminal ");
                        inputID = scan.nextLine();
                        display(inputID);
                    }
                    else if (choice == 3)
                        displayAll();
                    else if (choice == 4)
                        setting();
                    else if (choice == 5)
                        break;
                    else {
                        System.out.println("invalid input ");
                        System.out.println("wrong choice " + (4 - chance) + "  left ");
                        chance++;
                    }
                }
                break;
            }
            else {
                if (chance == 3) {
                    System.out.println("maximum attempt reached  authentication failed ");
                    break;
                } else {
                    chance++;
                    System.out.println((":   " + (4 - chance) + " attempt left from 3"));
                }
            }
        }
    }
}

class show{
    public static void main(String[] arg) {
        int choice;
        int chance = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$--" +
                "WELCOME TO CRIMINAL RECORDING SYSTEM" +
                "--$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("ENTER \n 1:  TO JOIN AS SYSTEM ADMINISTRATOR" +
                "\n 2:  TO JOIN  AS POLICE OFFICER " +
                "\n 3:  TO CLOSE THE PROGRAM  ");
            try {
                choice = scan.nextInt();
                scan.nextLine();
                if (choice == 1) {
                    Admin admin = new Admin();
                    admin.operation();
                } else if (choice == 2) {
                    Officer officer=new Officer();
                    officer.operation();
                } else if (choice == 3)
                    System.exit(1);
                else
                    System.out.println("xxxxxxxxxxxxxxxxxxxx &wrong input   :program terminated xxxxxxxxxxxxxxxxxxxx");
            } catch (Exception e) {
                System.out.println("--xx something went wrong   :program terminated xx--");
        }
    }
}