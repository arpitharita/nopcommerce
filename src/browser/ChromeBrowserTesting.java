package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class ChromeBrowserTesting {
    public static void main(String[] args) {
        ChromeBrowserTesting chr = new ChromeBrowserTesting();
        chr.chromebrowsertesting();
    }
    public void chromebrowsertesting(){
        String baseUrL = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrL);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
