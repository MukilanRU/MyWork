package com.maven.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeClass {
	static WebDriver driver;
	public static void main(String[] args) {
		utilityMethod("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		IframeClass i = new IframeClass();
		i.iframeMethod();
	}
	
	public static void utilityMethod(String baseUrl) {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		sleepMethod(2000);
	}
	public static void sleepMethod(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void defaultMethod() {
		driver.findElement(By.xpath("//div[@class='e.g. information, success, attention, warning_msg closable']/following-sibling::a")).click();
	}
	public void iframeMethod() {
		//driver.findElement(By.id("iFrame")).click();
	
		WebElement element1 = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
		driver.switchTo().frame(element1);
		sleepMethod(2000);
		driver.findElement(By.xpath("//img[@alt='Selenium Online Training']")).click();
		sleepMethod(2000);

	}
}
