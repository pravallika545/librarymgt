package com.dxctraining.librarymgt.ui;

import java.util.List;

import com.dxctraining.librarymgt.entities.Author;
import com.dxctraining.librarymgt.entities.Book;
import com.dxctraining.librarymgt.service.BookService;
import com.dxctraining.librarymgt.service.BookServiceImpl;


public class BookMain {
    private BookService bookservice=new BookServiceImpl();
    public static void main(String args[])
    {
        BookMain libapp=new BookMain();
        libapp.run();
    }

    private void run() {
    	 Author author1 = new Author("1", "james");
         Author author2 = new Author("2", "jane");
         Author author3 = new Author("3", "orwell");
         Author author4 = new Author("4", "H.G.wells");
         Book book1 = new Book("ABC1","ulyssess", author1, 90.0);
         Book book2 = new Book("ABC2","pride and prejudice",author2, 50.0);
         Book book3 = new Book("ABC3", "nineteen", author3, 25.0);
         Book book4 = new Book("ABC4","shape of book",author4, 20.0);
         bookservice.addBook(book1);
         bookservice.addBook(book2);
         bookservice.addBook(book3);
         bookservice.addBook(book4);
         Showbooks();
    }

    private void Showbooks() {
        List<Book> list=bookservice.showBooks();
        for(Book book:list)
        {
            display(book);
        }

    }

    private void display(Book book) {
        System.out.println("display the books details");
        Author author=book.getAuthor();
        System.out.println("The author is "+author.getName()+" Name of the book "+book.getName()+
                " The price "+book.getCost());
    }


}