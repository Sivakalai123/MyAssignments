package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {
	    public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//load url
		driver.get("https://www.facebook.com");
		//maximize the window
		driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.className("login")).click();

}
}

