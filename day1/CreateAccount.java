package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {


public static void main(String[] args) {
		
		//initialize the driver
		ChromeDriver driver=new ChromeDriver();
		//load the Url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the window
		driver.manage().window().maximize();
		//enter User name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement source = driver.findElement(By.name("industryEnumId"));	    
	    Select dd1 = new Select(source);
	    dd1.selectByVisibleText("Computer Software");
	    WebElement ownership = driver.findElement(By.name("ownershipEnumId"));	
	    Select own = new Select(ownership);
	    own.selectByVisibleText("S-Corporation");
	    WebElement datasource = driver.findElement(By.name("dataSourceId"));	
	    Select da = new Select(datasource);
        da.selectByIndex(4);
        WebElement marketing = driver.findElement(By.name("marketingCampaignId"));	
	    Select mark = new Select(marketing);
        mark.selectByIndex(6);
        WebElement general = driver.findElement(By.name("generalStateProvinceGeoId"));	
	    Select gen = new Select(general);
        gen.selectByIndex(50);
		
}

}
