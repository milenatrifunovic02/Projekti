package oop.biblioteka.Milena_Trifunovic.classes;

import java.io.*;
import java.util.List;

public class OutputTask implements Runnable {
    private List<Library> list;

    public OutputTask(List<Library> list) {
        this.list = list;
    }

    @Override
    public void run() {
        try (Writer writer = new FileWriter(Util.libraryFile, true)) {
            for (Library library : list) {
                writer.write(library.getBookName() + " [" + library.getType() + "]\n");
            }
            Thread.yield();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
