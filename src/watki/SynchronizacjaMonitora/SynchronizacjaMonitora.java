package watki.SynchronizacjaMonitora;

public class SynchronizacjaMonitora {
    static String monitor ="";
    static int wartoscWspoldzielona = 0;

// obiekt klasy class
    public static synchronized void metodaSynchronizowana(){
        synchronized(monitor){
            System.out.println(Thread.currentThread().getId() + " " + wartoscWspoldzielona);
            //int wygenerowana = 0;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int random = (int) (Math.random()*100);
            wartoscWspoldzielona = wartoscWspoldzielona+random;

            // int wygenerowana = (int) Math.random() *100;
            System.out.println(Thread.currentThread().getId() + " " + random + " " + wartoscWspoldzielona);

        }
    }

    public static void main(String[] args) {
        for (int i =0; i < 10; i++){
            new Thread(()-> {
                metodaSynchronizowana();
            }).start();

    }

}
}

