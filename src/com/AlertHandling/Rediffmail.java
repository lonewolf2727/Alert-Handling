package com.AlertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rediffmail {
	@Test
	
	public void rediff() throws Exception{
		System.setProperty("webdriver.chrome.driver", ".\\Chrome Driver jars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct alert message");
		}else {
			System.out.println("in-correct alert message.");
		}
		alert.accept();
		Thread.sleep(3000);
		driver.quit();
	}

}
