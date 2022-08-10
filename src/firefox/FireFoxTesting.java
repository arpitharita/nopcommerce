package firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTesting {
    public static void main(String[] args) {
        FireFoxTesting fir = new FireFoxTesting();
        fir.firefoxtesting();

    }
    public void firefoxtesting()  {
        String baseUrL = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrL);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
        }
}

