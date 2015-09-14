import java.util.Arrays;

public class BubbleSort_v3 {
	
	public static void main(String[]args){
		 
		// Create an array with the length of the String Array of the cmd Arguments		
		String[] args_array = new String[args.length];
		
		//Read the String array from the Arguments
		for(int i = 0; i < args.length; i++) {
			//Put the string array elements into the int array 
			args_array[i] = args[i];
				
        }	
		
		//Copy the content into a new array
		String[] array = Arrays.copyOf(args, args.length);
		
		//take the nth element and compare it with each element in the array
		//if the nth element is smaller than the mth element switch the position		
		
		//Bubble Sort the array
		bsort(array);
		
		//print the resulting array		
		System.out.println(Arrays.toString(array));		
			
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
		for (int n=0;n<array.length;n++){
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

