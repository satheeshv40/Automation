package javaconcepts;

public class ThisA {

	void m(){
	System.out.println("m");	
	this.n(); /* Both are same */
	n();
	}
	
	void n(){
		System.out.println("n");
	}
	
}
