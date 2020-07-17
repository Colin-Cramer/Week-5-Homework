
public class App {

	public static void main(String[] args) {

		Logger asteriskLogger1 = new AsteriskLogger();
		
		asteriskLogger1.log("Look at these asterisks!");
		asteriskLogger1.error("Now I want there to be a box of asterisks around me!");
		
		Logger spacedLogger1 = new SpacedLogger();
		spacedLogger1.log("I'm feeling spread out");
		spacedLogger1.error("UUUUHHHHHH OOOOHHHHHH!!!");
	}
}
