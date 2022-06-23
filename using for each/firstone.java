import java.util.ArrayList;
import java.util.List;

public class firstone {

	public static void main(String[] args) {

		List<Person> list=new ArrayList<Person>();
		list.add(new Person("sagar",45));
		list.add(new Person("Akshat",25));
		list.add(new Person("Vivek",23));
		list.add(new Person("Mohit",12));

//without  lamda
//		
//		for(Person person:list) {
//			System.out.println(person.getName());
//			System.out.println(person.getAge());
//		} 
		
		
//With lamda Expression
		
		list.forEach((person)->{
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


