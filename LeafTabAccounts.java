package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTabAccounts {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage()	.window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
       // driver.findElement(By.id("username));
		WebElement usernameFields =driver.findElement(By.id("username"));
		usernameFields.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kaviya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ragupathi");
		driver.findElement(By.name("generalProfTitle")).sendKeys("software engineer");
		driver.findElement(By.name("submitButton")).click();
		String title=driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
	System.out.println(title);
	driver.close();

		}

}
