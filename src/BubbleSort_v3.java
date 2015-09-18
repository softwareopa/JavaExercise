import java.util.Arrays;

public class BubbleSort_v3 {
	
	public static void main(String[]args){
		 
		//Bubble Sort the array
		bsort(args);
		
		//print the resulting array		
		System.out.println(Arrays.toString(args));		
			
		//version 3
		//INPUT = array of Strings passed in the command line
		//OUTPUT = sorted array of Strings (alphabetically)
		
		// improvements:
		// make the sorting algorithm as a separate function
		// use java.util.List instead of Arrays as container
		// initialize Lists using Guava instead of Java API
		
	}
	
	private static String[] bsort(String[] array) {
		// Sort a String Array with bubble sort
		//loop through the elements of the array
		for (int n=0;n<array.length-1;n++){
			for (int m=n+1;m<array.length;m++){
				//if the nth element is smaller than the mth element switch the position
				if(array[m].compareTo( array[n] ) < 0 ){
					//store temporary the nth element
					String temp1 = array[n];
					//switch the elements
					array[n] = array[m];
					array[m] = temp1;
				}				
			}
		}
		return (array);
	}
}

