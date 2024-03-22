
public class App {

	
	public static void main(String[] args) {
		
		
		GreetingsGenerator greet= new GreetingsGenerator();
		System.out.println("target object before injecting dependent object =>"+ greet);
		
		java.util.Date date= new java.util.Date();
		System.out.println("dependent obj =>" + date);
		
		greet.setData(date);//setter injection
		
		System.out.println("target object after injecting dependent object =>"+ greet);

		String mesage=greet.generateGreeting("prashanth");
		System.out.println(mesage);
	}
}
