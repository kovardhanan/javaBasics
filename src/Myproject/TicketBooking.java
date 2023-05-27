package Myproject;

import java.util.*;

public class TicketBooking {
      static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Bus> buss= new ArrayList();
		ArrayList<Booking> bi=new ArrayList();
		buss.add(new Bus(1,true,5));
		buss.add(new Bus(2,false,10));
		
		
		int no=1;
		while(no==1) {
			System.out.println(" Enter \"\" to continue the Bookiung & Exist for\"2\": ");
			no=sc.nextInt();
			if(no==1) {
				
				Booking b=new Booking();
			}
			
			
		}
		
		

	}

}
