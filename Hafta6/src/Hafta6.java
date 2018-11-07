//Switch - case
import java.util.Scanner;
public class Hafta6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
	    System.out.print("(1-3) arasında bir seçim yapınız:");
	    
		int secim= a.nextInt();
		switch(secim)
		{
		case 1: 
			System.out.println("1 e basildi");
			break;
		case 2: 
			System.out.println("2 e basildi");
			break;
		case 3: 
			System.out.println("3 e basildi");
			break;
			default:
				System.out.println("Tanımlı bir tuşa basılmadı");
			break;
		}
	}

}
