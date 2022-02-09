import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setup(){
        book = new Book("Hola", "James Nolan", "Autobiography");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Hola", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("James Nolan", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Autobiography", book.getGenre());
    }
}
