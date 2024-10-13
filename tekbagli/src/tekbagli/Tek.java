package tekbagli;

public class Tek {

	public static void main(String[] args) {
		Liste list = new Liste();
		list.ekle(6, "emre");
		list.ekle(5, "hakan");
		list.ekle(4, "yusuf");
		list.ekle(3, "fırat");
		list.arayaEkle(25, "Veli", 1);
		list.arayaEkle(30, "Ahmet", 2);
		list.basaEkle(15, "Duygu");
		list.sonaEkle(10, "Beyza");
		list.yazdir();


	}

}
