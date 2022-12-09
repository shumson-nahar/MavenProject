package atumation_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://samsung.com");
		driver.manage().window().maximize();

	}

}
