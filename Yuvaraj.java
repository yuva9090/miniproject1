package org.miniproject;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

public class Yuvaraj {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Practise\\NewDriver\\chromedriver.exe");

//AUTOMATION PRACTICE URL SEARCH

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		// MOUSE HOVER ON WOMEN

		WebElement women = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));

		Actions mouseh = new Actions(driver);

		mouseh.moveToElement(women).build().perform();

//SELECTING CASUAL DRESSES FOR WOMEN

		WebElement casual = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));

		casual.click();

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1000)");

//MOUSE HOVERING ACTION ON STOCK

	//	WebElement available = driver.findElement(By.xpath("//span[@class='available-now']"));
WebElement available = driver.findElement(By.xpath("//span[@class='available-now']"));
		Actions mouseh1 = new Actions(driver);

		mouseh1.moveToElement(available).build().perform();


		WebElement addcart = driver.findElement(By.xpath("(//span)[72]"));

		addcart.click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// PROCEED TO THE CHECKOUT

		WebElement findElement = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));

		findElement.click();

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("window.scrollBy(0,500)");

		// INCREASING THE QUANTITY OF DRESS

		WebElement qnty = driver.findElement(By.xpath("(//input[@type='text'])[2]"));

		qnty.click();

		qnty.sendKeys("7");

		// PROCEED TO CHECKOUT

		WebElement checkout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));

		checkout.click();


		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

//CREATE AN ACCOUNT

		WebElement createacc = driver.findElement(By.id("email_create"));

		createacc.sendKeys("yuvaraj78990@gmail.com");

		WebElement submit = driver.findElement(By.id("SubmitCreate"));

		submit.click();


		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		
		WebElement mr = driver.findElement(By.xpath("(//div[@class='radio-inline'])[1]"));

		mr.click();

		WebElement fname = driver.findElement(By.id("customer_firstname"));

		fname.sendKeys("yuva");

		WebElement lname = driver.findElement(By.id("customer_lastname"));

		lname.sendKeys("raj");

		WebElement pw = driver.findElement(By.id("passwd"));

		pw.sendKeys("7337YUVA");

		WebElement day = driver.findElement(By.id("days"));

		Select s = new Select(day);

		s.selectByValue("19");

		WebElement mon = driver.findElement(By.id("months"));

		Select sm = new Select(mon);

		sm.selectByIndex(10);

		WebElement yea = driver.findElement(By.id("years"));

		Select sy = new Select(yea);

		sy.selectByValue("1992");

		WebElement checkbox = driver.findElement(By.id("optin"));

		checkbox.click();

		WebElement com = driver.findElement(By.id("company"));

		com.sendKeys("cts");

		WebElement add = driver.findElement(By.id("address1"));

		add.sendKeys("11/8,hunuman street");

		WebElement add2 = driver.findElement(By.id("address2"));

		add2.sendKeys("karaikkal");

		WebElement city = driver.findElement(By.id("city"));

		city.sendKeys("mannarkudi");

		WebElement state = driver.findElement(By.id("id_state"));

		Select s3 = new Select(state);

		s3.selectByVisibleText("Indiana");

		WebElement post = driver.findElement(By.id("postcode"));

		post.sendKeys("46234");

		WebElement country = driver.findElement(By.id("id_country"));

		Select s4 = new Select(country);

		s4.selectByValue("21");

		WebElement other = driver.findElement(By.id("other"));

		other.sendKeys("iam a qa tester");

		WebElement ph = driver.findElement(By.id("phone"));

		ph.sendKeys("(800)820-8210");

		WebElement mob = driver.findElement(By.id("phone_mobile"));

		mob.sendKeys("+18143511190");

		WebElement sacc = driver.findElement(By.id("submitAccount"));

		sacc.click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// PROCEED TO CHECKOVER

		WebElement checkover = driver.findElement(By.xpath("//a[@title='View my shopping cart']"));

		Actions mousehover = new Actions(driver);

		mousehover.moveToElement(checkover).build().perform();

		JavascriptExecutor js2 = (JavascriptExecutor) driver;

		js2.executeScript("window.scrollBy(0,1000)");

		WebElement proceed1 = driver.findElement(By.name("processAddress"));

		proceed1.click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		JavascriptExecutor js3 = (JavascriptExecutor) driver;

//SHIPPING

		js3.executeScript("window.scrollBy(0,1000)");

		WebElement tick = driver.findElement(By.id("cgv"));

		tick.click();

//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		WebElement proceed2 = driver.findElement(By.name("processCarrier"));

		proceed2.click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		JavascriptExecutor js4 = (JavascriptExecutor) driver;

		js4.executeScript("window.scrollBy(0,1000)");

//PAYMENT

		WebElement paymethod = driver.findElement(By.xpath("(//p[@class='payment_module'])[2]"));

		paymethod.click();

		WebElement confirm = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));

		confirm.click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		JavascriptExecutor js5 = (JavascriptExecutor) driver;

		js5.executeScript("window.scrollBy(0,600)");

//SCREENSHOT

//		TakesScreenshot ts = (TakesScreenshot) driver;
//
//		File source = ts.getScreenshotAs(OutputType.FILE);
//
//
//
//		File destination = new File("C:\\Users\\pvmka\\eclipse-workspace\\Selenium_Projects\\screenshot\\error2.png");
//
//
//
//		FileUtils.copyFile(source, destination);

	}

}
