package ddt_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Properties_ddt {
public static void main(String[] args) throws IOException {
	FileInputStream file=new FileInputStream("./src/test/resources/common.properties");
	Properties p=new Properties();
	p.load(file);
	String url=p.getProperty("url");
	long timee = Long.parseLong(p.getProperty("time"));
	System.out.println(url+"\n"+timee);
}
}
