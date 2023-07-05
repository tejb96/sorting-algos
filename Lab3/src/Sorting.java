import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	
	static void selectionSort(int [] a) {
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
	
	static int partition(int[] a, int first, int last) {
		int pivot =a[last];
		int i =first-1;
		for(int j=first;j<last;j++) {
			if(a[j]<pivot) {
				i++;
				int temp =a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp1=a[i+1];
		a[i+1]=a[last];
		a[last]=temp1;
		return(i+1);
	}
	
	static void quickSort(int[] a, int first, int last) {
		if(first<last) {
			int p=partition(a, first,last);
			quickSort(a,first,p-1);
			quickSort(a,p+1,last);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] a={23,45,12,5,3,67,90,33,25,1};
//		selectionSort(a);
//		System.out.println(Arrays.toString(a));
//		quickSort(a,0,a.length-1);
//		System.out.println(Arrays.toString(a));
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int aSize=scanner.nextInt();
		
		int[] a = new int[aSize];
		System.out.println('\n'+"Enter the elements of the array: ");
		
		for(int i =0; i<aSize;i++) {
			a[i]=scanner.nextInt();
		}
		
		System.out.println('\n'+"The elements of the array are: "+'\n'+Arrays.toString(a).replace("[", " ").replace("]", " ").replace(",", ""));
		selectionSort(a);
		System.out.println('\n'+"Sorted Array (Selection Sort - Descending Order): "+ Arrays.toString(a));
		quickSort(a, 0, a.length-1);
		System.out.println('\n'+"Sorted Array (Quick Sort - Ascending Order): "+ Arrays.toString(a));
	}

}
