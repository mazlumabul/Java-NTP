//Klanyeden girilen N sayisinin 
//1 uzeri 1+ 2 uzeri 2+ 3 uzeri 3+....+N uzeri N
//degerini bulup sonucu ekrana yazan prg
import java.util.Scanner;
public class Uygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner a=new Scanner(System.in);
	     System.out.println("Birinci sayıyı girin:");
	     int N=a.nextInt();
	     double toplam=0;
	     
	     for(int i=1;i<=N;i++) {
	    	 toplam=toplam+Math.pow(i, i);
	     }
	     
	     System.out.println("Toplamı:"+toplam);
	}

}
