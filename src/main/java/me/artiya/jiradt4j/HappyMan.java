
package me.artiya.jiradt4j;

/**
 * เราต่างก็ดิ้นรนต่อสู้เรื่องต่างๆ
 * ก็เพื่อความสุขของตัวเองกันทั้งนั้นแหละ..
 * แม้
 * บางคน ที่ 'ทำเพื่อคนอื่น'
 * แต่สุดท้าย
 * ก็เพื่อให้ 'ใจตัวเอง' มีความสุข
 * ‪#‎คนแบบนี้มันน่ากราบ‬
 * Created by robot on 25/07/15.
 */

import java.util.Observable;
import java.util.Observer;


class Happiness {
}

class Man extends Observable implements java.lang.Runnable, Observer {
    public void run() {
        while (true) {
            setChanged();
            notifyObservers(doForOther());
        }
    }

    private Happiness doForOther() {
        // Do something good.
        return new Happiness();
    }

    @Override
    public void update(Observable o, Object arg) {
        // Finally he got happiness back.
        Happiness happiness = (Happiness) arg;
    }
}


public class HappyMan {
    public static void main(String[] args) {
        Man man = new Man();
        // Register himself to be an observer.
        man.addObserver(man);

        new Thread(man).start();
    }
}