
public class Enum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Whois.Gokhan.urlGoster());
		System.out.println(Whois.ISTE.urlGoster());
	}

}
enum Whois{
	
	//Gokhan, ISTE, AramaMotoru;
	Gokhan("www.gokhanaltan.com"),ISTE("www.iste.edu.tr"),AramaMotoru("www.google.com");
	
	private String url="";
	Whois(String url){
		this.url=url;
	}
	public String urlGoster() {
		return url;
	}
	
}
