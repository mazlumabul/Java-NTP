//Menu uygulamasi: alisveris ve toplamini buldurma
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
	    int secim=0; 
	    int secim1=0;
	    double sepet=0;
	    
	    while(1<2)
	    {
	    	if(secim==3)
	    	{break;}
	    	System.out.println(" (1) Bilgisayarlar \n (2) Telefonlar \n (3) Alışverişi Bitir");
		    secim=a.nextInt();
	    	switch(secim)
			{
			case 1: 
				System.out.println(" (1) ASUS ROG (5000TL) \n (2) MSI F35 (5500TL) \n (3) Anamenü");
				secim1=a.nextInt();
				switch(secim1)
				{
					case 1:	sepet+=5000; break;
					case 2:	sepet+=5500; break;
					default: break;
				}
				break;
			case 2: 
				System.out.println(" (1) Iphone X (2000TL) \n (2) Casper Via X (2200TL) \n (3) Anamenü");
				secim1=a.nextInt();
				switch(secim1)
				{
					case 1:	sepet+=2000; break;
					case 2:	sepet+=2200; break;
					default: break;
				}
				break;
			case 3: 
				System.out.println("Sepet Toplamınız:"+sepet + " TL");
				break;
				default:
					System.out.println("Tanımlı bir tuşa basılmadı");
				break;
			}
	    }
	    
	    
	    
	}

}
