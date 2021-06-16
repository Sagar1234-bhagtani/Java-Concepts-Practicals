import java.util.Arrays;

public class using_binarysearch_and_sort_function {
	public static void main(String args[]) {
		int[] sagu= {4,3,7,9,2,12};
		
		
		Arrays.sort(sagu);
		
		for(int i=0;i<sagu.length;i++)
		System.out.print(" "+sagu[i]);
		int index=Arrays.binarySearch(sagu,9);
		System.out.println();
	System.out.println(index);
	}

}
