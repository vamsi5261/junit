package junit5;

import java.util.Arrays;

public class timeout {
   public int[] array(int[] arr) {
	   int arr1[]= {};
	   for(int i=0; i<10000; i++) {
		  Arrays.sort(arr1);
	   } return arr1;
   }
}
