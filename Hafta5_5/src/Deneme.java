//Klavyeden girilen Fahreneit turunde hava sicakligini
// Dereceye ceviren, bu deger 23dereceden kucukse
// Oda ... derecedir ve ... derece isitilmalidir
// 23 derece ise suan oda sıcaklığı normaldir
// 23 dereceden buyukse 
//  Oda ... derecedir ve ... derece sogutulmalıdır
// Çıktısı veren program
import java.util.Scanner;
public class Deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
	    System.out.print("Hava Sıcaklıgı (oF):");
	    double sicaklik=a.nextDouble();
	    int tolerans=1;
	    
	    double santigrat=(sicaklik-32)/1.8;
	    
	    if(santigrat>23+tolerans)
	    {
	    	System.out.print("Hava sicaklıgı "+ santigrat +" oC ve "+ (santigrat-23)+ " derece soğutulmalı" );
			   
	    }
	    else if(santigrat<23+tolerans && santigrat>23-tolerans)
	    {
	    	System.out.print("Şuan oda sıcakligi normaldir" );
		        
	    }
	    else
	    {
	    	System.out.print("Hava sicaklıgı "+ santigrat +" oC ve "+ (23- santigrat)+ " derece ısıtılmalı" );
		}
	    
	}

}
