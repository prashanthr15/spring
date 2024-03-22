import java.util.Date;
//target class
public class GreetingsGenerator {

	private Date date;
	
	public GreetingsGenerator() {
		
		System.out.println("greeting generator is instantiated");
	}
	
	public void setData(Date date) {
		this.date=date;
	}
	
	//business logic
	public String generateGreeting(String name) {
		
		int hour = date.getHours();//get the hours in 24 hour format
		
		if(hour<12) {
			
			return "good morning " + name;
		}
		else if(hour<16) {
			
			return "good afternoon " + name;
		}
		
		else if(hour<20) {
			
			return "good evening " + name;
		}
		else {
			
			return "good night " + name;
		}
		
		
		
	}

	@Override
	public String toString() {
		return "GreetingsGenerator [date=" + date + "]";
	}
	
	
}
