package ru.atikin.web.startingapp.pckg;

public interface Ifacer {
    int i = 1;

    default String getString() {
        return "string";
    }
}
