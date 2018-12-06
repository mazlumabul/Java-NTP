
public class GarbageCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int y=0;y<10;y++) {
			Uret a=new Uret(y);
		}
		//Garbage collector calistir
		System.gc();
		
		for(int y=10;y<20;y++) {
			Uret a=new Uret(y);
		}
       
	}

}

class Uret{
	int i=0;
	Uret(int y){
		this.i=y;
		System.out.println("Object olusturuldu:"+(i+1));
	}
	public void finalize(){
		//Nesne silinirken yapilacak islemler
		System.out.println("Object silindi:"+(i+1));
	}
}
