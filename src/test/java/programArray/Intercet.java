package programArray;

public class Intercet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int arr[] = { 1,3, 4, 5, 5, 7, 2 };        
        int arr1[] = { 5,20,17,1,38 };

        for(int i=0; i<arr.length;i++) {
        	for(int j=0; j<arr1.length;j++) {
        		if(arr[i]==arr1[j]) {
        			System.out.print(arr[i]+" ");
        		}
        	}
        }


	}

}
