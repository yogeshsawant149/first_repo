package array1;

public class Reversearray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		for (int i = 0; i < arr.length / 2; i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
	}
	}
	}
		
	/*	System.out.println("Orignal String :"+arr);
	}
		for(int i=arr.length-1-i;i>=0;i--) 
			
			int rev = rev+arr.length;
			
			System.out.println("Reverse String :"+rev);

	}

	}
}
*/
	