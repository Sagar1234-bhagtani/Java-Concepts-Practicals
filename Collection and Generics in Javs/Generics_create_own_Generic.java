class Container<T>{    //here we can take any alphabet except E.
	T value;
	
	public void show() {
		System.out.println(value.getClass().getName());
	}
}
public class Generics_create_own_Generic {
	public static void main(String[] args) {
		
		Container<Integer> obj=new Container<>();
		obj.value=9;
		obj.show();
	}

}
