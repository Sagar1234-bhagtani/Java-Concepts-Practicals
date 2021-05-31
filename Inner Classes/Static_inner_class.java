//Inner class-class inside class
                                         //EXAMPLE OF STATIC CLASS  
public class Static_inner_class {
	
	public static void main(String[] args) {
		//A b=new A();//we have to create object of class A as we have to call instance class b like we call instance variable
		A.B obj1=new A.B();   //when we are using static their is no need of Object.
		obj1.show();
	}

}

class A{
	int rollno;
	String sname;
	
static class B{
	public void show() {
		System.out.println("Hello");
	}
}
}
