package oop.biblioteka.Milena_Trifunovic;

import oop.biblioteka.Milena_Trifunovic.classes.*;
import oop.biblioteka.Milena_Trifunovic.classes.Kind;

import java.util.*;

import static oop.biblioteka.Milena_Trifunovic.classes.Util.*;

public class LibraryDemo {

    public static void main(String[] args) {
        Set<Library> books = new LinkedHashSet<>();
// komentar
        Library book1 = new Printed("Anna Karenina", 1878, Kind.NOVEL, 864);
        Library book2 = new Printed("The Little Prince", 1943, Kind.STORY, 112);
        Library book3 = new Printed("The Complete Poems of Emily Dickinson",
                1955, Kind.POEM_COLLECTIONS, 784);
        Library book4 = new Online("Hamlet", 1603, Kind.NOVEL);
        Library book5 = new Online("Winnie-the-Pooh", 1926, Kind.STORY);
        Library book6 = new Online("Alice's adventures in Wonderland", 1865, Kind.NOVEL);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        System.out.println("Show all books from library:");
        showBooksFromLibrary(books);

        System.out.println("\nShow sorted list of books:");
        List<Library> sortedBooksList = new ArrayList<>(sortedList(books));
        showBooksFromLibrary(sortedBooksList);

        System.out.println("\nShow printed books type:");
        List printedList = new ArrayList<>(makePrintedBooksList(books));
        showPrintedBooks(printedList);

        System.out.println("\nShow online books type:");
        List onlineList = new LinkedList<>(makeOnlineBooksList(books));
        showOnlineBooks(onlineList);

        Thread writingP = new Thread(new OutputTask(printedList));
        Thread writingO = new Thread(new OutputTask(onlineList));

        Thread reading = new Thread(new InputTask());

        System.out.println("\nWriting data in library.txt ...");
        writingP.start();
        writingO.start();

        while (writingP.isAlive() || writingO.isAlive()) {

        }

        reading.start();
    }
}
