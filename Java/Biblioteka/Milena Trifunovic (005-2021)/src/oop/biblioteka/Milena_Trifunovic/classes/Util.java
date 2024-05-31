package oop.biblioteka.Milena_Trifunovic.classes;

import java.util.*;

public class Util {

    private Util() {
    }

    static String libraryFile = "library.txt";

    public static void showBooksFromLibrary(Collection<Library> books) {
        int number = 0;
        for (Library library : books) {
            System.out.println(++number + ". " + library);
        }
    }

    public static ArrayList<Library> sortedList(Collection<Library> books) {
        ArrayList<Library> sortedBooks = new ArrayList<>(books);
        Collections.sort(sortedBooks, new PublishingYearComparator());
        return sortedBooks;
    }

    public static ArrayList<Printed> makePrintedBooksList(Collection<Library> books) {
        ArrayList<Printed> printedBooks = new ArrayList<>();
        for (Library list : books) {
            if (list.getClass() == Printed.class) {
                printedBooks.add((Printed) list);
            }
        }
        return printedBooks;
    }

    public static void showPrintedBooks(Collection<Printed> books) {
        int number = 0;
        for (Printed printed : books) {
            System.out.println(++number + ". " + printed);
        }
    }

    public static LinkedList<Online> makeOnlineBooksList(Collection<Library> books) {
        LinkedList<Online> printedBooks = new LinkedList<>();
        for (Library list : books) {
            if (list.getClass() == Online.class) {
                printedBooks.add((Online) list);
            }
        }
        return printedBooks;
    }

    public static void showOnlineBooks(Collection<Online> books) {
        int number = 0;
        for (Online online : books) {
            System.out.println(++number + ". " + online);
        }
    }
}