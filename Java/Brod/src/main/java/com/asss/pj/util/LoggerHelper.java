package com.asss.pj.util;

import com.asss.pj.entity.Brod;
import com.asss.pj.service.BrodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;

@Component
public class LoggerHelper {

    @Autowired
    BrodService brodService;
    private static String fileName = "Logger.txt";
    private static File file = new File(getFileName());
    private static int minBrojBrodova = 1;
    private static String poruka = "Nema dovoljno instanci, broj instanci: ";

    public static void proveraPutnicki(List<Brod> brod) {
        int brojac = 0;
        for (Brod brod1 : brod) {
            if (brod1.getNamena().toString().equals(Namena.PUTNICKI.toString())) {
                brojac++;
            }
        }
        if (brojac < getMinBrojBrodova()) {
            System.out.println(poruka + brojac);
            System.exit(0);
        }
    }

    public static void proveraVojni(List<Brod> brod) {
        int brojac = 0;
        for (Brod brod1 : brod) {
            if (brod1.getNamena().toString().equals(Namena.VOJNI.toString())) {
                brojac++;
            }
        }
        if (brojac < getMinBrojBrodova()) {
            System.out.println(poruka + brojac);
            System.exit(0);
        }
    }

    public static void proveraTeretni(List<Brod> brod) {
        int brojac = 0;
        for (Brod brod1 : brod) {
            if (brod1.getNamena().toString().equals(Namena.TERETNI.toString())) {
                brojac++;
            }
        }
        if (brojac < getMinBrojBrodova()) {
            System.out.println(poruka + brojac);
            System.exit(0);
        }
    }

    public static void proveraTanker(List<Brod> brod) {
        int brojac = 0;
        for (Brod brod1 : brod) {
            if (brod1.getNamena().toString().equals(Namena.TANKER.toString())) {
                brojac++;
            }
        }
        if (brojac < getMinBrojBrodova()) {
            System.out.println(poruka + brojac);
            System.exit(0);
        }
    }

    public BrodService getBrodService() {
        return brodService;
    }

    public static String getFileName() {
        return fileName;
    }

    public static File getFile() {
        return file;
    }

    public static int getMinBrojBrodova() {
        return minBrojBrodova;
    }

    public static String getPoruka() {
        return poruka;
    }
}
