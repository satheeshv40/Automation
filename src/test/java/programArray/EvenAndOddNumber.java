package programArray;

public class EvenAndOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,6,7,8,29,2,5};
		
		int l=0;
		int r=arr.length-1;
		int c=0;
		
		while(l<r) {
			
			while(arr[l]%2!=0) {
				l++;
				c++;
			}
			
			while (arr[r]%2==0 && l<r) {
				r--;
			}
			
			if(l<r) {
				int temp =arr[l];
				arr[l]=arr[r];
				arr[r]=temp;
			}
			
			
			for (int a:arr) {
				System.out.print(a+" ");
			}
		}
		
	}

}
