import java.util.*;

public class Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();  
        q.add(1);
        q.add(2);

        System.out.println(q);          
        System.out.println(q.remove()); 
        System.out.println(q);          
    }
}
