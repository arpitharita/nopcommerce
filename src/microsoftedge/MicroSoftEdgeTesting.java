package microsoftedge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;
import java.util.Set;


public class MicroSoftEdgeTesting {
    public static void main(String[] args) {
        MicroSoftEdgeTesting edge = new MicroSoftEdgeTesting();
        edge.microsoftedgetesting();

        }
        public void microsoftedgetesting(){
            String baseUrL = "https://demo.nopcommerce.com/";
            System.setProperty("webdriver.edge.driver" ,"drivers/msedgedriver.exe");
            WebDriver driver = new EdgeDriver(); {
                driver.get(baseUrL);
                driver.manage().window().maximize();
                String title = driver.getTitle();
                System.out.println(title);
                driver.close();
        }

    }
}
