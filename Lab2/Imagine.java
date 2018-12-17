
public class Imagine extends Element{
	
private static String nume;
String titluImagine;

	public Imagine(String titluImagine,String nume) {
		super(nume);
		this.titluImagine=titluImagine;// TODO Auto-generated constructor stub
	}
	
	
	@Override
	void print() {
		System.out.println(titluImagine);
		
	}

}
