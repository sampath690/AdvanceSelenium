package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *This class contains reusable methods related to actions performed on properties  
 * @author sai ram
 *
 *
 */

public class PropertiesFileUtility {
	private Properties property;
	/**
	 * THis method is used to initialize properties file
	 * @param path
	 */
      public void propertiesFileInitialization(String path) {
    	  FileInputStream file=null;
    	  try {
    		  file=new FileInputStream(path);
    	  } catch(FileNotFoundException e) {
    		  e.printStackTrace();
    	  }
    	  property =new Properties();
    	  try {
    		  property.load(file);
    	  } catch(IOException e) {
    		 e.printStackTrace();
    	  }
      }
      /**
       * This method is used to fetch the data from properties file 
       * @param key
       * @return
       */
      public String fetchPropert(String key) {
    	  return property.getProperty(key);
      }
	   /**
	    * This method is used to modify properties file 
	    * @param key
	    * @param value
	    * @param path
	    * @param message
	    */
      public void modifyPropertiesFile(String key, String value, String path, String message) {
    	  property.put(key,value);
    	  FileOutputStream fos=null;
    	  try {
    		  fos=new FileOutputStream(path);
    	  } catch(FileNotFoundException e) {
    		  e.printStackTrace();
    	  }
    	  try {
    		  property.store(fos, message);
    	  }catch(IOException e) {
    		  e.printStackTrace();
    	  }
      }
	}

