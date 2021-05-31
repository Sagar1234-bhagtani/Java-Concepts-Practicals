//Inner class-class inside class
                                         //EXAMPLE OF ANONYMOUS CLASS  
public class anonymous_class_using_Lamda_2 {
	
	public static void main(String[] args) {
		B obj=()->System.out.println("Sagar Bhagtani");   //It's a beauty of lamda we can reduce lines.
		
		 obj.show();                                                     //2-we cannot implement interface  
}
}
interface B{
	public void show(); 
}
