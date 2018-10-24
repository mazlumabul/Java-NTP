import java.util.*;
public class Matematik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		double sayi=a.nextDouble();
		System.out.println("Kosunüs bulma():"+Matematik.Kosinus(sayi));
		
			//System.out.print("ddd");
	}
	
	public static double YukariYuvarla(double a1)
	{
		return Math.ceil(a1);
	}
	
	public static double AsagiYuvarla(double a1)
	{
		return Math.floor(a1);
	}
	
	public static double Kosinus(double a1)
	{
		return Math.cos( Math.toRadians(a1));
	}

}
