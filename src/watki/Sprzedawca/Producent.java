package watki.Sprzedawca;

import java.util.List;

public class Producent implements Runnable{
    private Channel channel;

    public Producent(Channel channel, List<Produkt> produktList){
        this.channel = channel;
    }

    void putInChanel(Produkt produkt){
        channel.add(produkt);
    }

    @Override
    public void run() {
        for(Produkt produkt:produktList){
            producer.putInChanel(produkt);
        }
    }
}
