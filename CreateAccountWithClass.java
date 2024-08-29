package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	  driver.get("http://leaftaps.com/opentaps/.");
	  WebElement usernameFields =driver.findElement(By.id("username"));
		usernameFields.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	  driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("TestLeaaf");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        WebElement industry = driver.findElement(By.name("industryEnumId"));
        Select industryy = new Select(industry);
        industryy.selectByIndex(3);
        WebElement ownerShip = driver.findElement(By.name("ownershipEnumId"));
        Select ownerShipp = new Select(ownerShip);
        ownerShipp.selectByVisibleText("S-Corporation");
        WebElement source = driver.findElement(By.id("dataSourceId"));
        Select sourcee = new Select(source);
        sourcee.selectByValue("LEAD_EMPLOYEE");
        WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
        Select marketingg = new Select(marketing);
        marketingg.selectByIndex(6);
        WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
        Select statee = new Select(state);
        statee.selectByValue("TX");
        driver.findElement(By.className("smallSubmit")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String accountName =driver.findElement(By.id("ext-gen1221")).getText();
        System.out.println(accountName);
        
        
        
        
        

	}

}
