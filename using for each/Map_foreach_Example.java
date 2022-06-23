
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_foreach_Example{

	public static void main(String[] args) {

	Map<Integer,Person> map=new HashMap<Integer,Person>();
	
	map.put(45,new Person("ganguli",23));
	map.put(32,new Person("Madhuri",34));
	map.put(112,new Person("Rekha",66));
	map.put(65,new Person("kishori",87));
	
	
	
//With using Lamda
	for(Entry<Integer,Person> entry:map.entrySet()) {
		
System.out.println(entry.getKey());
System.out.println(entry.getValue().getName());
System.out.println(entry.getValue().getAge());
	}
	
	
	
	//Iterating map using forEach(Easiest Approch) using Lamda
	map.forEach((k,v)->{
		System.out.println(k);
		System.out.println(v.getName());
		System.out.println(v.getAge());
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


