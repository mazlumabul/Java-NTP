// Klavyeden girilen N tane futbol klubunun 
// puaninin hesaplanmasi ve sampiyon olan kulubun
// belirlenmesi Uygulamasi
import java.util.Scanner;
public class Uygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
	    System.out.print("Takım Sayısı (N):");
	    int N=a.nextInt();
	    int puan=0;
	    int g=0,b=0,m=0;
	    int enbuyuk=-1; String sampiyon="";
	    
	    for(int i=0; i<N; i++)
	    {
	    	puan=0;
	    	System.out.print("Takim Adı:");
    	    String ad=a.next();
	    	
    	    System.out.print("Galibiyet Sayısı:");
    	    g=a.nextInt();    	    
    	    System.out.print("Beraberlik Sayısı:");
    	    b=a.nextInt();
    	    System.out.print("Malubiyet Sayısı:");
    	    m=a.nextInt();
    	    
    	    puan=PuanHesapla(b, g, m);
    	    
	    	if(puan>enbuyuk)
	    	{
	    		enbuyuk=puan;
	    		sampiyon=ad;
	    	}
	    	
	    	System.out.println(sampiyon+" Takımı :::: "+(enbuyuk)+ " puan" );
	    	
	    }
	    
	    System.out.println(sampiyon+" Takımı :::: "+(enbuyuk)+ " puanla Şampiyon" );
	        
	}
	
	public static int PuanHesapla(int b, int g, int m)
	{
		return  (g*3)+b;
	}

}
