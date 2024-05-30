package LowLevelDesign.DesignPatterns.IteratorDesignPattern;

import java.util.List;

public class Library implements Aggregator {

    private List<Book> bookslist;

    public Library(List<Book> bookslist){
        this.bookslist=bookslist;
    }

    @Override
    public Iterator createIterator() {
       return new BookIterator(bookslist);
    }
    
}
