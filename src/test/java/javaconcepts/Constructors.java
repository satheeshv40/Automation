package javaconcepts;

import org.openqa.selenium.WebDriver;

public class Constructors {
	
	int id;
	String name;
	
	void dispaly() {
		System.out.println(id+" "+name);
	}
	
	Constructors(){
		System.out.println("constructors is invoked");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors c1= new Constructors();
		c1.dispaly();
	}

	/* Basecolor string array which can hold multiple parameter 
	 * String... parameters 
	 * but all the should be same type. eg)
	 * selectChoice(driver, "choice 1");
	 * selectChoice(driver, "choice 1","choice 2","choice 2 1","choice 2 2", "choice 2 3");
	 * selectChoice(driver, "all");
	 * selectChoice(WebDriver driver, String... values)
	 * 
	 * */
}
