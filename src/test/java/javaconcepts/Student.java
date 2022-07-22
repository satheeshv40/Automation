package javaconcepts;

public class Student {
	
	int id;
	String name;
	static String college="test";
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	
	void display() {
		System.out.println(id +" "+ name+ " "+college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(1, "satheesh");
		s1.display();
	}

}
