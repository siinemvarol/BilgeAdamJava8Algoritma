package lesson018;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOrnek {

	// bir tane string queue oluşturalım
	// kuyruğun içinde isimler atalım
	// kuyruktaki elemanları yazdıralım

	public static void main(String[] args) {

		Queue<String> kuyruk = new PriorityQueue<String>();

		kuyruk.add("ali");
		kuyruk.add("ahmet");
		kuyruk.add("veli");
		kuyruk.add("mehmet");
		kuyruk.add("zeki");
		kuyruk.add("sinan");

		for (String isim : kuyruk) {
			System.out.println(isim);
		}

		System.out.println(kuyruk);

		// FIFO : First In First Out
		// kuyruk boşalana kadar elemanları çıkaralım ve yazdıralım
		
//		kuyruk.remove();		// ikisi de aynı işi yapar ve String döndürür. boş kuyruktan eleman
								//	çıkarmak istediğimde exception hatası verir
//		kuyruk.poll();			// boş kuyruktan eleman çıkarmak istediğimde null döndürür
		
		while (!kuyruk.isEmpty()) {
			System.out.println(kuyruk.poll());
			System.out.println("kuyrukta kalanlar: " + kuyruk);
		}

	}

}
