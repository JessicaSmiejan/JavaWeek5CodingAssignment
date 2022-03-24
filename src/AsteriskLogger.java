import java.util.Date;

public class AsteriskLogger implements Logger  {
	
	
			
			
			@Override
	public void info(String info) {
		Date date =  new Date();
		System.out.println(date.toString()+ " ***" + info + "***");
		
	}

	@Override
	public void error(String error) {
		
		System.out.println("********************");
		System.out.println("*** Error:" + error + "***");
		System.out.println("********************");
		
	}

}
