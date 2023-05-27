package Myproject;


class Num extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println(i);
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} 
		}
	}
}
class Book extends Thread{
	int a=10;
	int b=5;
	            public void run() {
	            	
	            	
	            	for (int i=1;i<5;i++) {
	            		System.out.println("this is db");
	            		try {
		            		//int c=a/b;
		            		Thread.sleep(1000);
		            	}catch(Exception e) {
		            		System.out.println(" error");
		            	}
	            		
	            		
	            	}
	            	
	            	
	            	
	            	
	            }void fun(){
	                  int b=a/this.b;
	                  System.out.println(b);
	            }
	
	
}
public class MultiThead {
   public static void main(String[] args) throws InterruptedException {
      	Num n=new Num();
      	Thread h=n;
      	Thread j=new Book();
      	h.start();
      	if(h.isAlive()) {
      		System.out.println(" is still");
      	}
      	
      	j.start();
        Book book = new Book();
        book.fun();
      	
	}
}
