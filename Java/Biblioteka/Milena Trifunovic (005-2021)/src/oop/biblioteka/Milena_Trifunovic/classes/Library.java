package oop.biblioteka.Milena_Trifunovic.classes;

import oop.biblioteka.Milena_Trifunovic.exceptions.ContainsException;
import oop.biblioteka.Milena_Trifunovic.exceptions.InitialsException;
import oop.biblioteka.Milena_Trifunovic.interfaces.Descriptive;

public abstract class Library implements Descriptive {
    private String type = getClass().getSimpleName();
    private String bookName;
    private int publishingYear;
    private Kind kind;

    public Library(String bookName, int publishingYear, Kind kind) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.kind = kind;
    }
    //
    public String getType() {
        return type;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public Kind getKind() {
        return kind;
    }

    @public String introduce() {
        String message = "[MT] - type: " + getType() + " - bookName: " + getBookName() +
                " - published: " + getPublishingYear() + " - kind: " + getKind();
        final String INITIALS = "MT";
        if (!message.startsWith(INITIALS, 1)) {
            throw new InitialsException("Your message don't start with your initials!");
        }
        if (message.contains("{") || message.contains("}") || message.contains("=")) {
            throw new ContainsException("You tried to use \"{\", \"}\" and/or \"=\" in presentation message!");
        }
        return message;
    }

    @Override
    public String toString() {
        return "[MT] - type: " + getType() + " - bookName: " + getBookName() +
                " - published: " + getPublishingYear() + " - kind: " + getKind();
    }
}
