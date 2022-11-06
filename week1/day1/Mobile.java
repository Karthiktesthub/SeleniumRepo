package week1.day1;

public class Mobile {
	public void makeCall() {
		// code to print a text
	System.out.println("I am driving a car");	

	}
	
    public void sendMSG() {
		// code to print a text
    System.out.println("I am driving a bike");
	}
    
    public static void main(String[] args) {
    	//ClassName objectName = new ClassName();
    	Mobile myMobile = new Mobile();
    	
    	//call method using object
    	myMobile.makeCall();
    	myMobile.sendMSG();
		
	}
}
 