package org.example.books;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Library {
    private List<Book> books = new ArrayList<Book>();
    private HashMap<String,Book> catalog = new HashMap<>();

    public void addBook(Book book) {
        String isbn = book.getIsbn();
        if(catalog.containsKey(isbn) && catalog.get(isbn) != null) {
            Book currentBook = catalog.get(isbn);
            currentBook.setInventory(currentBook.getInventory() + 1);
        }
        else{
            books.add(book);
        }
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void checkoutBook(String isbn) {
        Book currentBook = catalog.get(isbn);
        currentBook.setAvailable(false);
        currentBook.setInventory(currentBook.getInventory()+1);
    }

    public void returnBook(String isbn){
        Book currentBook = catalog.get(isbn);
        currentBook.setAvailable(true);
        currentBook.setInventory(currentBook.getInventory()-1);
    }



}


















