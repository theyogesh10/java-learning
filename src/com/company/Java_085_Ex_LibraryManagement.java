package com.company;

import java.util.ArrayList;

class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class CentralLibrary{
    public ArrayList<Book> books;
    public CentralLibrary(ArrayList<Book> books){
        this.books=books;
    }
    
    public void addBook(Book book){
        System.out.println("The book has added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("The book has issued to the library to " + issued_to);
        this.books.remove(book);
    }
    
    public void returnBook(Book book){
        System.out.println("The book has been returned");
        this.books.add(book);
    }

}

public class Java_085_Ex_LibraryManagement {
    public static void main(String[] args) {
        
        /*
        Create a Library Management system which is capable of issuing books to student.
        Book should have info like:
        1. Book Name
        2. Book Author
        3. Issued to
        4. Issued on
        User should be able to add books, return issued books, issue book 
        Assume that all the users are registered with their names in the central database 
         */
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Algorithms","Danish");
        bk.add(b1);
        Book b2 = new Book("C with Me","Suraj");
        bk.add(b2);
        Book b3 = new Book("C++ with OOP","Ken");
        bk.add(b3);
        CentralLibrary cl = new CentralLibrary(bk);
        cl.addBook(new Book("Java","James"));
        System.out.println(cl.books);
        cl.issueBook(b3, "Yogesh");
        System.out.println(cl.books);

    }
}
