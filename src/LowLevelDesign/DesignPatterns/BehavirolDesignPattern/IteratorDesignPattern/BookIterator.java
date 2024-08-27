package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.IteratorDesignPattern;

import java.util.List;

public class BookIterator implements Iterator{

    private List<Book> books;
    private int index =0;
    
    public BookIterator(List<Book> books){
        this.books=books;
    }

    @Override
    public boolean hasNext() {
        return index<this.books.size();
    }

    @Override
    public Object next() {
        if(this.hasNext()) return books.get(index++);
        else return null;
    }
    
}
