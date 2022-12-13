package array1;

public class maxminno {
public static void main(String[] args) {
	int a[]= {1,23,34,65,676};
	int max=a[0];
	int min=a[0];
	for(int i=0;i<a.length;i++) {
		if (a[i] > max)
			max = a[i];
		else if(a[i] < min)
			min = a[i];
	}
	System.out.println("maximum number is"+max);
	System.out.println("minimum number is "+min);
}
}
