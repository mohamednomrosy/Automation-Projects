package maven_package.facebook;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCasesNG {

	@Test(priority=1)
	public void invalid_email_login() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
 
		
		   driver.navigate().to("https://en-gb.facebook.com/");   
		   final String useremail = "Mohamed1413131112@gmail.com";
		   WebElement email= driver.findElement(By.id("email"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   email.sendKeys(useremail);
		 
		   final String userpassword = "12345";
		   WebElement password= driver.findElement(By.id("pass"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   password.sendKeys(userpassword);
		   
		   WebElement Loginbutton = driver.findElement(By.name("login"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
	        Loginbutton.submit();  
	        try{
				Thread.sleep(6000);
				}
				catch(InterruptedException ie){
				}
	        Assert.assertNotEquals("moh_mam_nomrosy@hotmail.com",useremail);  

	        driver.quit() ;
 



	}
	
	@Test(priority=2)
	public void invalid_password_login() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
 
 
		   driver.navigate().to("https://en-gb.facebook.com/");   
		   final String useremail = "moh_mam_nomrosy@hotmail.com";
		   WebElement email= driver.findElement(By.id("email"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   email.sendKeys(useremail);
		 
		   final String userpassword = "12345";
		   WebElement password= driver.findElement(By.id("pass"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   password.sendKeys(userpassword);
		   
		   WebElement Loginbutton = driver.findElement(By.name("login"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
	        Loginbutton.submit();  
	       
	        try{
				Thread.sleep(6000);
				}
				catch(InterruptedException ie){
				}
	        Assert.assertNotEquals("123456",userpassword);  

	        driver.quit() ;



	}
	@Test(priority=3)
	public void invalid_emailpassword_login() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
 
		
		   driver.navigate().to("https://en-gb.facebook.com/");   
		   final String useremail = "Mohamed1413131112@gmail.com";
		   WebElement email= driver.findElement(By.id("email"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   email.sendKeys(useremail);
		 
		   final String userpassword = "12345";
		   WebElement password= driver.findElement(By.id("pass"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   password.sendKeys(userpassword);
		   
		   WebElement Loginbutton = driver.findElement(By.name("login"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
	        Loginbutton.submit();  
	        try{
				Thread.sleep(6000);
				}
				catch(InterruptedException ie){
				}
	        Assert.assertNotEquals("moh_mam_nomrosy@hotmail.com",useremail);  

	        Assert.assertNotEquals("123456",userpassword);  

	        driver.quit() ;


	}
	@Test(priority=4)
	public void blank_email_login() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
 
		
		   driver.navigate().to("https://en-gb.facebook.com/");   
		   final String useremail = "";
		   WebElement email= driver.findElement(By.id("email"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   email.sendKeys(useremail);
		 
		   final String userpassword = "12345";
		   WebElement password= driver.findElement(By.id("pass"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   password.sendKeys(userpassword);
		   
		   WebElement Loginbutton = driver.findElement(By.name("login"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
	        Loginbutton.submit();  
	        try{
				Thread.sleep(6000);
				}
				catch(InterruptedException ie){
				}
	        Assert.assertNotEquals("moh_mam_nomrosy@hotmail.com",useremail);  

	        driver.quit() ;


	}
	@Test(priority=5)
	public void black_password_login() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
 
		
		   driver.navigate().to("https://en-gb.facebook.com/");   
		   final String useremail = "moh_mam_nomrosy@hotmail.com";
		   WebElement email= driver.findElement(By.id("email"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   email.sendKeys(useremail);
		 
		   final String userpassword = "";
		   WebElement password= driver.findElement(By.id("pass"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   password.sendKeys(userpassword);
		   
		   WebElement Loginbutton = driver.findElement(By.name("login"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
	        Loginbutton.submit();  
	        try{
				Thread.sleep(6000);
				}
				catch(InterruptedException ie){
				}

	        Assert.assertNotEquals("123456",userpassword);  
	        driver.quit() ;


	}
	@Test(priority=6)
	public void blank_emailpassword_login() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
 
		
		   driver.navigate().to("https://en-gb.facebook.com/");   
		   final String useremail = "";
		   WebElement email= driver.findElement(By.id("email"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   email.sendKeys(useremail);
		 
		   final String userpassword = "";
		   WebElement password= driver.findElement(By.id("pass"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   password.sendKeys(userpassword);
		   
		   WebElement Loginbutton = driver.findElement(By.name("login"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
	        Loginbutton.submit();  
	        try{
				Thread.sleep(6000);
				}
				catch(InterruptedException ie){
				}
	        Assert.assertNotEquals("moh_mam_nomrosy@hotmail.com",useremail);  

	        Assert.assertNotEquals("123456",userpassword);  
	        driver.quit() ;


	}
	@Test(priority=7)
	public void invalid_phonenum_login() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
 
		
		   driver.navigate().to("https://en-gb.facebook.com/");   
		   final String userphone = "33131312312312312312312";
		   WebElement phone= driver.findElement(By.id("email"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   phone.sendKeys(userphone);
		 
		   final String userpassword = "12345";
		   WebElement password= driver.findElement(By.id("pass"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   password.sendKeys(userpassword);
		   
		   WebElement Loginbutton = driver.findElement(By.name("login"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
	        Loginbutton.submit();  
	        try{
				Thread.sleep(6000);
				}
				catch(InterruptedException ie){
				}
	        Assert.assertNotEquals("01118712681",userphone);  

	        driver.quit() ;
 



	}
	
	@Test(priority=8)
	public void valid_phonenum_login() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		   driver.navigate().to("https://en-gb.facebook.com/");   
		   final String userphone = "01118712681";
		   WebElement phone= driver.findElement(By.id("email"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   phone.sendKeys(userphone);
		 
		   final String userpassword = "12345";
		   WebElement password= driver.findElement(By.id("pass"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   password.sendKeys(userpassword);
		   
		   WebElement Loginbutton = driver.findElement(By.name("login"));
		   try{
				Thread.sleep(6000);
				}
				catch(InterruptedException ie){
				}
	        Loginbutton.submit();  
	       
	        try{
				Thread.sleep(5000);
				}
				catch(InterruptedException ie){
				}
	        Assert.assertNotEquals("123456",userpassword);  

	        driver.quit() ;



	}
	@Test(priority=9)
	public void invalid_phonenum_password_login() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
 
		
		   driver.navigate().to("https://en-gb.facebook.com/");   
		   final String userphone = "33131312312312312312312";
		   WebElement phone= driver.findElement(By.id("email"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   phone.sendKeys(userphone);
		 
		   final String userpassword = "12345";
		   WebElement password= driver.findElement(By.id("pass"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   password.sendKeys(userpassword);
		   
		   WebElement Loginbutton = driver.findElement(By.name("login"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
	        Loginbutton.submit();  
	        try{
				Thread.sleep(6000);
				}
				catch(InterruptedException ie){
				}
	        Assert.assertNotEquals("01118712681",userphone);  
	        Assert.assertNotEquals("123456",userpassword);  

	        driver.quit() ;


	}
	@Test(priority=10)
	public void valid_email_password_login() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
 
		
		   driver.navigate().to("https://en-gb.facebook.com/");   
		   final String useremail = "moh_mam_nomrosy@hotmail.com";
		   WebElement email= driver.findElement(By.id("email"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   email.sendKeys(useremail);
		 
		   final String userpassword = "RecordsMohamed123";
		   WebElement password= driver.findElement(By.id("pass"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   password.sendKeys(userpassword);
		   
		   WebElement Loginbutton = driver.findElement(By.name("login"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
	        Loginbutton.submit();  
	        try{
				Thread.sleep(11000);
				}
				catch(InterruptedException ie){
				}
	        Assert.assertEquals(useremail,"moh_mam_nomrosy@hotmail.com");  
	        Assert.assertEquals(userpassword,"RecordsMohamed123");  

	        driver.quit() ;


	}
	@Test(priority=11)
	public void valid_phonenum_password_login() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
 
		
		   driver.navigate().to("https://en-gb.facebook.com/");   
		   final String userphone = "01118712681";
		   WebElement phone= driver.findElement(By.id("email"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){

				}
		   phone.sendKeys(userphone);
		 
		   final String userpassword = "RecordsMohamed123";
		   WebElement password= driver.findElement(By.id("pass"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   password.sendKeys(userpassword);
		   
		   WebElement Loginbutton = driver.findElement(By.name("login"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
	        Loginbutton.submit();  
	        try{
				Thread.sleep(10000);
				}
				catch(InterruptedException ie){
				}
	        Assert.assertEquals(userphone,"01118712681");  
	        Assert.assertEquals(userpassword,"RecordsMohamed123");  

	        driver.quit() ;


	}
	
	@Test(priority=12)
	public void check_forgott_Password_functionality_login() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
 
		
		   driver.navigate().to("https://en-gb.facebook.com/");   
		   
		   WebElement forgetbutton = driver.findElement((By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   forgetbutton.click(); 
		   try{
				Thread.sleep(2000);
				}
				catch(InterruptedException ie){
				}
		   final String useremail = "moh_mam_nomrosy@hotmail.com";
		   WebElement email= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div/div/form/div/div[2]/div/table/tbody/tr[2]/td[2]/input"));
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   email.sendKeys(useremail);
		   try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		   
		   WebElement searchbutton = driver.findElement((By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div/div/form/div/div[3]/div/div[1]/button")));
		   searchbutton.submit(); 
		   WebDriverWait wait = new WebDriverWait(driver, 40);
	        WebElement continuehbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/form/div/div[3]/div/div[1]/button"))); 
	        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", continuehbutton);
		  
		   try{
				Thread.sleep(6000);
				}
				catch(InterruptedException ie){
				}
		   driver.quit() ;


	}
	

}
