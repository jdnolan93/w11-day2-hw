import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("Hola", "James Nolan", "Autobiography");
        book2 = new Book("Coding for Dummies", "J Script", "Educational");
        book3 = new Book("100 Quiz Questions", "Bill Chanter", "Non-fiction");
    }

    @Test
    public void getBookCount(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, library.getCapacity());
    }

}
