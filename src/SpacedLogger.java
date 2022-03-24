import java.util.Date;

public class SpacedLogger implements Logger {

	@Override
	public void info(String info) {
		System.out.println(info.replaceAll(".(?=.)", "$0 "));
			
	}

	@Override
	public void error(String error) {
		System.out.println("Error: " + error.replaceAll(".(?=.)", "$0 "));
		
	}

}
