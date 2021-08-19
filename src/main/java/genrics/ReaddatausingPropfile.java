package genrics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReaddatausingPropfile {
	public String  read(String key) throws FileNotFoundException, IOException
	{
		Properties prop=new Properties();
		prop.load(new FileInputStream(Autoconstants.propertyfilepath));
		return prop.getProperty(key);
	}

}
