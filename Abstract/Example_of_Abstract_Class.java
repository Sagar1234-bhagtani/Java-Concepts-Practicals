public class Example_of_Abstract_Class
{
	public static void main(String[] args) {
		//Mahesh obj=new Mahesh();   We can not create object of Abstract class
		
		Ramesh r=new Ramesh();         //We have created object of Ramesh because it is not a Abstract class.
		r.cook();
		r.dance();
		r.move();
		r.call();
	}
}

 abstract class Mahesh{
	public void call() {               //In interface we can only declare function But in abstract we can declare and define function.
	System.out.println("Calling");
	}
	
	public abstract  void dance();//Abstract Methods
	public abstract void move();           //Mahesh dont know to define dance, move and cook.
	public abstract void cook();
}
 
 abstract class Suresh extends Mahesh{
		
		
		public void dance(){//Abstract Methods
			System.out.println("Dancing");
		}
		public abstract void move();               //Suresh dont know to define move and cook.
		public abstract void cook();
	}
 
 
 class Ramesh extends Suresh{
	 public void move() {
		 System.out.println("Moving");
	 }
	 public void cook() {
		 System.out.println("Cooking");
	 }
 }