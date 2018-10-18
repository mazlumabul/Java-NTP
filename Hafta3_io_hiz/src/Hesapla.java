import java.util.Scanner;
public class Hesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner a=new Scanner(System.in);
      
      System.out.print("Birinci arac hizi:");
      double v1= a.nextDouble();
      System.out.print("İkinci arac hizi:");
      double v2= a.nextDouble();
      System.out.print("sure (saat):");
      double t= a.nextDouble();
      
      System.out.print("Aradaki mesafe "+ Hesapla.HesaplaYol(v1, v2, t));
	}
	
	public static double HesaplaYol(double v1, double v2, double t)
	{
		return (v1-v2)*t;
	}

}
