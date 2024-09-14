import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLauch {

	public static String appurl = "https://google.com";
	public static WebElement googlesearchBtn;
	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\This PC\\Downloads\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get(appurl);
	driver.getTitle();

	driver.findElement(By.id("APjFqb")).sendKeys("BrowserStack Guide");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
//	googlesearchBtn.send
//	googlesearchBtn.click();
	
	driver.close();
	}

}
