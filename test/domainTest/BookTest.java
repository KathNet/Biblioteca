package domainTest;

import domain.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    @BeforeEach
    void setUp(){
    }
    @Test
    void shouldReturnNewStateWhenBookChangesState() {
        Book book = new Book("GOT", "Pancho", "1990");
        boolean bookState;
        bookState = book.changeStateOfBook(false);
        assertEquals(false, bookState);
    }

}