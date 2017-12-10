package watki.Sumatrzech;

import java.util.Iterator;
import java.util.Random;

public class SumaTrzechWatkow {
    int liczba1 = 0;
    int liczba2 = 0;
    int liczba3 = 0;

    public static void main(String[] args) throws InterruptedException {

        SumaTrzechWatkow sumaTrzechWatkow = new SumaTrzechWatkow();

        /*Thread two = new Thread(MojeRunnable(){
           @Override


        });
*/
        Thread three = new Thread(() -> {
            int randomsleep3 = (int) (Math.random()*100);
            try {
                Thread.sleep(randomsleep3);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            sumaTrzechWatkow.liczba2 = (int) (Math.random()*100);
            System.out.println(sumaTrzechWatkow.liczba2);
        });three.start();

        Thread one = new Thread(() -> {
            int randomsleep1 = (int) (Math.random()*100);
            try {
                Thread.sleep(randomsleep1);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            sumaTrzechWatkow.liczba3 = (int) (Math.random()*100);
            System.out.println(sumaTrzechWatkow.liczba3);
        });one.start();
            Thread.sleep(1000);
          System.out.println("Suma wygenerowanych liczb " + (sumaTrzechWatkow.liczba1 +  sumaTrzechWatkow.liczba2 + sumaTrzechWatkow.liczba3));
    }
}
interface MojeRunnable extends Runnable{
    int podajWygenerowana();
}
class MojeRunnableImpl implements MojeRunnable{
    int wygenerowana;

    @Override
    public int podajWygenerowana() {
        return wygenerowana;
    }

    @Override
    public void run() {
        Random random = new Random();
        wygenerowana = random.nextInt(100);
    }
}

