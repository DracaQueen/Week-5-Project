
public class App {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
		
		logger.Log("Hello");
		logger.Error("Bye");
		
		logger2.Log("Howdy");
		logger2.Error("Goodbye");

	}

}
