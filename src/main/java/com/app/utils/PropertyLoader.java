package com.app.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ResourceBundle;

/**
 * Created by Oscar Garcia on 8/2/2016.
 */
public class PropertyLoader {
    private final static Logger logger = LoggerFactory.getLogger(PropertyLoader.class);



    public PropertyLoader() {}


	public String loadProperty(String property) {
		ResourceBundle _prop = null;
		String value=null;
		try{
			_prop = ResourceBundle.getBundle("SWAFT");
			value = _prop.getString(property);

		}catch(Exception e){
			System.out.println("Error retrieving properties file: "+ e);
		}
		return value;
	}

    /*
    public static String loadProperty(String name) {
        Properties props = new Properties();
        try {
            InputStream ins = PropertyLoader.class.getResourceAsStream("./WAF.properties");
            props.load(ins);
        } catch (IOException e) {
            e.printStackTrace();
            logger.info("Error when reading the properties file. Details: "+e.getStackTrace());
        } catch (Exception ex){
            logger.info("Error when reading the properties file. Details: "+ex.getStackTrace());
        }
        String value="";
        if (name != null) {
            value =props.getProperty(name);
        }

        return value;
    }*/


}


