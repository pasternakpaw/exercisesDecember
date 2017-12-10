package watki.Sprzedawca;

public class Producent {
    private Channel channel;

    public Producent(Channel channel){
        this.channel = channel;
    }

    void putInChanel(Produkt produkt){
        channel.add(produkt);
    }

}
