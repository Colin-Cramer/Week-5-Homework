
public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
	
		StringBuilder logBuilder = new StringBuilder();
		for(int i = 0; i < log.length(); i++) {
			if (i > 0) {
				logBuilder.append(" ");
			}
			logBuilder.append(log.charAt(i));
		}
		System.out.println(logBuilder.toString());
	}

	@Override
	public void error(String error) {

		StringBuilder errorBuilder = new StringBuilder();
		for(int i = 0; i < error.length(); i++) {
			if (i > 0) {
				errorBuilder.append(" ");
			}
			errorBuilder.append(error.charAt(i));
		}
		System.out.println("ERROR: " + errorBuilder.toString());
	}
}
