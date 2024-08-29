package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistrstion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("firstname")).sendKeys("kaviya");
		driver.findElement(By.name("lastname")).sendKeys("tttvdjj");
		driver.findElement(By.name("reg_email__")).sendKeys("hudgfrjhu");
		driver.findElement(By.name("reg_passwd__")).sendKeys("hudgfrjhu");
		WebElement birthDate =driver.findElement(By.name("birthday_day"));
		Select birthDatee = new Select(birthDate);
		birthDatee.selectByIndex(3);
		WebElement birthMonth =driver.findElement(By.name("birthday_month"));
		Select birthMonthh = new Select(birthMonth);
		birthMonthh.selectByIndex(3);
		WebElement birthYear =driver.findElement(By.name("birthday_year"));
		Select birthYearr = new Select(birthYear);
		birthYearr.selectByValue("1994");
		WebElement genderFemale =driver.findElement(By.id("sex"));
		genderFemale.click();
		
	
		
		
		
		
		
		
		
		
		

	}

}
