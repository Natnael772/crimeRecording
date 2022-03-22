package mylab.eg;

import java.util.Scanner;
import java.util.Arrays;

public class Criminal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String fromInt=Integer.toString(a);
//        String frombool=Boolean.toString(b);
//        String fromlong= Long.toString(l);
//        System.out.println(frombool);
//        System.out.println(fromlong);
//        System.out.println(fromInt);


//        System.out.println("enter a number");
//        String intValue=in.nextLine();
//        int fromStr=Integer.parseInt(intValue);
//        System.out.println(5+fromStr);
//


    }
}
class DoneOne{
    static int calculate(){
        Scanner in =new Scanner(System.in);
        String first=in.nextLine();
        String [] second=new String [first.length()];
        second=first.split("");
        int index=0;
        String [] op=new String[first.length()];
        for(int i=0;i<second.length;i++){
         if((second[i]=="+")||(second[i]=="-")||(second[i]=="*")||(second[i]=="/"))
         {
             op[index]=second[i];
             index++;
         }

        }
        return 1;
    }

}

