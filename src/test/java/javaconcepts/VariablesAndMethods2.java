package javaconcepts;

public class VariablesAndMethods2 {
	
	static int a =100; // static variable 
	int data=50; //Here data is variable  
	int data1=50; //Here data is variable  


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/** Local
		 *  Instance 
		 *  Static - Memory allocation will be done only once when the class is loaded in the memory
		 */
		VariablesAndMethods2 v = new VariablesAndMethods2();
		v.test1();
		int data = 10; // Instance variable
		System.out.println(data);
		System.out.println(a);
		// Compile time error Unable to access local variable in another method -- System.out.println(str);
		test2();
		System.out.println(data);
		System.out.println(v.data1);

	}
	
	public void test1() {
		
		String str = "New"; // Local Variable
		System.out.println(str);
		System.out.println(a);
		test2();
		System.out.println(data);
		System.out.println(data1);
	//	System.out.println(v.data1);

		// Compile time error  -- System.out.println(data);
	}
	
	public static void test2() {
		System.out.println("static Method");
		// System.out.println(v.data2);
		// test1();
	}

}
