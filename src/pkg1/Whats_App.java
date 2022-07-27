package pkg1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whats_App {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Basic\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		WebElement searchContact = driver.findElement(By.xpath("//div[@title='Search input textbox']"));
		searchContact.click();
		searchContact.sendKeys("Papa");
		driver.findElement(By.xpath("(//div[@class='_3OvU8'])[12]")).click();

	    WebElement typeMsg = driver.findElement(By.xpath("//p[@class='selectable-text copyable-text']"));
	    typeMsg.click();
	    Thread.sleep(3000);

	    typeMsg.sendKeys("Hello Dad");
	    driver.findElement(By.xpath("//span[@data-testid='send']")).click();

	}

}

//Set<String> chatContact = driver.getWindowHandles();
//Thread.sleep(3000);
//List<String>ContactOrder = new ArrayList<>(chatContact);
//
////     List<String>ContactOrder = new ArrayList<>(driver.getWindowHandles());
//
//System.out.println(ContactOrder);
//Thread.sleep(3000);
//driver.findElement(By.xpath("(//img[@draggable='false'])[1]")).click();