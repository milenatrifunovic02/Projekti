package oop.biblioteka.Milena_Trifunovic.classes;

import java.util.Comparator;

public class PublishingYearComparator implements Comparator<Library> {
    @Override
    public int compare(Library firstBook, Library secondBook) {
        if (firstBook.getPublishingYear() > secondBook.getPublishingYear()) {
            return 1;
        } else if (firstBook.getPublishingYear() < secondBook.getPublishingYear()) {
            return -1;
        } else {
            return 0;
        }
    }
}
