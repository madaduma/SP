
public class Tabel extends Element {
	
private static String nume;
String titluTabel;
	public Tabel(String titluTabel,String nume) {
		super(nume);
		this.titluTabel=titluTabel;// TODO Auto-generated constructor stub
	}
	
	@Override
	void print() {
		System.out.println(titluTabel);
		
	}

}
