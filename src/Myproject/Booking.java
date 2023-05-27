package Myproject;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
	String name;
    int Busnum;
    SimpleDateFormat date;
    
    public Booking() {
    	Scanner sn=new Scanner(System.in);
    	System.out.println("Enter the name of Pasenger: ");
		name=sn.next();
		System.out.println("Enter the bus No: ");
		Busnum=sn.nextInt();
		System.out.println("Enter the date formate \"dd-MM-YYYY\"");
		String dateno=sn.next();
		SimpleDateFormat form=new SimpleDateFormat(dateno);
		date=form;
		}
     

}
