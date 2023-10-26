package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createaccount {

	public static void main(String[] args) {
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Account");
		
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Test");
		
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Testleaf");
		
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("1000");
		
		
		WebElement industryDD= driver.findElement(By.xpath("(//select[@class='inputBox'])[2]"));
		Select sec = new Select(industryDD);
		sec.selectByVisibleText("Computer Software");
		
		
		WebElement ownerDD=driver.findElement(By.xpath("(//select[@class='inputBox'])[3]"));
		Select sec2 = new Select(ownerDD);
		sec2.selectByVisibleText("S-Corporation");
		
		
		WebElement sourceDD= driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select sec3 = new Select(sourceDD);
		sec3.selectByValue("LEAD_EMPLOYEE");
		
        WebElement marketingDD= driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select sec4= new Select(marketingDD);
		sec4.selectByIndex(6);
		
		WebElement stateDD= driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select sec5= new Select(stateDD);
		sec5.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		
				
		
		
	}

}
