package exercise03;

import org.junit.Test;
import shared.Book;

import java.util.Arrays;
import java.util.List;

public class BookLoggerTest {

    // TODO: check that the method "BookLogger.logASingleBook(...)" was called exactly 2 times. Also check that the parameter of both calls were correct!

    @Test
    public void should_log_books() throws Exception {
        final List<Book> booksToLog = Arrays.asList(new Book(1, "Harry Potter"), new Book(2, "Lord of the Rings"));
        new BookLogger().logBooks(booksToLog);
    }
}