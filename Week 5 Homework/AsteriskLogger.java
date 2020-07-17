
public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		
		String asterisk = "*";
		System.out.println("*************" + asterisk.repeat(error.length()));
		System.out.println("***Error: " + error + "***");
		System.out.println("*************" + asterisk.repeat(error.length()));
	}
}
