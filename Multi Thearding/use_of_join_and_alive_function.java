


public class use_of_join_and_alive_function {
public static void main(String[] args)throws Exception
{
	
	
	
	
	Thread t1=new Thread(()->
	{                                   //Making Anomuos Class as only ones have to use class
		
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			try{Thread.sleep(500);}catch(Exception e) {}
}
	}
);
	
	Thread t2=new Thread(() ->
	{                                        //Making Anomuos Class as only ones have to use class
		
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try{Thread.sleep(500);}catch(Exception e) {}
		}

});
	
	
t1.start();
try{Thread.sleep(10);}catch(Exception e) {}//adding this so that scheduler get some difference can to choose objects and
t2.start();
//System.out.println(t1.isAlive());

t1.join();
t2.join();
//System.out.println(t1.isAlive());

System.out.println("Bye");
}
}
