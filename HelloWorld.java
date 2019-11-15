import java.util.*;
interface I{
    void print();
}

interface J extends I{
    
}
public class HelloWorld{
    
    void run(I i){
        i.print();
    }
     public static void main(String []args){
        HelloWorld h = new HelloWorld();
       
        I i = () -> System.out.println("i interface");
        J j = () -> System.out.println("j interface");
  
        List<I> lists = new ArrayList<>();
        lists.add(i);
        lists.add(j);
        
        for(I x : lists){
            h.run(x);
        }
     }
}
