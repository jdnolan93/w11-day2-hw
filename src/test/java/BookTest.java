import org.junit.Before;

public class BookTest {

    Book book;

    @Before
    public void setup(){
        book = new Book("Hola", "James Nolan", "Autobiography");
    }
}
