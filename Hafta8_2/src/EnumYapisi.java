
public class EnumYapisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Islemler.Topla.Hesapla(25, 14));
		System.out.println(Islemler.Cikar.Hesapla(48, 35));
		System.out.println(Islemler.Carp.Hesapla(13, 8));
		System.out.println(Islemler.Bol.Hesapla(10, 12));
	}
}

enum Islemler{
	Topla, Cikar, Carp, Bol;
	public double Hesapla(double sayi1, double sayi2) {
		double sonuc=0;
		switch(this) {
		case Topla:
			sonuc= sayi1+sayi2;
			break;
		case Cikar:
			sonuc= sayi1-sayi2;
			break;
		case Carp:
			sonuc= sayi1*sayi2;
			break;
		case Bol:
			sonuc= sayi1/sayi2;
			break;
		}
		return sonuc;
		
	}
}
