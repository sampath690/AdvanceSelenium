package genericLibrariesImplimentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import genericLibraries.ExcelUtility;
import genericLibraries.IConstantPath;
import genericLibraries.PropertiesFileUtility;
import genericLibraries.WebDriverUtility;

public class CreateOrganization {
public static void main(String[] args) throws InterruptedException {
	  PropertiesFileUtility property=new PropertiesFileUtility();
	  ExcelUtility excel=new ExcelUtility();
	  WebDriverUtility web=new WebDriverUtility();
	  
	  property.propertiesFileInitialization(IConstantPath.PROPERTYFILEPATH);
	  excel.excelInitialization(IConstantPath.EXCELFILEPATH);
	  long time = Long.parseLong(property.fetchPropert("timeouts"));
	  WebDriver driver = web.openApplication(property.fetchPropert("browser"), property.fetchPropert("url"),time);
//    WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		Thread.sleep(2000);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("sampath@690");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("yass");
		driver.findElement(By.name("assigntype")).click();
		driver.findElement(By.name("button")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
}
}
