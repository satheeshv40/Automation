package programArray;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {4,4,1,2,6};
        int arr[] = { 1,3, 4, 5, 5, 7, 2 };
        int size = arr.length;
		
        
       
        
		for(int i=0;i<size;i++) {
			int abs =Math.abs(arr[i]);
			if(arr[abs-1]>0) {
				arr[abs-1]=-arr[abs-1];
				
			}else
				System.out.println(abs);
		}
		
		for (int i = 0; i < size; i++) {
	        if (arr[i] > 0)
	            System.out.println(i + 1);
	    }

		System.out.println(arr.toString());
		
	}

}
