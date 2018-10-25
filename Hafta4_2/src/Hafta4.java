
public class Hafta4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5, b=7, c=12;
		if(a<b && b>c) {
			System.out.println("Ve yapısı her ikisi de sağlanmalı");			
		}
		if(a<b || b>c) {
			System.out.println("Veya yapısı ikisinden herhangi biri");			
		}
		for(int i=0; i<50;i++)
		{
			System.out.println((i+1)+"Döngü");			
			
		}		
		for(int i=0; i<50;i=i+5)
		{
			System.out.println((i+1)+"Döngü");			
			
		}

	}

}
