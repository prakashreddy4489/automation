package automation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class acttime {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver" , "C:\\drivers1\\chromedriver.exe");
	ChromeDriver c1=new ChromeDriver();
	c1.get("http://saikrishna-pc:81/login.do");
	c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	c1.findElement(By.name("username")).sendKeys("admin");
	c1.findElement(By.name("pwd")).sendKeys("manager"+Keys.ENTER);
	}
}
