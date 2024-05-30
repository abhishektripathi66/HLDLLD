package LowLevelDesign.DesignPatterns.IteratorDesignPattern;

public class Book {
    
    private int price;
    private String bookName;

    public Book(int price, String bookname){
        this.price = price;
        this.bookName = bookname;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String toString(){
        return "Name of the book is: "+this.bookName+" and the price of the book is: "+this.price;
    }

    
}
