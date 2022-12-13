package array1;

import java.util.Arrays;

public class sortingarray {
public static void main(String[] args) {
	int[] arr= {12,13,34,45};
	System.out.println(Arrays.toString(arr));
	int temp;
	for(int i=0;i<a.length-1;i++){
		 for(int j=0;j<a.length-1;j++){
		 if(a[j] > a[j+1]){
		 temp = a[j+1];
		 a[j+1] = a[j];
		 a[j]=temp;
		 }
		 }
		 }
		 System.out.println(Arrays.toString(arr));
}
}
