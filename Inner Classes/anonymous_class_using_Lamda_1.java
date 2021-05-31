//Inner class-class inside class
                                         //EXAMPLE OF ANONYMOUS CLASS  
public class anonymous_class_using_Lamda_1 {
	
	public static void main(String[] args) {
		B obj=()-> {                       //We don't have name of class i.e called anonymous class
				System.out.println("Sagar Bhagtani");
		
		                                                       //2-we cannot implement interface   
	};
	obj.show();

}
}

 interface B{
	public void show(); 
}
