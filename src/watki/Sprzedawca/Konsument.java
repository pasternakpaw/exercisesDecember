package watki.Sprzedawca;

public class Konsument {
    private Channel channel;

    public Konsument(Channel channel){
        this.channel = channel;
    }

    void buy() {
        Produkt produkt = channel.get();
    }
}
