import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Expceptions_try_catch_IOException {
	
	public static void main(String[] args) {
		int i,j=1,k=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		i=8;
		
		try {
		
		j=Integer.parseInt(br.readLine());
		
		k=i/j;
		
			}
		catch(IOException e) {
			System.out.println("Some IO Error");
		}
		catch(ArithmeticException e){
			System.out.println("Can't Divide by Zero"+e);
		}
		
		
		catch(Exception e) {
			System.out.println("Unknown Exception");
		}
		
		System.out.println(k);
		}

}
