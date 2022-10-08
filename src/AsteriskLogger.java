
public class AsteriskLogger implements Logger {

	@Override
	public void Log(String hello) {
		System.out.println("***" + hello + "***");
		
	}

	@Override
	public void Error(String error) {
		System.out.println("******************");
		System.out.println("***ERROR: " + error + "***");
		System.out.println("******************");
	}


}
