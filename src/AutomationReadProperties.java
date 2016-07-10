import java.io.InputStream;
import java.util.Properties;


public class AutomationReadProperties {

	private static Properties configProp = new Properties();
	
	public AutomationReadProperties()
	{
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("Application.Properties");
		try{
			configProp.load(in);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}

	}
	public String getProperty(String key){
		return configProp.getProperty(key);
	}

}
