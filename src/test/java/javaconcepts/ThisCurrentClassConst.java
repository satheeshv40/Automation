package javaconcepts;

public class ThisCurrentClassConst {
	
	ThisCurrentClassConst(int A){
		this();
		System.out.println(A);
	}
	
	
	 ThisCurrentClassConst() {
		// TODO Auto-generated constructor stub
		 System.out.println("hello");
	}


	public static void main(String[] args) {
		System.out.println("123");
		ThisCurrentClassConst A = new ThisCurrentClassConst(10);
		
	}

	
	
}
