package exercise03;

import shared.Book;

import java.util.Collection;

public class BookLogger {

    public void logBooks(final Collection<Book> books) {
        books.forEach(this::logASingleBook);
    }

    public void logASingleBook(final Book book) {
        System.out.println("This is a very nice book: " + book.getTitle());
    }
}
