//Inner class-class inside class
                                         //EXAMPLE OF ANONYMOUS CLASS  
public class using_interface_without_class_or_anonymous_class {
	
	public static void main(String[] args) {
		B obj= new B(){  //What to do if dont want to print Hello in class B? 1- use over riding concept
			public void show() {                       //We don't have name of class i.e called anonymous class
				System.out.println("Sagar Bhagtani");
		
		}                                                         //2-we cannot implement interface   
	};
	obj.show();

}
}

 interface B{
	public void show(); 
}
