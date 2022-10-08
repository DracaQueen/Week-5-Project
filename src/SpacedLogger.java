
public class SpacedLogger implements Logger {
	

	@Override
	public void Log(String hello) {
		System.out.println(hello.replace("", " ").trim());
		
	}

	@Override
	public void Error(String error) {
		System.out.println("ERROR:" + error.replace("", " ").trim());
		
	}


}
