package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(), 'Leads')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(), 'Create')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("S");
		
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("cognizant");
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("dhanigai");
		
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("sachin");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Dhanu");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Automation tester");
		
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Learning automation");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("dhanigaisivakumar@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		driver.getTitle();
		
	    driver.findElement(By.xpath("//a[contains(text(), 'Duplicate')]")).click();
	    
	    driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).clear();
	    
	    driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("CTS");
	    
	    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).clear();
	    
	    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("sachin");
	    
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    
	    driver.getTitle();
}
}
