package maven_package.ecommerce_project;

import java.io.File;
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
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCasesNG {

	@Test(priority=1)
	public void Register() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 Reporter.log(" go to automationexercise website");

		 driver.navigate().to("http://automationexercise.com"); 
		WebElement Signup_logintab = driver.findElement(By.cssSelector("a[href*='/login']"));
		Signup_logintab.click();  
		
		 final String username = "gamal1311";
	        
	        // Find the name form field
	        WebElement name = driver.findElement(By.name("name"));
	        
	        // Type the name to the form
	        name.sendKeys(username);

		 final String useremail = "gamal1311@gmail.com";
	        
	        // Find the email form field
	        WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
	        
	        // Type the  email to the form
	        email.sendKeys(useremail);
	        
	        WebElement Signupbutton = driver.findElement(By.xpath("//*[text()='Signup']"));	
	        Signupbutton.submit();   
	        @SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 40);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1"))).click();
	        final String userpassword = "Ahmed1234";
      
	        // Find the password form field
	        WebElement password = driver.findElement(By.id("password"));
	        
        // Type the password to the form
	        password.sendKeys(userpassword);
        
final String userbirthday = "10";
	        
	        // Find the userbirthday form field
	        WebElement birthday = driver.findElement(By.name("days"));
	        
	        // Type the userbirthday to the form
	        birthday.sendKeys(userbirthday);
	        
final String userbirthmonth = "12";
	        
	        // Find the userbirthmonth form field
	        WebElement birthmonth = driver.findElement(By.name("months"));
	        
	        // Type the userbirthmonth to the form
	        birthmonth.sendKeys(userbirthmonth);
	        
final String userbirthyear = "2000";
	        
	        // Find the userbirthyear form field
	        WebElement birthyear = driver.findElement(By.name("years"));
	        
	        // Type the userbirthyear to the form
	        birthyear.sendKeys(userbirthyear);
	       
	        
	        WebElement newsletter_checkbox =driver.findElement(By.id("newsletter"));
	        newsletter_checkbox.click();
	        
	        WebElement  specialoffers_checkbox =driver.findElement(By.id("optin"));
	        specialoffers_checkbox.click();
	        
	        final String first_name = "Ahmed";
	        
	        // Find the firstname form field
	        WebElement firstname = driver.findElement(By.id("first_name"));
	        
	        // Type the firstname to the form
	        firstname.sendKeys(first_name);
	        
	        final String last_name = "Farrag ";

	        // Find the lastname form field
	        WebElement lastname = driver.findElement(By.id("last_name"));
	        
	        // Type the lastname to the form
	        lastname.sendKeys(last_name);
	        
	        
	        final String company = "vodafone";

	        // Find the company form field
	        WebElement companyName = driver.findElement(By.id("company"));
	        
	        // Type the company to the form
	        companyName.sendKeys(company);
	        try{
	        	Thread.sleep(1000);
	        	}
	        	catch(InterruptedException ie){
	        	}
	        
	        final String Address1 = "689 1st Street , Alberta , western Canada ,canada";

	        // Find the address1 form field
	        WebElement address1 = driver.findElement(By.id("address1"));
	        
	        // Type the address1 to the form
	        address1.sendKeys(Address1);
	        
	        final String Address2 = "341 3rd Street , Alberta , western Canada ,canada";

	        // Find the address2 form field
	        WebElement address2 = driver.findElement(By.id("address2"));
	        
	        // Type the address2 to the form
	        address2.sendKeys(Address2);
	        
	        
	        final String country = "Canada";

	        // Find the country form field
	        WebElement countryName = driver.findElement(By.id("country"));
	        
	        // Type the country to the form
	        countryName.sendKeys(country);
	        
	        final String state = "western Canada";

	        // Find the state form field
	        WebElement stateName = driver.findElement(By.id("state"));
	        
	        // Type the state to the form
	        stateName.sendKeys(state);
	        
	  
	        final String city = "Alberta";

	        // Find the city form field
	        WebElement cityName = driver.findElement(By.id("city"));
	        
	        // Type the city to the form
	        cityName.sendKeys(city);
	        try{
	        	Thread.sleep(1000);
	        	}
	        	catch(InterruptedException ie){
	        	}
	        
	        final String zipcode  = "T9E";

	        // Find the zipcode form field
	        WebElement cityZipcode  = driver.findElement(By.id("zipcode"));
	        
	        // Type the zipcode to the form
	        cityZipcode.sendKeys(zipcode);
	        
	        final String mobile  = "+1 123-456-7890";

	        // Find the mobile form field
	        WebElement mobilephone  = driver.findElement(By.id("mobile_number"));
	        
	        // Type the mobile to the form
	        mobilephone.sendKeys(mobile);
	        
	        WebElement CreateButton = driver.findElement(By.xpath("//*[text()='Create Account']"));	
	        CreateButton.submit();


try{
Thread.sleep(2000);
}
catch(InterruptedException ie){
}
	        WebElement ContinueButton = driver.findElement(By.cssSelector("a[href*='/']"));
	        ContinueButton.click();  
			try{
				Thread.sleep(1000);
				}
				catch(InterruptedException ie){
				}
		
	        TakesScreenshot ts = (TakesScreenshot)driver;

            //capture screenshot as output type FILE
File file = ts.getScreenshotAs(OutputType.FILE);

try {
            //save the screenshot taken in destination path
	FileHandler.copy(file, new File("C:\\Users\\Mohamed\\eclipse-workspace\\QAproject\\ScreenShots\\screen1.png"));
} catch (IOException e) {
e.printStackTrace();
}
Reporter.log("Click on 'Signup / Login' button");
Reporter.log("enter name as : "+ username +" and enter email address as " + useremail +" and Click 'Signup' button ");
Reporter.log("Fill details: "+ " title as Male"+ " Name as :" + username + "Email as : " + useremail+ " and password as : " + userpassword );
Reporter.log("Fill Date of birth details as : " + userbirthday + "/" + userbirthmonth+ " / " + userbirthyear );
Reporter.log(" Select checkbox 'Sign up for our newsletter!'  &  Select checkbox 'Receive special offers from our partners!'");
Reporter.log("Fill details:"+" First Name as : " + first_name + ", Last Name as : " + last_name + ", Company as :" + company + ", Address1 as : " + Address1 + ", Address2 as : " + Address2 + ", Country as : " + country+ ", State as :" + state + ", City as : " + city +", Zipcode as : " + zipcode +", MobilePhone as : " + mobile );
Reporter.log("Click 'Create Account button' and  Verify that 'ACCOUNT CREATED!' is visible");
Reporter.log("Click 'Continue' button and Verify that 'Logged in as username' is visible ");






driver.quit() ;
	}
	
	@Test(priority=2)
	public void Login() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 Reporter.log(" go to automationexercise website");


		 driver.navigate().to("http://automationexercise.com");
		WebElement Signup_logintab = driver.findElement(By.cssSelector("a[href*='/login']"));
		Signup_logintab.click();  

		 final String useremail = "sahe3233@gmail.com";
	        
	        WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
	        
	        email.sendKeys(useremail);
	        
	        
 final String userpassword = "A1234";
	        
	        WebElement password = driver.findElement(By.name("password"));
	        
	        password.sendKeys(userpassword);
	        
	        WebElement Loginbutton = driver.findElement(By.xpath("//*[text()='Login']"));	
	        Loginbutton.submit();   
	        try{
				Thread.sleep(2000);
				}
				catch(InterruptedException ie){
				}
	        TakesScreenshot ts = (TakesScreenshot)driver;

            //capture screenshot as output type FILE
File file = ts.getScreenshotAs(OutputType.FILE);

try {
            //save the screenshot taken in destination path
	FileHandler.copy(file, new File("C:\\Users\\Mohamed\\eclipse-workspace\\QAproject\\ScreenShots\\screen2.png"));
} catch (IOException e) {
e.printStackTrace();
}
Reporter.log("Click on 'Signup / Login' button");
Reporter.log("Enter incorrect email address as " + useremail + " and incorrect password as " + userpassword );
Reporter.log("Click 'login' button and Verify error 'Your email or password is incorrect!' is visible ");


driver.quit() ;
	}
	@Test(priority=3)
	public void SearchProductsandVerifyCartAfterLogin() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 Reporter.log(" go to automationexercise website");

		 driver.navigate().to("http://automationexercise.com");
		WebElement producttab = driver.findElement(By.cssSelector("a[href*='/products']"));
		producttab.click();  
		 //driver.switchTo().defaultContent();

	 	final String product = " V-Neck ";

		WebElement searchTextField = driver.findElement(By.xpath("(//input[@id='search_product'])"));
        
        searchTextField.sendKeys(product);
 
       
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"submit_search\"]"))).click();
        
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement productaddtocart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a"))); 
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", productaddtocart);
        try{
			Thread.sleep(4000);
			}
			catch(InterruptedException ie){
			}


        WebDriverWait wait2 = new WebDriverWait(driver, 30);
        WebElement viewcart = wait2.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href*='/view_cart']"))); 
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", viewcart);
        
        try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
			}
        
        WebElement Signup_logintab = driver.findElement(By.cssSelector("a[href*='/login']"));
        Signup_logintab.click(); 
        try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
			}
		final String useremail = "mha,ed13@gmail.com";
        
        WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
        
        email.sendKeys(useremail);
        
        
final String userpassword = "Ahmed1234";
        
        WebElement password = driver.findElement(By.name("password"));
        
        password.sendKeys(userpassword);
        try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
			}
        
        WebElement Loginbutton = driver.findElement(By.xpath("//*[text()='Login']"));	
        Loginbutton.submit(); 

        WebDriverWait wait4 = new WebDriverWait(driver, 30);
        WebElement viewcart2 = wait4.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href*='/view_cart']"))); 
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", viewcart2);
        try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
			}
        TakesScreenshot ts = (TakesScreenshot)driver;

        //capture screenshot as output type FILE
File file = ts.getScreenshotAs(OutputType.FILE);

try {
        //save the screenshot taken in destination path
FileHandler.copy(file, new File("C:\\Users\\Mohamed\\eclipse-workspace\\QAproject\\ScreenShots\\screen3.png"));
} catch (IOException e) {
e.printStackTrace();
}
Reporter.log("Click Products button");
Reporter.log(" Enter product name in search input as "+ product + " and click search button");
Reporter.log("Verify 'SEARCHED PRODUCTS' is visible");
Reporter.log("Add this product to cart");
Reporter.log(" Click 'Cart' button and verify that products are visible in cart");
Reporter.log("Click 'Signup / Login' button and enter email as "+ useremail + " and enter password as "+ userpassword);
Reporter.log(" Again, go to Cart page");
Reporter.log(" Verify that those products are visible in cart after login as well");



driver.quit() ;
	}
	@Test(priority=4)
	public void RemoveProductsfromCart() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 Reporter.log(" go to automationexercise website");

		 driver.navigate().to("http://automationexercise.com");
	
 
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement productaddtocart_button = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[data-product-id=\"2\""))); 
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", productaddtocart_button);
      
        try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
			}


        WebDriverWait wait2 = new WebDriverWait(driver, 30);
        WebElement view_cart = wait2.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href*='/view_cart']"))); 
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", view_cart);
        try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
			}
        
        WebDriverWait wait3 = new WebDriverWait(driver, 30);
        WebElement removeproductfromcart_button = wait3.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[data-product-id=\"2\""))); 
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", removeproductfromcart_button);
        try{
			Thread.sleep(2000);
			}
			catch(InterruptedException ie){
			}
        TakesScreenshot ts = (TakesScreenshot)driver;

        //capture screenshot as output type FILE
File file = ts.getScreenshotAs(OutputType.FILE);

try {
        //save the screenshot taken in destination path
FileHandler.copy(file, new File("C:\\Users\\Mohamed\\eclipse-workspace\\QAproject\\ScreenShots\\screen4.png"));
} catch (IOException e) {
e.printStackTrace();
}
Reporter.log(" Add products to cart and Click 'Cart' button");
Reporter.log(" Verify that cart page is displayed  and Click 'X' button  to remove particular product");
Reporter.log("Verify that product is removed from the cart");

driver.quit() ;
	}
	@SuppressWarnings("deprecation")
	@Test(priority=5)
	public void PlaceOrderLoginbeforeCheckout() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 Reporter.log(" go to automationexercise website");


		 driver.navigate().to("http://automationexercise.com");
	
		 WebElement Signup_logintab = driver.findElement(By.cssSelector("a[href*='/login']"));
		 Signup_logintab.click();  

			final String useremail = "mohamed1511@gmail.com";
		        
		        WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		        
		        email.sendKeys(useremail);
		        
		        
		    	final String userpassword = "Ahmed1234";
		        
		        WebElement password = driver.findElement(By.name("password"));
		        
		        password.sendKeys(userpassword);
		        try{
					Thread.sleep(2000);
					}
					catch(InterruptedException ie){
					}
		        
		        WebDriverWait wait = new WebDriverWait(driver, 50);
		        WebElement loginbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Login']"))); 
		        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", loginbutton);
		        
		        WebDriverWait wait2 = new WebDriverWait(driver, 30);
		        WebElement product1addtocart_button = wait2.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[data-product-id=\"2\""))); 
		        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", product1addtocart_button);
		        
		        try{
					Thread.sleep(2000);
					}
					catch(InterruptedException ie){
					}
		        WebDriverWait wait3 = new WebDriverWait(driver, 30);
		        WebElement ContinueShoping_Button = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button"))); 
		        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", ContinueShoping_Button);
		        
		        try{
					Thread.sleep(1000);
					}
					catch(InterruptedException ie){
					}
		        WebDriverWait wait4 = new WebDriverWait(driver, 30);
		        WebElement product2addtocart_button = wait4.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[data-product-id=\"1\""))); 
		        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", product2addtocart_button);
		        
		        try{
					Thread.sleep(1000);
					}
					catch(InterruptedException ie){
					}
		        WebDriverWait wait5 = new WebDriverWait(driver, 30);
		        WebElement view_cart = wait5.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href*='/view_cart']"))); 
		        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", view_cart);
		        
		        try{
					Thread.sleep(1000);
					}
					catch(InterruptedException ie){
					}
		        
		        WebDriverWait wait6 = new WebDriverWait(driver, 40);
		        WebElement Checkout_Button = wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Proceed To Checkout']"))); 
		        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", Checkout_Button);
		        
		        final String productsdescription   = "Please i need my orders as soon as poosible ";
		        
		        WebElement description = driver.findElement(By.name("message"));
		        
		        description.sendKeys(productsdescription);
		        
		        try{
					Thread.sleep(2000);
					}
					catch(InterruptedException ie){
					}
		        WebDriverWait wait7 = new WebDriverWait(driver, 40);
		        WebElement PlaceOrderButton = wait7.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href*='/payment']"))); 
		        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", PlaceOrderButton);
		        
		        try{
					Thread.sleep(2000);
					}
					catch(InterruptedException ie){
					}
		        
		        final String usernameoncard = "Ahmed Mohamed Ahmed";
		        
		        WebElement nameoncard = driver.findElement(By.name("name_on_card"));
		        
		        nameoncard.sendKeys(usernameoncard);  
		        
		        final String userCardNumber = "4485315158822849";
		        
		        WebElement CardNumber = driver.findElement(By.name("card_number"));
		        
		        CardNumber.sendKeys(userCardNumber); 
		        
		        final String userCVC = "987";
		        
		        WebElement CVC = driver.findElement(By.name("cvc"));
		        
		        CVC.sendKeys(userCVC); 
		        
		        final String cvcExpirationMonth = "7";
		        
		        WebElement ExpirationMonth = driver.findElement(By.name("expiry_month"));
		        
		        ExpirationMonth.sendKeys(cvcExpirationMonth); 
		        
		        final String cvcExpirationYear = "2022";
		        
		        WebElement ExpirationYear = driver.findElement(By.name("expiry_year"));
		        
		        ExpirationYear.sendKeys(cvcExpirationYear); 
		        
		        try{
					Thread.sleep(2000);
					}
					catch(InterruptedException ie){
					}
		        
		        WebDriverWait wait8 = new WebDriverWait(driver, 30);
		        WebElement PayandConfirmButton  = wait8.until(ExpectedConditions.elementToBeClickable(By.id("submit"))); 
		        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", PayandConfirmButton);
		        WebElement deletetab = driver.findElement(By.cssSelector("a[href*='/delete_account']"));
		        deletetab.click();  
				try{
					Thread.sleep(2000);
					}
					catch(InterruptedException ie){
					}
				WebElement deleteButton = driver.findElement(By.xpath("//*[text()='Delete']"));	
				deleteButton.submit();
		        try{
					Thread.sleep(2000);
					}
					catch(InterruptedException ie){
					}
		        TakesScreenshot ts = (TakesScreenshot)driver;

	            //capture screenshot as output type FILE
	File file = ts.getScreenshotAs(OutputType.FILE);

	try {
	            //save the screenshot taken in destination path
		FileHandler.copy(file, new File("C:\\Users\\Mohamed\\eclipse-workspace\\QAproject\\ScreenShots\\screen5.png"));
	} catch (IOException e) {
	e.printStackTrace();
	}
	Reporter.log(" Click 'Signup / Login' button and enter useremail as "+ useremail + " enter userpassword as "+ userpassword );
	Reporter.log(" and click 'Login' button" );
	Reporter.log(" Add products to cart and Click 'Cart' button");
	Reporter.log(" Verify that cart page is displayed");
	Reporter.log(" Click Proceed To Checkout");
	Reporter.log(" Verify Address Details and Review Your Order");
	Reporter.log(" Enter description as " + productsdescription +" in text area and click 'Place Order'");
	Reporter.log("  Enter payment details: Name on Card as "+ usernameoncard +", Card Number as "+ userCardNumber + ", CVC as "+ userCVC +" , Expiration date as "+ cvcExpirationMonth + "/" + cvcExpirationYear);
	Reporter.log(" Click 'Pay and Confirm Order' button");
	Reporter.log("  Verify success message 'Your order has been placed successfully!'");



	driver.quit() ;
	}

}
