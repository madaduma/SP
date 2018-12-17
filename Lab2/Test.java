
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String []args)
	{
		Paragraf p = new Paragraf("Paragraf 1 ","paragraf");
		Tabel t = new Tabel("Tabelul","tabel");
		Paragraf p2 = new Paragraf("Paragraf 2","paragraf");
		Subcapitol s = new Subcapitol();
		s.addElement(p);
		s.addElement(t);
		s.addElement(p2);
		//System.out.println(p.text + t.titluTabel );
		s.print();
				
	}
}
