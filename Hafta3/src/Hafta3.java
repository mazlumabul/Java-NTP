import java.util.Scanner;

public class Hafta3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner a=new Scanner(System.in);
      
      
      //String x=a.next(); //String degisken alma
      //float y=a.nextFloat(); //Float degisken alma
      //int z=a.nextInt(); //int degisken alma      
      System.out.print("İlk aracın hızını girin:");
      double v1=a.nextDouble(); //double degisken alma
      System.out.print("İkinci aracın hızını girin:");
      double v2=a.nextDouble();
      System.out.print("t(saat):");
      double saat=a.nextDouble();
      
      
      Hafta3.MesafeHesapla(v1, v2, saat);
      //System.out.println("Mesafe :" + mesafe);     
      
	}
	
	public static void MesafeHesapla(double a, double b, double c)
	{
		double mesafe= (a-b)*c;
		System.out.println("Mesafe:"+ mesafe);
	}

}
