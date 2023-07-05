import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	
	void selectionSort(int [] a) {
		for(int i=0;i<a.length-1;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[min]) {min=j;}
			}
			int temp = a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={23,45,12,5,3,67,90,33,25,1};
		selectionSort(a);
		
		System.out.println(Arrays.toString(a));
	}

}
