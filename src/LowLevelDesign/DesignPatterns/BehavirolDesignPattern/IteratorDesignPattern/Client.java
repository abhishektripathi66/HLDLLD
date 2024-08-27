package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    
    public static void main(String[] args) {
        List<Book> b = Arrays.asList(new Book(100,"Science"),new Book(200,"Maths"),new Book(300, "Sports"));

        Iterator it =new Library(b).createIterator();

        while(it.hasNext()){
                System.out.println(it.next().toString());
        }
        
    }
}
