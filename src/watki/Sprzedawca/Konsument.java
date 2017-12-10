package watki.Sprzedawca;

public class Konsument implements Runnable {
    private Channel channel;

    public Konsument(Channel channel){
        this.channel = channel;
    }

    void buy() {
        Produkt produkt = channel.get();
    }

    @Override
    public void run() {
        buy();
    }
}
