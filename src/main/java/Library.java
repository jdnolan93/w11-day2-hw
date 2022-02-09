import java.util.ArrayList;

public class Library {

    private ArrayList<Book> shelf;
    private int capacity;

    public Library(){
        this.shelf = new ArrayList<>();
        this.capacity = 3;
    }


    public int getBookCount() {
       return this.shelf.size();
    }

    public void addBook(Book book) {
        if (this.shelf.size() < this.capacity)
        this.shelf.add(book);
    }

    public int getCapacity() {
        return this.capacity;
    }
}
