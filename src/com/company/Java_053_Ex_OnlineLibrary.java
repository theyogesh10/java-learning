package com.company;

class Library{
    String[] books;
    int numberOfBooks;
    Library(){
        this.books = new String[100];
        this.numberOfBooks = 0;
    }
    void addBook(String book){
        this.books[numberOfBooks] = book;
        numberOfBooks++;
        System.out.println(book + " has been added!");
    }
    void showAvailableBooks(){
        System.out.println("Available books are : ");
        for (String book : this.books){
            if(book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book){
        for (int i=0; i<this.books.length; i++){
            if(this.books[i].equals(book)) {
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist!");
    }
    void returnBook(String book){
        addBook(book);
    }

}


public class Java_053_Ex_OnlineLibrary {
    public static void main(String[] args) {

        Library centralLibrary = new Library();
        centralLibrary.addBook("The Secret");
        centralLibrary.addBook("The Buddha and His Dhamma");
        centralLibrary.addBook("Programming in C");
        centralLibrary.addBook("LetUs Java");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("Programming in C");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("Programming in C");
        centralLibrary.showAvailableBooks();

    }
}
