import java.util.ArrayList;
import java.util.List;

public class Generics_Basic {
	public static void main(String[] args) {
		int value=5;
		
		List<Integer> values=new ArrayList<Integer>();
		values.add(7);
		values.add(6);
		//values.add("sagar"); it will give error as we have mentioned generic as Integer.
		
		System.out.println(values);
	}

}
