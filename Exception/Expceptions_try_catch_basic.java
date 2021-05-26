
public class Expceptions_try_catch_basic {
	
	public static void main(String[] args) {
		int i,j,k=0;
		i=8;
		j=0;
		try {
		k=i/j;
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println(k);
		}

}
