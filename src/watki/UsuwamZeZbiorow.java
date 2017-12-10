package watki;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
Napisz program kt�ry r�wnocze�nie wypisuje na ekran losowy element z nast�puj�cych zbior�w
Q, W, E, R, T, Y
1, 2, 3, 4, 5, 6
^, &, *, (, #
Wypisanie elementu usuwa go ze zbioru
Program ko�czy dzia�anie gdy wszystkie elementy zostan� wypisane

W jaki inny spos�b mozna przekazac referencje zbioru do watku?
W jaki inny sposob mozna zainicjalizowac zbiory?
Jak wyeliminowac zmienne i bloki statyczne?
 na koniek programu stan zbiorwo wyswetlic
 * @author mj
 *
 */
public class UsuwamZeZbiorow {
	//Instancja zbioru 1
	private static Set<String> zbior1 = new HashSet<>();
	//Wypelnienie zbioru danymi
	static {
		zbior1.add("Q");
		zbior1.add("W");
		zbior1.add("E");
		zbior1.add("R");
		zbior1.add("T");
		zbior1.add("Y");
	}
	private static Set<String> zbior2 = new HashSet<>();
	//Wypelnienie zbioru danymi
	static {
		zbior2.add("1");
		zbior2.add("2");
		zbior2.add("3");
		zbior2.add("4");
		zbior2.add("5");
		zbior2.add("6");
	}
	private static Set<String> zbior3 = new HashSet<>();
	//Wypelnienie zbioru danymi3
	static {
		zbior3.add("^");
		zbior3.add("&");
		zbior3.add("*");
		zbior3.add("(");
		zbior3.add("#");
	}

	public static void main(String[] args) {
		//Watek dla zbioru
		Thread watekZbioru1 = new Thread(new Runnable(){
			@Override
			public void run() {
				//Pobieramy iterator
				Iterator<String> iterator1 = zbior1.iterator();
				//Dopoki iterator moze zwrocic element
				while(iterator1.hasNext()){
					//Pobierz i wypisz element
					System.out.println(iterator1.next());
					//Usun element
					iterator1.remove();
				}
			}
		});



		Thread watekZbioru2 = new Thread(() -> {
				//Pobieramy iterator
				Iterator<String> iterator2 = zbior2.iterator();
				//Dopoki iterator moze zwrocic element
				while(iterator2.hasNext()){
					//Pobierz i wypisz element
					System.out.println(iterator2.next());
					//Usun element
					iterator2.remove();
				}
			});

		Thread watekZbioru3 = new Thread(() -> {
			//Pobieramy iterator
			Iterator<String> iterator3 = zbior3.iterator();
			//Dopoki iterator moze zwrocic element
			while(iterator3.hasNext()){
				//Pobierz i wypisz element
				System.out.println(iterator3.next());
				//Usun element
				iterator3.remove();
			}
	});

		watekZbioru1.start();
		watekZbioru2.start();
		watekZbioru3.start();

		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (zbior1.isEmpty() && zbior2.isEmpty() && zbior3.isEmpty()){



		System.out.println("rozmiar zbioru 1 wysoni: "+zbior1.size());
		System.out.println("rozmiar zbioru 2  wysoni: "+zbior2.size());
		System.out.println("rozmiar zbioru 3 wysoni: "+ zbior3.size());
	}
		}
		//Wystartuj watek


	}