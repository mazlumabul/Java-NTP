import java.util.Scanner;

public class Hafta3_io {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner a=new Scanner(System.in);
       //System.out.print("birinci sayı giriniz");
       //double a1=a.nextDouble();
       //System.out.print("ikinci sayı giriniz");
       //double a2=a.nextDouble();       
       //System.out.println("Sonuç:"+(a1+a2));       
       System.out.print("x degerini gir:");
       double x=a.nextDouble();       
       Hafta3_io.hesapla(x);       
       
	}
	
	public static void hesapla(double x)
	{
		
		double sonuc=(3*x*x*x)+(2*x*x)-(7*x)+15;
	       
	       System.out.println("Sonuç:"+(sonuc));     
	}
}
