package org.example.books;

public class Audiobook extends Book {
    private int duration; // how long does the book last
    private byte[] audioStream;
    private String description;

    public Audiobook(String author, String title, String isbn, String publisher,String genre, int pages, boolean available, String description, int duration) {
        super(author,title,isbn,publisher,genre,description,pages,available);
        this.duration = duration;
        this.audioStream = null;
    }

}
