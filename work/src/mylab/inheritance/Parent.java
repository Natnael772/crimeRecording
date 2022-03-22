
package mylab.inheritance;

public class Parent {
    protected String name="natty";
    public static void main(String[] args) {
        B b=new B();


    }
}
  abstract class A  {
    abstract void get();
    void gett(){
        System.out.println("jsdfh");

     }
}
class B extends A{
    void get(){
        System.out.println("jdh");


    }
    void display(){
        System.out.println("object of b is used ");
    }
}