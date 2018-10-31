//Klavyeden girilen N öğrenci için
// M tane notun ortalamasını buldurup
//Dersten geçip kaldığına karar veren prg
import java.util.Scanner;
public class NotHesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
	    System.out.print("Öğrenci Sayısı (N):");
	    int N=a.nextInt();
	    System.out.print("Not Sayısı (M):");
	    int M=a.nextInt();
	    double ort=0;
	    int notum=0;
	    
	    for(int i=0; i<N; i++)
	    {
	    	ort=0;
	    	System.out.print("Öğrenci Adı:");
    	    String ad=a.next();
	    	for(int j=0; j<M; j++)
	    	{	
	    	    System.out.print((j+1)+". Not:");
	    	    notum=a.nextInt();
	    	    ort=ort+notum;	    	    
	    	}
	    	
	    	if((ort/M)<60)
	    	{
	    		System.out.println(ad+" "+(ort/M)+ " Ortalama ile kaldı");
	    	}
	    	else
	    	{
	    		System.out.println(ad+" "+(ort/M)+ " Ortalama ile Geçti");
	    	}
	    	
	    }
	    
	}
	
	

}
