import java.util.Scanner;

public class Bas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
       
	       System.out.print("r1 degerini gir:");
	       double r1=a.nextDouble();       
	       System.out.print("r2 degerini gir:");
	       double r2=a.nextDouble(); 
	       
	       System.out.print("Sonuc:"+ Bas.Hesapla(r1, r2));
	       
	}
	
	
	public static double Hesapla(double a,double b)
	{
		return 3.14*((a*a)-(b*b));
	}

}
