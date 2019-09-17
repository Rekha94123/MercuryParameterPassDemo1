package parameterTestng;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MercuryTsTest 
{
	public WebDriver driver;
	 @Parameters ({"username1","password1"})
	 @Test(priority=1,groups={"Smoke"},description="Verify that User1 able to login into Mercury Tours Application by using valid username and password")
  public void loginwithValiduser1ds(String usernm1,String passwd1) 
  {

	 
		  System.out.println("------------------------- loginwithValiduser1ds method under Test---------------------------------------");
		  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(usernm1);
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passwd1);
		  driver.findElement(By.xpath("//input[@name='login']")).click();
		  System.out.println("User1 has login into Mercury Tours Application successfully");
		  boolean flag1=driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
		  System.out.println("Flight Finder image is displayed: " +flag1);
		  driver.findElement(By.linkText("SIGN-OFF")).click();
		  System.out.println("User1 has logged out from Mercury Tours Application successfully");
		  
		  
	  }

	 @Parameters ({"username2","password2"})
	 @Test(priority=2,description="Verify that User1 able to login into Mercury Tours Application by using valid username and password")
  public void loginwithValiduser2ds(String usernm2,String passwd2) 
  {

	 
		  System.out.println("In loginwithValiduser1ds method under Test");
		  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(usernm2);
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passwd2);
		  driver.findElement(By.xpath("//input[@name='login']")).click();
		  System.out.println("User1 has login into Mercury Tours Application successfully");
		  boolean flag1=driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
		  System.out.println("Flight Finder image is displayed: " +flag1);
		  driver.findElement(By.linkText("SIGN-OFF")).click();
		  System.out.println("User1 has logged out from MTA successfully");
		  
		  
	  }

	 @Parameters ({"username3","password3"})
	 @Test(priority=3,description="Verify that User1 able to login into Mercury Tours Application by using valid username and password")
  public void loginwithValiduser3ds(String usernm3,String passwd3) 
  {

	 
		  System.out.println("In loginwithValiduser1ds method under Test");
		  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(usernm3);
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passwd3);
		  driver.findElement(By.xpath("//input[@name='login']")).click();
		  System.out.println("User1 has login into Mercury Tours Application successfully");
		  boolean flag1=driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
		  System.out.println("Flight Finder image is displayed: " +flag1);
		  driver.findElement(By.linkText("SIGN-OFF")).click();
		  System.out.println("User1 has logged out from Mercury Tours Application successfully");
		  
		  
	  }
	 @Parameters ({"invalidusername","invalidpassword"})
	 @Test(priority=4,groups={"Smoke"},description="Verify that invalid user not able to login into Mercury Tours Application")
  public void loginwithInvaliduserds(String invaliduname,String invalidpasswd) 
  {

	 
		  System.out.println("In loginwithValiduser1ds method under Test");
		  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(invaliduname);
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(invalidpasswd);
		  driver.findElement(By.xpath("//input[@name='login']")).click();
		  System.out.println("User1 has login into Mercury Tours Application successfully");
		  boolean flag1=driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
		  System.out.println("Flight Finder image is displayed: " +flag1);
		  driver.findElement(By.linkText("SIGN-OFF")).click();
		  System.out.println("User1 has logged out from Mercury Tours Application successfully");
		  
		  
	  } @Parameters ({"invalidusername1","invalidpassword1"})
		 @Test(priority=5,description="Verify that invalid user not able to login into Mercury Tours Application")
	  public void loginwithInvaliduserds2(String invaliduname1,String invalidpasswd1) 
	  {

		 
			  System.out.println("In loginwithValiduser2ds method under Test");
			  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(invaliduname1);
			  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(invalidpasswd1);
			  driver.findElement(By.xpath("//input[@name='login']")).click();
			  System.out.println("User1 has login into Mercury Tours Application successfully");
			  boolean flag1=driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
			  System.out.println("Flight Finder image is displayed: " +flag1);
			  driver.findElement(By.linkText("SIGN-OFF")).click();
			  System.out.println("User1 has logged out from Mercury Tours Application successfully");
			  
			  
		  }


  @BeforeMethod(groups={"Smoke"})
  public void getAllCookies() 
  {
	  System.out.println("In getAllCookies method under BeforeMethod");
	  Set<Cookie> cookies=driver.manage().getCookies();
	  for(Cookie cookie:cookies)
	  {
		  System.out.println(cookie.getName());
	  }

  }

  @AfterMethod(groups={"Smoke"})
  public void captureScreenshot() throws IOException 
  {
	  System.out.println("In captureScreenshot method under AfterMethod");
  File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  FileUtils.copyFileToDirectory(src, new File("F:\\Suvidya_data\\Java_Selenium\\MercuryTsParamDemo\\Screenshots\\"));
  System.out.println("Screenshot has captured successfully");
  }

  @BeforeClass(groups={"Smoke"})
  public void maximiseBrowser()
  {
	  System.out.println("In maximizeBrowser method under BeforeClass");
	  driver.manage().window().maximize();
  }

  @AfterClass(groups={"Smoke"})
  public void deleteAllCookies() 
  {
	  System.out.println("In deleteAllCookies method under AfterClass");
	  driver.manage().deleteAllCookies();
  }
@Parameters({"url"})
  @BeforeTest(groups={"Smoke"})
  public void enterApplicationURL(String urlnm) 
  {
	  System.out.println("In enterApplicationURL method under BeforeTest ");
	  driver.get(urlnm);
  }

  @AfterTest(groups={"Smoke"})
  public void dbConnectionClosed() 
  {
	  System.out.println("In dbConnectionClosed method under AfterTest");
 
	  
  }
  @Parameters({"browser"})
  @BeforeSuite(groups={"Smoke"})
  public void openBrowser(String browsernm) 
  {
	  System.out.println("In openBrowser method under BeforeSuite");
	  if(browsernm.equalsIgnoreCase("chrome"))
	  {
		  System.out.println("chrome Browser");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium_Task\\chrome 65version\\chromedriver.exe");
		    driver=new ChromeDriver();
		    System.out.println("chrome browser is opened Successfully");
	  }
	  else if(browsernm.equalsIgnoreCase("ie"))
	  {
		  System.out.println("Internet Explorer");
		  System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\Desktop\\Selenium_Task\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		    driver=new InternetExplorerDriver();
		    System.out.println("Internet Explorer is opened Successfully");
	  }
	  else
	  {
		  System.out.println("Firefox Browser");
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\Selenium_Task\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		      driver=new FirefoxDriver();
		      System.out.println("Firefox is Opened Successfully");
	  }
	  
  }
  
  @AfterSuite(groups={"Smoke"})
  public void afterSuite()
  {
	  System.out.println("In closeBrowser method under AfterSuite");
	  driver.close();

  }

}
