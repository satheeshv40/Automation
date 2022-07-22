package javaconcepts;

public class ParamConstructors {
	
	int id;
	String name;
	String collegeName;
	
	void dispaly() {
		System.out.println(id+" "+name+" "+collegeName );
	}
	
	ParamConstructors(int id, String name){
		System.out.println("constructors is invoked");
		this.id=id;
		this.name=name;
	}
	
	ParamConstructors(int id, String name, String collegeName){
		System.out.println("constructors is invoked");
		this.id=id;
		this.name=name;
		this.collegeName=collegeName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParamConstructors c1= new ParamConstructors(10,"satheesh");
		ParamConstructors c2= new ParamConstructors(10,"satheesh","HCL");
c2.dispaly();
		c1.dispaly();
	}

}
