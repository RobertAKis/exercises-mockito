package exercise01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookFinderTest {

    //TODO: refactor this test to make it faster! use mockito to mock the actual database access!

    private SlowDatabase slowDatabase;

    @Before
    public void setUp() {
        slowDatabase = new SlowDatabase();
    }

    @Test
    public void should_get_book_title() throws Exception {
        final BookFinder bookfinder = new BookFinder(slowDatabase);

        Assert.assertEquals("Book [The Hobbit] found!", bookfinder.findBookTitleById(7));
        Assert.assertEquals("Book [20,000 Leagues under the Sea] found!", bookfinder.findBookTitleById(17));
        Assert.assertEquals("Book not found", bookfinder.findBookTitleById(999));
    }
}