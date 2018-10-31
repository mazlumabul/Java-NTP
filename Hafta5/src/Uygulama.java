import java.util.Scanner;
public class Uygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner a=new Scanner(System.in);
     System.out.println("Birinci sayıyı girin:");
     int a1=a.nextInt();
     System.out.println("İkinci sayıyı girin:");
     int a2=a.nextInt();
     int temp=0;
     double toplam=0, carpim=1;
     
     if(a1>a2)
     {
    	 temp=a2;
    	 a2=a1;
    	 a1=temp;    	 
     }
     else {
    	 temp=a1;
    	 a1=a2;
    	 a2=temp; 
     }
     
     for(int i=a1;i<a2;i++) {
        if(i%3==0)
        {
        	toplam=toplam+i;
        }
        else if(i%5==0)
        {
        	carpim=carpim*i;
        }
        else if(i%5==0 && i%3==0)
        {
        	toplam=toplam+i;
        	carpim=carpim*i;
        }
        else {}
     }
     
     System.out.println("Toplamı:"+toplam);
     System.out.println("Çarpımı:"+carpim);
     
     
	}

}
