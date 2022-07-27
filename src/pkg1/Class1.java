package pkg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Basic\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
		
	// Ankita  kahane
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		WebElement searchContact = driver.findElement(By.xpath("//div[@title='Search input textbox']"));
		searchContact.click();
		searchContact.sendKeys("Software Testers");
		driver.findElement(By.xpath("(//div[@class='_3OvU8'])[1]")).click();

	    WebElement typeMsg = driver.findElement(By.xpath("//p[@class='selectable-text copyable-text']"));
	    typeMsg.click();
	    Thread.sleep(3000);

	    typeMsg.sendKeys("Hello Guys "
	    		+ "Finally program done");
	    driver.findElement(By.xpath("//span[@data-testid='send']")).click();
	}

}
