class Hi extends Thread                  //here threads are running prallelly
{
	public void run(){
	for(int i=1;i<=5;i++) {
		System.out.println("Hi");
		try{Thread.sleep(500);}catch(Exception e) {}
	}
	}
	
}
class Hello extends Thread{
	public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println("Hello");
		try{Thread.sleep(500);}catch(Exception e) {}
	}
	}
	
}
public class running_threads_simuntanusely {
public static void main(String[] args) {
	Hi obj1=new Hi();
	Hello obj2=new Hello();
	
obj1.start();
try{Thread.sleep(10);}catch(Exception e) {}//adding this so that scheduler get some difference can to choose objects and
obj2.start();
}
}
