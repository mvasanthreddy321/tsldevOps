package Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class App {
	
	public boolean userLogin(String userName,String password) {
		Properties prop=new Properties();
		try {
			prop.load(new FileInputStream ("src/main/resources/credientials.property"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String un=prop.getProperty("user");
		String pwd=prop.getProperty("password");
		if(userName.equals(un) && password.equals(pwd))
		{
			return true;
		}
		else
			return false;
	}

}
