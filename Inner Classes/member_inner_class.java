//Inner class-class inside class
                                         //EXAMPLE OF OF MEMBER CLASS(NON-STATIC CLASS)
public class member_inner_class {
	
	public static void main(String[] args) {
		A b=new A();//we have to create object of class A as we have to call instance class b like we call instance variable
		A.B obj1=b.new B();
		obj1.show();
	}

}

class A{
	int rollno;
	String sname;
	


class B{
	public void show() {
		System.out.println("Hello");
	}
}
}
