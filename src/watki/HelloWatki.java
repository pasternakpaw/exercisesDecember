package watki;

/**
 * Hello main.java.pl.sda.threads.watki.
 * Napisz program ktory tworzy nastepujace main.java.pl.sda.threads.watki.
 * Dziedziczacy po Thread.
 * Klase implementujaca Runnable
 * Anonimowa klase dziedziczaca po Thread
 * Anonimowa klase implementujaca runnable
 * Lambda
 * Kazdy watek w metodzie run wypisuje stringa opisujacego sposob utworzenia
 *
 * @author mj
 */
public class HelloWatki {

    public static void main(String[] args) {
        Thread poThread = new DziedziczePoThread();
        Thread poRunnable = new Thread(new ImplementujeRunna());
        Thread poAnonim = new Thread() {
            @Override
            public void run() {
                System.out.println("Jestem watkiem dziedziczacym po anonimowej klasie Thread");
            }
        };
        //Runnable poAnonimRunnable;



        //poAnonimRunnable.start();
        Thread threadDlaAnonimRunnable = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Jestem watkiem dziedziczacym po anonimowej klasie runnable");
            }

        });
        Thread zLambda = new Thread(() ->{
            System.out.println("Lambda");
        });

        poThread.start();
        poRunnable.start();
        poAnonim.start();
        threadDlaAnonimRunnable.start();
        zLambda.start();


    }
}

//Nie anonimowa klasa. Ma nazwe ktorej mozna uzyc z operatorem new
class DziedziczePoThread extends Thread {
    public void run() {
        System.out.println("Jestem watkiem dziedziczacym po Thread");
    }
}

class ImplementujeRunna implements Runnable {
    public void run() {
        System.out.println("Jestem watkiem implementujacym po Runnable");
    }
}

