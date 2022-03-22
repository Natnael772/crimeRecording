package mylab.data.serchandsort;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Search_And_Sort {
    public static void main(String[] args) {
//       d();
        Scanner in=new Scanner(System.in);




  int [] a=new int[5];
            int i = 0;
            while (i < 5) {
                System.out.println("enter");
                a[i] = in.nextInt();
                i++;
            }
//          a block to accept  elements of  the array
        {
//        System.out.println(Arrays.toString(Sort.bubbleSort(a,1)));
//        System.out.println(Arrays.toString(Sort.bubbleSort(a)));
//        System.out.println(Arrays.toString(Sort.selectionSort(a,4)));
        System.out.println(Arrays.toString(Sort.insertionSort(a,1)));
        }
        {
//            System.out.println(Search.linearSearch(a,8));
//            System.out.println(Search.binarySearch(a,8));

        }
    }
   static void d(){
        Scanner in = new Scanner(System.in);
//       int [] a=new int[5];
        int choice;
        for (;;) {
            System.out.println("enter 1 to do and 2 to halt");
            choice = in.nextInt();
            if (choice == 1)
                System.out.println("okk");
            else
                System.exit(0);

        }
    }
}

class  Sort{
    Sort(){
        System.out.println("riht ");
        Sort t=new Sort();
    }

    static int [] bubbleSort(int [] a){
        int swap;
        int numComp=0;
        int  numSwap=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    swap=a[j];
                    a[j]=a[j+1];
                    a[j+1]=swap;
                    numComp++;
                    numSwap++;
                }
                else
                    numComp++;
            }
        }
        System.out.println("number of comparation :"+numComp);
        System.out.println("number of swapping done  :"+numSwap);
        return a;
    }
    static int [] bubbleSort(int [] a,int  s){
        int numComp=0;
        int  numSwap=0;
        int swap;
        System.out.println("           before "+Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    swap=a[j];
                    a[j]=a[j+1];
                    a[j+1]=swap;
                    numComp++;
                    numSwap++;
                }
                else
                numComp++;

            }
            System.out.println("int the "+(i+1)+"the iteration"+Arrays.toString(a));
        }
        System.out.println("number of comparation :"+numComp);
        System.out.println("number of swapping done  :"+numSwap);

        return a;
    }
    static int [] selectionSort(int [] a){
        int min=0,swap=0;int numComp=0,numSwap=0;
        for( int i=0;i<a.length;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min] >a[j])
                {
                    min=j;
                    numComp++;
                }
                else
                    numComp++;
            }
            if(min!=i){
                swap=a[i];
                a[i]=a[min];
                a[min]=swap;
                numSwap++;
            }
        }
        System.out.println("number of comparation :"+numComp);
        System.out.println("number of swapping done  :"+numSwap);
        return a;
    }
    static int [] selectionSort(int [] a,int s){
        int min=0,swap=0;
        System.out.println("            before "+Arrays.toString(a));
        for( int i=0;i<a.length;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j])
                    min=j;

                }
            if(min!=i){
                swap=a[i];
                a[i]=a[min];
                a[min]=swap;

            }
            System.out.println("int the "+(i+1)+"the iteration"+Arrays.toString(a));
        }
        return a;
    }
    static int []insertionSort(int [] a){
        int swap;
        for(int i=0;i<a.length;i++){
                for(int j=i;j>0&&a[j]<a[j-1];j--) {
                    swap = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = swap;
                }

        }
        return a;
    }
    static int []insertionSort(int [] a,int s){
        int swap;
        System.out.println("            before "+Arrays.toString(a));

        for(int i=0;i<a.length;i++){
            for(int j=i;j>0&&a[j]<a[j-1];j--) {
                swap = a[j];
                a[j] = a[j - 1];
                a[j - 1] = swap;
            }
            System.out.println("int the "+(i+1)+"the iteration"+Arrays.toString(a));
        }
        return a;
    }

}
class Search{
    static int linearSearch(int [] a,int b){
        int loc=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==b){
                loc=i;
                break;
            }
        }
        return loc;

    }
    static int binarySearch(int [] a,int num){
        Sort.insertionSort(a);
        int left=0,right=a.length,mid=0,found=0;
        do{
            mid=(right+left)/2;
            if(num==a[mid])
                found=1;
            else{
                if(num>a[mid])
                    left=mid+1;
                else
                    right=mid-1;

            }
          }
        while(found==0&&left<right);
        if(found==0)
            return -1;
        else
            return mid;
    }


}