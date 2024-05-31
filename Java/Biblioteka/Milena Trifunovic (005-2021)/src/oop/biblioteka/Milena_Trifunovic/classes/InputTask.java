package oop.biblioteka.Milena_Trifunovic.classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputTask implements Runnable {

    public InputTask() {
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(Util.libraryFile))) {
            String line;

            System.out.println("\nReading data from: library.txt ...");

            Thread.sleep(900);

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("\nReading data is finished.");
        } catch (InterruptedException e) {
            System.out.println("Problem: sleep method.");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
