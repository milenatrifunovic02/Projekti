package oop.biblioteka.Milena_Trifunovic.classes;

import oop.biblioteka.Milena_Trifunovic.interfaces.Registrative;

public class Online extends Library implements Registrative {
    public Online(String bookName, int publishingYear, Kind kind) {
        super(bookName, publishingYear, kind);
    }

    @Override
    public void registration() {
        System.out.println("You must register!");
    }
}
/*

 */