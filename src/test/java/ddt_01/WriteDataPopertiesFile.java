package ddt_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataPopertiesFile {
  public static void main(String[] args) throws IOException {
	FileInputStream file=new FileInputStream("./src/test/resources/common.properties");
	Properties p=new Properties();
	p.load(file);
	
	p.put("user", "nitesh");
	
	FileOutputStream fil=new FileOutputStream("./src/test/resources/common.properties");
	p.store(fil, "user Modified");

}
}
