package mylab.exception;

import java.util.Arrays;
import java.util.Scanner;

public class Handler {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);



//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=7;j++){
//                if((j==4&&i!=5)||(i==5&&j<4)||i==1)
//                    System.out.print("J ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }
        {}
//        try{
//            Handler.er();
//        }
//        catch(IllegalAccessException e){
//            System.out.println(e);
        {
            int n;
            System.out.println("enter size");
            n=in.nextInt();
            int  []a=new int[n];
            System.out.println("enter ");
            for(int i=0;i<a.length;i++)
                a[i]=in.nextInt();
//            System.out.println("enter n");
//            n=in.nextInt();
        //    System.out.println(  hasN(a,n));

        }


        }


    static void er() throws IllegalAccessException {
        Scanner in=new Scanner(System.in);
        int b=0;
        System.out.println("enter");
        b=in.nextInt();
        if(b==5)
            throw new IllegalAccessException("boolshitter");
        System.out.println("b is good  now ");
    }
    static boolean hasNnnn(int []a ,int n){
        Arrays.sort(a);
        int nn=1;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1])
                nn++;

        }
        if(nn==n)
           return true;
        else
          return  false;

    }
    static int hasN(int []a ) {
        Arrays.sort(a);
        int nn = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1])
                nn++;

        }
        return nn;
    }



    static void isLegal(int []a ,int n){
        int yes=1;
        for(int i=0;i<a.length;i++)
            if(a[i]>=n)
                yes=0;

        if(yes==1)
            System.out.println("yes");
        else
            System.out.println("no");
    }

    static void balajance (int [] a){
        int [] type=new int[hasN(a)];
        int[] frq=new int [hasN(a)];
        int yes=1,compareIt;
        {
            int ii=1;
              type[0]=a[0];
               for(int i=0;i<a.length-1;i++){
                       if(a[i]!=a[i+1]){
                           type[ii]=a[i+1];
                                   ii++;
                   }
               }
        }
        System.out.println(Arrays.toString(type));
//        for(int i=0;i< frq.length;i++){
//            fre[i]=1;
//        }
        for(int i=0;i< frq.length;i++){
            for(int j=0;j<a.length;j++){
                if(type[i]==a[j]){
                    frq[i]++;

                }
            }
        }
        compareIt=frq[0];
        for(int i=0;i<frq.length;i++){
            if(compareIt!=frq[i]) {
                yes = 0;
                break;
            }
        }
        if(yes==1)
            System.out.println("balaced");
        else
            System.out.println("not balaced");



    }


}
