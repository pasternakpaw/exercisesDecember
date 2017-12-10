package watki.Sprzedawca;

public class Channel{

        public static void main(String[] args) {

            Channel channel = new Channel();
            Producent producer = new Producent(channel);
            Konsument konsument = new Konsument(channel);

    }
    public void add(Produkt produkt){}

    public Produkt get() {return null;}
        }