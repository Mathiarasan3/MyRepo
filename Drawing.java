import org.openqa.selenium.WebDriver;
package org.openqa.selenium;

public class Drawing {

	{

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pathtyourchrome\\chromedriver.exe");
		WebElement line = driver.findElement(By.Xpath(""));
		WebElement rectangle = driver.findElement(By.Xpath(""));
		WebElement eraser = driver.findElement(By.Xpath(""));
		WebElement element = driver.findElement(By.Xpath(""));
		String url = "" ; 
		driver.get(url);

		public static drawing_horizontal_line()
		{
		line.click();
		MoveToElement(element , 200 , 250).perform();
		clickAndHold().perform();
		moveByOffset(200 , 0).perform();
		release().perform();
		}

		public static drawing_vertical_line()
		{
		line.click();
		MoveToElement(element ,300 , 200).perform();
		clickAndHold().perform();
		moveByOffset(0 , 100).perform();
		release().perform();
		}

		public static drawing_rectangle()
		{
		rectangle.click();
		MoveToElement(element ,200 , 350).perform();
		clickAndHold().perform();
		moveByOffset(200 , 100).perform();
		release().perform();
		}

		public static deleting_horizontal_line()
		{
		eraser.click();
		MoveToElement(element , 200 , 250).perform();
		clickAndHold().perform();
		moveByOffset(200 , 0).perform();
		release().perform();
		}

}
