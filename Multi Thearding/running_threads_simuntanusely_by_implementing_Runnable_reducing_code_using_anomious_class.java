
public class running_threads_simuntanusely_by_implementing_Runnable_reducing_code_using_anomious_class {
public static void main(String[] args) {
	
	Runnable obj1=new Runnable(){          //Making Anomuos Class as only ones have to use class
		public void run(){
			for(int i=1;i<=5;i++) {
				System.out.println("Hi");
				try{Thread.sleep(500);}catch(Exception e) {}
	}
		}
	};
			
			
	Runnable obj2=new Runnable() {               //Making Anomuos Class as only ones have to use class
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println("Hello");
				try{Thread.sleep(500);}catch(Exception e) {}
			}
	}
		
	};
	
	Thread t1=new Thread(obj1);
	Thread t2=new Thread(obj2);
	
	
t1.start();
try{Thread.sleep(10);}catch(Exception e) {}//adding this so that scheduler get some difference can to choose objects and
t2.start();
}
}
