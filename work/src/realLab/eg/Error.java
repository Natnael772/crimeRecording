package realLab.eg;

import java.util.*;

public class Error {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//       { double a,b,sum=0;
//           System.out.println("enter two numbers");
//           a=in.nextDouble();
//           b=in.nextDouble();
//
//           try{
//               sum=a/b;
//               System.out.println("division is :"+sum);
//           }
//           catch(Exception e){
//               System.out.println("division by zero encounterd");
//           }
//           finally{
//               System.out.println("what ever it is printed");
//           }
//       }
        //stack

////       Stack<String>book=new Stack<String>();
////       book.add("java");
////       book.add("c++");
////       book.add("web");
////       book.add("net");
////       System.out.println(book.pop());
//     //  book.pop();
//       System.out.println("");
//      book.push("data ");
//       Iterator it=book.iterator();
//       while(it.hasNext()){
//           System.out.println( it.next());
//       }
//       {//linked list


//           LinkedList<String> names = new LinkedList<String>();
//           names.push("natty");
//           names.push("leo");
//           names.push("net");
//           names.push("rob");
//           System.out.println(names.add("nati gi"));
//           System.out.println(names.pop());
//           Iterator it = names.iterator();
//           System.out.println(it.next());
        Map<Integer, String> map = new HashMap<>();
        map.put(1980, "nati me ");
        map.put(1389, "segni me ");
        map.put(0000, "gi me ");
        System.out.println(map.get(1980));
        ArrayList<String> me = new ArrayList<>();
        me.add("nati");
        me.add("segni");
        me.add("gi");
        me.add("leo");
        me.remove(1);
        Iterator it = me.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+",");

        }
        System.out.print("\b");

    }
}




class A{
    String name;
    A(){
        name="natinael";
    }
}
