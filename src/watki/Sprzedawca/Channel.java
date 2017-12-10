package watki.Sprzedawca;

import java.util.ArrayList;
import java.util.List;

public class Channel{

        public static void main(String[] args) {

            Channel channel = new Channel();
            Producent producer = new Producent(channel);
            Konsument konsument = new Konsument(channel);

            List<Produkt> produktList = new ArrayList<>();
            produktList.add(new Produkt("vodka"));
            produktList.add(new Produkt("beer"));
            produktList.add(new Produkt("harring"));
            produktList.add(new Produkt("pickle"));

            Thread producerThread = new Thread(producer);
            producerThread.start();
            Thread comsumerThread = new Thread(konsument);
           comsumerThread.start();



    }
    public void add(Produkt produkt){}

    public Produkt get() {return null;}


}