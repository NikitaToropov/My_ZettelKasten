package ru.atikin.web.startingapp;

import ru.atikin.web.startingapp.pckg.Ifacer;

public class Realisation extends Abstr implements Ifacer {
    public void doSmth() {

        System.out.println(Ifacer.i);
        a = 4;
        getString();
    }
}
