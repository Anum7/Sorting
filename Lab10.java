import java.util.Arrays;

public class Lab10 {

	public static void main(String[] args) {
		int[]array = {1,5,67,0,200,-2};
		int[]list = {550,3,9,0};
		System.out.println(Arrays.toString(array));
		selectionSort(array);
		System.out.println(Arrays.toString(array));
		bubbleSort(list);
		System.out.println(Arrays.toString(list));
	}
	public static int[] selectionSort(int[]a){
		for(int i=0; i<a.length-1; i++){
			int min=i;
			for(int j=i+1; j< a.length; j++){
				if (a[j]< a[min]){
				min= j;	
				}
			}
			//swap(a,i,min);
			int temp= a[i];
			a[i]=a[min];
			a[min]= temp;
		}
		return a;
	}
	
	/* public static void swap(int[]a, int i, int min){
		int temp= a[i];
		a[i]=a[min];
		a[min]= temp;
	}*/

	public static void bubbleSort(int[]a){
		int l= a.length;
		int n=0;
		for(int i=0; i< l; i++){
			for(int j=1; j< (l-i); j++){
				if(a[j-1]> a[j]){
					n= a[j-1];
					a[j-1]=a[j];
					a[j]=n;
				}
			}
		}
	}
}
