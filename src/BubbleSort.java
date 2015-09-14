import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[]args){
		
		// Create an array with the length of the String Array of the cmd Arguments
		int[] args_array = new int[args.length];
		
		//v is the offset when an invalid element is discovered
		int v = 0;
		
		//Read the String array from the  Arguments
		for(int i = 0; i < args.length; i++) {
			//If the Argument is not a number return an error
			if(args[i].matches("\\d+")){
				//Put the string array elements into the int array 
				args_array[i-v] = Integer.parseInt(args[i]);
			}
			else{
				//The argument element is not a number and cannot be parsed into an integer array
				System.out.println(args[i] + " cannot be parsed into an integer.");	
				//Add 1 to v because the elements should be in a row
				v++;
			}			
        }	
		
		//Copy the content into a new array
		int[] array = Arrays.copyOf(args_array, args.length-v);
		
		//take the nth element and compare it with each element in the array
		//if the nth element is smaller than the mth element switch the position		
		
		//loop through the elements of the array
		for (int n=0;n<array.length;n++){
			for (int m=n+1;m<array.length;m++){
				//if the nth element is smaller than the mth element switch the position
				if(array[m] < array[n]){
					//store temporary the nth element
					int temp1 = array[n];
					//switch the elements
					array[n] = array[m];
					array[m] = temp1;
				}				
			}
		}
		
		//print the resulting array		
		System.out.println(Arrays.toString(array));		
		
		//version 1 
		//INPUT = hardcoded array
		//OUTPUT = sorted array
		
		//version 2
		//INPUT = array of Strings passed in in the command line
		//OUTPUT = sorted array of int (error if strings cannot be parsed into a integer)
		
		//version 3
		//INPUT = array of Strings passed in the command line
		//OUTPUT = sorted array of Strings (alphabetically)
		
		// improvements:
		// make the sorting algorithm as a separate function
		// use java.util.List instead of Arrays as container
		// initialize Lists using Guava instead of Java API
	}

}
