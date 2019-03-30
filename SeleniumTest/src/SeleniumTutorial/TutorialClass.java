package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TutorialClass {

	public static void main(String[] args) throws InterruptedException {
	
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\FARHANA\\Desktop\\NewWorkspace\\SeleniumTest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.xpr2t.com/Webobjects.html");
		Thread.sleep(3000);
		driver.findElement(By.id("usernameid")).sendKeys("TestName");
		//Thread.sleep(3000);
		//String str=driver.findElement(By.id("usernameid")).getText();
		//System.out.println("THe string is "+str);
		driver.findElement(By.name("radiobutton1")).click();
		driver.findElement(By.name("checkthebox")).click();
		//driver.findElement(By.id("test")).click();
		Select drpdwn=new Select(driver.findElement(By.id("test")));
		drpdwn.selectByVisibleText("Blue");
		Select drpdwn2=new Select(driver.findElement(By.name("dropdown")));
		drpdwn2.selectByVisibleText("Audi");
		drpdwn2.selectByVisibleText("Honda CRV");
		driver.findElement(By.xpath("/html/body/table[6]/tbody/tr[2]/td[2]/input")).click();
		driver.findElement(By.linkText("1.Yahoo")).click();
		driver.navigate().back();
		
		//String s=driver.switchTo().alert().accept().getText();
		
		driver.close();
		driver.quit();
	}

}
