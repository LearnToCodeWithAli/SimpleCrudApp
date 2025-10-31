package org.example.books;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Book {
    private String author;
    private String title;
    private String isbn;
    private String publisher;
    private String genre;
    private String description;
    private int pages;
    private boolean available;
    private int inventory;

    public Book(Audiobook audiobook){
        this.author = audiobook.getAuthor();
        this.title = audiobook.getTitle();
        this.isbn = audiobook.getIsbn();
        this.publisher = audiobook.getPublisher();
        this.genre = audiobook.getGenre();
        this.description = audiobook.getDescription();
        this.pages = audiobook.getPages();
    }
}
