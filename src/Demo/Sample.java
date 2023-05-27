package Demo;



public  interface Sample  {
	
    void box() ;
  	static final int a=90; 
  	default void b() {
  		System.out.println("  hello interface");
  	}
  	
    
}
class Demo implements Sample {

public void box() {
	System.out.println("supir");
}
public void cool() {
	System.out.println(" kovardhan  ");
}

}
abstract class Phonepay{
	abstract    void pay();
	Phonepay(){
		
	}
}