package imooc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
   public WebDriver driver;
   public void initDriver() {
	   driver = new ChromeDriver();
	   driver.get("http://www.imooc.com");
	   driver.manage().window().maximize();
   }
   public void loginScript() throws InterruptedException {
	   driver.findElement(By.id("js-sign-btn")).click();
	   WebElement user = driver.findElement(By.name("email"));
	   user.isDisplayed();
	   WebElement pwd = driver.findElement(By.name("password"));
	   pwd.isDisplayed();
	   WebElement loginButton = driver.findElement(By.className("btn-red"));
	   loginButton.isDisplayed();
	   user.sendKeys("18600436416");
	   pwd.sendKeys("Chflyy1201");
	   loginButton.click();
	   Thread.sleep(3000);
	   WebElement header = driver.findElement(By.id("header-avator"));
	   header.isDisplayed();
	   Actions action = new Actions(driver);
	   action.moveToElement(header);
	   String userInfor = driver.findElement(By.id("name")).getText();
	   System.out.println(userInfor);
   }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Login login = new Login();
		login.initDriver();
		login.loginScript();
 
	}

}
