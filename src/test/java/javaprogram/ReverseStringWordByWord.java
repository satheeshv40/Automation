package javaprogram;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value ="Everything is good";
		String[] texts= value.split(" ");
		System.out.println(texts.length);
		System.out.println(texts.toString());
		System.out.println(texts);
		for (String txt:texts) {
			System.out.println(txt);
		}
		
		String outputstring =""; 
		for (int i=texts.length-1;i>=0;i--) {
			outputstring= outputstring + texts[i]+" ";
		}
		
		System.out.println(outputstring);
		
		
	}

}
