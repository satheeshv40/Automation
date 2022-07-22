package javaconcepts;

public class Static {
	
	/** this and super cannot be used and unable to call non static method and variable in static method directly */

	  static{System.out.println("static block is invoked");}  

	int rollnum;
	String name = "abc";
	static String college = "IFE";
	
	 void change() { name="abc1"; }
	

	static void change1() {
		college = "I1";
	}

	Static(int rollnum, String name) {
		this.rollnum = rollnum;
		this.name = name;

	}

	void display() {
		System.out.println(rollnum + name + college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		change1();
		
		Static s1 = new Static(10, "satheesh");
		s1.change();
		s1.display();
		
	}

}
