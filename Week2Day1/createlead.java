package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createlead {
	
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
		
		WebElement sourceDD= driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		
	
		Select sec = new Select(sourceDD);
		
		sec.selectByVisibleText("Employee");
		
		WebElement marketingDD= driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		
		Select sec1= new Select(marketingDD);
		
		sec1.selectByValue("9001");
		
		WebElement ownerDD=driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		Select sec2 = new Select(ownerDD);
		sec2.selectByIndex(5);
		
		
		WebElement countryDD= driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']"));
		Select sec3= new Select(countryDD);
		sec3.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		
		System.out.println("Company name is:" + "cognizant");
	
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
