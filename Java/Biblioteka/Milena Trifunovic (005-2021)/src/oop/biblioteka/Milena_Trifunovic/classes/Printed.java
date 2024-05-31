package oop.biblioteka.Milena_Trifunovic.classes;

public class Printed extends Library {
    private int pageNumber;

    public Printed(String bookName, int published, Kind kind, int pageNumber) {
        super(bookName, published, kind);
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    @Override
    public String introduce() { //redefinisan metod
        return super.introduce() + ", page number: " + getPageNumber();
    }

    @Override
    public String toString() { //redefinisan toString
        return super.toString() + ", page number: " + getPageNumber();
    }
}
