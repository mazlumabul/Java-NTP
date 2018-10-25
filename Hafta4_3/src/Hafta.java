import java.util.Scanner;
public class Hafta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		int sayi1=a.nextInt();
		int sayi2=a.nextInt();
		int enbuyuk=0;
		if(sayi1<sayi2)
		{
			enbuyuk=sayi2;
			sayi2=sayi1;
			sayi1=enbuyuk;
		}
		sayi2++;
		double toplam=0, carpim=1;
		for(int i=sayi2;sayi2<sayi1;i++)
		{
			if(i%3==0 && i%5==0)
			{
				toplam=toplam+i;
				carpim=carpim*i;
			}
			else if(i%3==0)
			{
				toplam=toplam+i;
			}
			else if(i%5==0)
			{
				carpim=carpim*i;
			}
			else
			{}
		}
		
		System.out.println("Toplamı:"+toplam);
		System.out.println("Carpim:"+carpim);
	}

}
