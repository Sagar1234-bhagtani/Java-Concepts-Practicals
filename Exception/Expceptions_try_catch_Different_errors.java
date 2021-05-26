
public class Expceptions_try_catch_Different_errors {
	
	public static void main(String[] args) {
		int i,j,k=0;
		int a[]=new int[4];
		i=8;
		j=0;
		try {
		//k=i/j;
		for(int c=0;c<=4;c++)//as 5 values it has to hold so we are getting arraybound Error
		{
			a[c]=c+1;
		}
			}
		catch(ArithmeticException e){
			System.out.println("Can't Divide by Zero"+e);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Maximun number of values should be 4");//Means we can have more than one catch with one Try
		}
		
		System.out.println(k);
		}

}
