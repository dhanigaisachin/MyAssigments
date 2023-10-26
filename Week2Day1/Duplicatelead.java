package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Duplicatelead {

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
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("visai labs");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("sachin");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Dingra");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("sachu");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Direction");
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("screenplay writer");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("sachin@gmail.com");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		driver.getTitle();
		
		driver.findElement(By.xpath("//a[contains(text(), 'Duplicate Lead')]")).click();
		
		 driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).clear();
		    
		    driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("freshworks");
		    
		    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).clear();
		    
		    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("sachu");
		    
		    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		    
		    driver.getTitle();
		
		

	}

}
