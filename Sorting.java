import java.util.Arrays;

public class Sorting {
	public static void main(String [] args){
		int[] list = {45, 78, 2, 0, 100};
		System.out.println(Arrays.toString(list));
		insertionSort(list);
		System.out.println(binarySearch(60,list));
		
	}
	public static void insertionSort(int[]a){
		for(int i=1; i< a.length; i++){
			int x= a[i];
			int j= i-1;
			while((j>=0)&& (a[j]>x)){
				a[j+1]= a[j];
				j--;
			}
			a[j+1]=x;
			
		}
		System.out.println(Arrays.toString(a));
	}	
	
	public static int binarySearch(int n, int[]a){
		int low= 0;
		int high = a.length -1;
		
		while(low <= high){
			int mid = (low+ high)/ 2;
			if(n > a[mid]){
				low= mid+1;
			} else if (n < a[mid]){
				high= mid-1;
			} else {
				return mid;
			}
			
		}
	return -(low+1);
	}
	
	

}
