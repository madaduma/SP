
public class Paragraf extends Element {
	
private static String nume;
String text;

	public Paragraf(String text,String nume) {
		super(nume);
		this.text=text;// TODO Auto-generated constructor stub
	}
	
	@Override
	void print() {
		System.out.println(text);
		
	}

}
