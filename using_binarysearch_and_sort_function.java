import java.util.Arrays;

public class using_binarysearch_and_sort_function {
	public static void main(String args[]) {
		int[] sagu= {4,3,7,9,2,12};
		for(int i=0;i<sagu.length;i++)
			System.out.print(" "+sagu[i]);
		System.out.println();
		
		Arrays.sort(sagu);
		for(int i=0;i<sagu.length;i++)   //SORTING
		System.out.print(" "+sagu[i]);
		
		int index=Arrays.binarySearch(sagu,9);
		System.out.println();           //SEARCHING
	System.out.println(index);
	
	
	Arrays.fill(sagu,3);
	for(int i=0;i<sagu.length;i++)      //FILLING
		System.out.print(" "+sagu[i]);
	}

}
