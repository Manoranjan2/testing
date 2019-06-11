package jenkin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void LoginTest() {
      driver.findElement(By.name("userName")).sendKeys("manzoor");
      driver.findElement(By.name("password")).sendKeys("manzoor");
      driver.findElement(By.name("login")).click();
      System.out.println("title after login is "+driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\MANORANJANDANDASENA\\Desktop\\chrome old version\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
  }

  @AfterTest
  public void afterTest() {
      driver.quit();
  }

}
