package Myproject;

public class Bus {
     int busno;
    boolean Ac;
     int capacity;
    public Bus(int no,boolean b,int cap) {
		busno=no;
		Ac=b;
		capacity=cap;
		
	}
     public int getBusno() {
		return busno;
	}
     public void setBusno(int busno) {
		this.busno = busno;
	}
    public boolean isAc() {
		return Ac;
	}
    public void setAc(boolean ac) {
		Ac = ac;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
  public void BusDetil() {
	  System.out.println(" bus no:"+busno+"\n"+"Type Ac/non Ac :"+Ac+"\n"+"Capacity of the bus: "+capacity);
  }
	

}
