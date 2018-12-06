
public class Deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hayvan a=new Hayvan();
		//Hayvan a=new Hayvan(15);
		//Hayvan a=new Hayvan(16, "Tek kısımlı");
		//a.Goster();
		Balik b=new Balik();
		b.Goster();
		Hayvan c=new Hayvan(15);
		//System.out.println(c.Goster("ddd"));
	}

}

class Hayvan{
	public int degiskenpublic=0;
	protected int degiskenprotected=0;
	private int degiskenprivate=0;
	int degiskendefault=0;
	
	public double agirlik=0;
	public String cene="";
	public String mide="";
	Hayvan(){
		this.agirlik=1;
		this.cene="Her hayvanın cenesi vardır";
		this.mide="Her havyanın midesi vardır";
		System.out.println("Hayvan Kurucu Fonksiyon calıştı");
	}
	
	Hayvan(double agirlik){
		this.agirlik=agirlik;
		this.cene="Her hayvanın cenesi vardır";
		this.mide="Her havyanın midesi vardır";
		System.out.println("Hyavan Kurucu Fonksiyon -- calıştı");
	}
	
	Hayvan(String cene){
		
		this.cene="Her hayvanın cenesi vardır";
		this.mide="Her havyanın midesi vardır";
		System.out.println("Hyavan Kurucu Fonksiyon -- calıştı");
	}
	Hayvan(double agirlik, String cene){
		this.agirlik=agirlik;
		this.cene=cene;
		this.mide="Her havyanın midesi vardır";
		System.out.println("Hayvan Kurucu Fonksiyon --- calıştı");
	}
	public void Goster() {
		System.out.println("Agirlik"+this.agirlik+" Mide:"+this.mide+ " Cene:"+this.cene);
	}
	/*
	 //Hatalıdır çünkü void veri türünü int olarak deger donderen bir
	 //fonksiyona dondermeye calisildi. Bu Overloading degildir
	public int Goster() {
		//System.out.println("Agirlik"+this.agirlik+" Mide:"+this.mide+ " Cene:"+this.cene);
		return 0;
	}
	*/
}

class Etcil extends Hayvan{
	
	Etcil(){
		this.agirlik=15;
		this.cene="Köpek dişleri gelişmiş";
		this.mide="2 bölümden oluşur";
		System.out.println("Etcil kurucu Fonksiyon calıştı");
	}
	@Override
	public void Goster() {
		System.out.println("Agirlik"+this.agirlik+" Mide:"+this.mide+ " Cene:"+this.cene);
	}
}

class Balik extends Etcil{
	Balik(){
		this.agirlik=2;
		this.cene="Kesici çene yapısı";
		this.mide="Balıkların midesi tek bölümden oluşur";
		System.out.println("Balık kurucu Fonksiyon calıştı");
	}
	public void BalikGoster() {
		super.Goster();
	}
	
}
