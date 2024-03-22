
public class app1 {

	
	public static void main(String[] args) {
		
		
		Amazon a = new Amazon();
		//fedex f = new Fedex(0;
		
		a.setService(new BlueDart());//setter injection
		//a.setService(new FirstFlight()); 
		//a.setService(new Fedex());
		
		boolean status=a.initiateDelivery(544.44);
		if(status) {
			System.out.println("order is delevered successfully");
		}
		else {
			System.out.println("failed to delever");
		}
		
	}
	
}
