
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String []args) throws Exception
	{
		Paragraf p = new Paragraf("Paragraf 1 ");
		p.setAlign(new LeftAlign());
		Tabel t = new Tabel("Tabelul");
		//t.addEleent(null);
		Paragraf p2 = new Paragraf("Paragraf 2");
		p2.setAlign(new CenterAlign());
		Subcapitol s = new Subcapitol();
		s.addElement(p);
		s.addElement(t);
		s.addElement(p2);
		//System.out.println(p.text + t.titluTabel );
		s.print();
				
	}
}
