package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Govpage {
    WebDriver driver = new FirefoxDriver();

    public void openhomepage(){
        driver.get("https://www.gov.uk/");
        driver.manage().window().maximize();
    }

    public void businessandselfemployed(){
        driver.findElement(By.xpath(".//*[@id='services-and-information']/div/div[2]/ol[1]/li[3]/h3/a")).click();
        String expTitle = "Business and self-employed";
        String actTitle = driver.findElement(By.xpath(".//*[@id='section']/div/h1")).getText();
        Assert.assertEquals(expTitle, actTitle);
    }

    public void businesstax(){
        driver.findElement(By.xpath(".//*[@id='section']/div/ul/li[4]/a/h3")).click();
    }

    public void companytaxreturns(){
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='subsection']/div/ul/li[10]/a")).click();
    }

    public void penaltiesforlatefiling(){
        driver.findElement(By.xpath(".//*[@id='content']/div/div[1]/div/aside/div/nav/ol/li[2]/a")).click();
    }

    public void verifycompanytaxreturns(){
        String exppage = "Company Tax Returns";
        String actpage    = driver.findElement(By.xpath(".//*[@id='content']/header/div/h1")).getText();
        Assert.assertEquals(exppage, actpage);

    }


}
