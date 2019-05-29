package service;

import domain.Book;

import java.util.ArrayList;
import java.util.List;

public class BookingService {

    private static List<Book> collectionBooks = new ArrayList<Book>();

    public static List<Book> getCollectionBooks() {
        return collectionBooks;
    }

    public static void chargeInitialBooks() {
        collectionBooks.clear();
        Book book1 = new Book("El Ingenioso Hidalgo Don Quijote de la Mancha", "1605", "Miguel de Cervantes");
        Book book2 = new Book("El Poema de mio Cid", "1140", "Unknown");
        Book book3 = new Book("The A.B.C. Murders", "1936", "Agatha Christie");
        Book book4 = new Book("A Game of Thrones", "1996", "George R. R. Martins");
        Book book5 = new Book("Chronic Blood", "2020", "Katherine Pino");

        collectionBooks.add(book1);
        collectionBooks.add(book2);
        collectionBooks.add(book3);
        collectionBooks.add(book4);
        collectionBooks.add(book5);
    }

    public static boolean addBookToTheSystem(Book book) {
        collectionBooks.add(book);
        return true;
    }

    public static boolean removeBookToTheSystem(String nameBook) {
        int index = 0;
        for (Book searchBook : collectionBooks) {
            if (searchBook.getNameOfBook().equals(nameBook)) {
                collectionBooks.remove(index);
                return true;
            }
            index++;
        }
        return false;
    }
}
