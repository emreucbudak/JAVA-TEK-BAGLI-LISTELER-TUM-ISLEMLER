package tekbagli;

public class Liste {
	Bagli head;
	Bagli tail;
	public void ekle (int a, String b) {
		Bagli eleman1 = new Bagli();
		eleman1.isim = b;
		eleman1.numara = a;
		if (head  == null  ) {
			head = eleman1;
			tail = eleman1;
			
		}
		else {
			tail.next = eleman1;
			tail = eleman1;
			
		}
	}
	public void arayaEkle (int a, String b,int c) {
		int d = 0;
		Bagli eleman2 = new Bagli();
		Bagli ref = head;
		Bagli ref2 = head;
		eleman2.numara = a;
		eleman2.isim = b;
		while (c>d) {
			ref2 = ref;
			ref = ref.next;
			d++;
			
		}
		if (c == d ) {
			ref2.next = eleman2;
			eleman2.next = ref;
			
		}
		
	}
	public void yazdir () {
		Bagli eleman = new Bagli();
		eleman = head;
		eleman.isim = head.isim;
		eleman.numara = head.numara;
		while (eleman != null) {
			System.out.println(eleman.isim + eleman.numara);
			eleman = eleman.next;
		}
	}
	public void basaEkle (int a , String b) {
		Bagli eleman = new Bagli();
		eleman.isim = b;
		eleman.numara = a;
		eleman.next = head;
		head = eleman;
	}
	public void sonaEkle (int a , String b) {
		Bagli eleman4 = new Bagli();
		eleman4.isim = b;
		eleman4.numara = a;
		tail.next = eleman4;
		tail = eleman4;
	}
	public void bastanSil () {
		head.isim = head.next.isim;
		head.numara = head.next.numara;
		head = head.next;
		
		
	}
	public void sondanSil () {
		Bagli ref = head;

		Bagli ref2 = head;

		
		while (ref.next != null ) {
			ref2 = ref;
			ref = ref.next;
			
			
		}
		ref2.next = null;
		tail = ref2;
	}
	public void aradanSil (int c) {
		int a = 0;
		Bagli ref = head;
		Bagli ref2 = head;
		
		while (c> a ) {
			ref2 = ref;
			ref = ref.next;
			a++;
			
		}
		ref2.next = ref.next;
		ref = ref2.next.next;
	}

}
