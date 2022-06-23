import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_foreach_Example{

	public static void main(String[] args) {

		Set<Person> set=new HashSet<Person>();
		set.add(new Person("sagar",45));
		set.add(new Person("Akshat",25));
		set.add(new Person("Vivek",23));
		set.add(new Person("Mohit",12));

		//without  lamda

		for(Person person:set) {
			System.out.println(person.getName());
			System.out.println(person.getAge());
		} 


		//With lamda Expression

		set.forEach((person)->{
			System.out.println(person.getName());
			System.out.println(person.getAge());
		});
		
	
		
		//using stream with for each
		set.stream().forEach((person)->{
			System.out.println(person.getName());
			System.out.println(person.getAge());
		});


	}
} 

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}


