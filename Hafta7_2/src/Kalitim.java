
public class Kalitim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Etcil a=new Etcil();
          a.Beslenme();
          a.CeneYapisi();
          a.Hayvan();
          a.Solunum();
          a.YasadigiYer(); */
		
		Balik a=new Balik();
		a.Beslenme();
        a.CeneYapisi();
        a.Solunum();
        a.YasadigiYer();
		}

}

class Hayvan{
	public Hayvan() {
		System.out.println("Kurucu fonksiyon olustu");
		//?? void olustu mu???? set ve get 
	}
	public void Hayvan() {
		System.out.println("Kurucu fonksiyon olustu??");
		//?? Kurucu void olustu mu???? set ve get 
	}	
	public void Beslenme() {
		System.out.println("Her Hayvan beslenir");
	}
	public void YasadigiYer() {
		System.out.println("Her Havada-Karada-Suda yaşar");
	}
	public void Solunum() {
		System.out.println("Her Hayvan nefes alir");
	}
	public void CeneYapisi() {
		System.out.println("Her hayvan acilip kapanan ceneye sahiptir");
	}
}

class Etcil extends Hayvan{
	@Override
	public void Beslenme() {
		System.out.println("Hayvanlar etle beslenir");
	}
	@Override
	public void CeneYapisi() {
		System.out.println("Kesici dislerden olusur");
	}
	public void MideYapisi() {
		System.out.println("Tek bölmeden olusan Mide");
	}
}

class Otcul extends Hayvan{
	@Override
	public void Beslenme() {
		System.out.println("Hayvanlar otla beslenir");
	}
	@Override
	public void CeneYapisi() {
		System.out.println("Öğütücü dislerden olusur");
	}
	public void MideYapisi() {
		System.out.println("Dört bölmeden olusan Mide");
	}
}

class Balik extends Otcul{
	@Override
	public void Beslenme() {
		System.out.println("Balıklar otla-etle beslenir");
	}
	@Override
	public void CeneYapisi() {
		System.out.println("Parçalayıcı dislerden olusur");
	}
	@Override
	public void Solunum() {
		System.out.println("Solungaç solunumu yaparlar");
	}
	@Override
	public void YasadigiYer() {
		System.out.println("Suda yasarlar");
	}
}




