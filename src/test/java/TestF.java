
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestF {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://hvnuk.com.ua/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test2() throws Exception {
        driver.get("https://petition.mkrada.gov.ua/");
        assertEquals("Петиції", driver.findElement(By.cssSelector("h4")).getText());
        assertEquals("Створити петицію", driver.findElement(By.linkText("Створити петицію")).getText());
        assertEquals("Нові петиції", driver.findElement(By.linkText("Нові петиції")).getText());
        assertEquals("Популярні петиції", driver.findElement(By.linkText("Популярні петиції")).getText());
        assertEquals("Підтримані петиції", driver.findElement(By.linkText("Підтримані петиції")).getText());
        assertEquals("Усі петиції", driver.findElement(By.linkText("Усі петиції")).getText());
        assertEquals("Державні інформаційні ресурси", driver.findElement(By.xpath("//div[2]/h4")).getText());
        assertEquals("Петиції до Президента України", driver.findElement(By.linkText("Петиції до Президента України")).getText());
        assertEquals("Петиції до Верховної Ради України", driver.findElement(By.linkText("Петиції до Верховної Ради України")).getText());
        assertEquals("Обласні інформаційні ресурси", driver.findElement(By.xpath("//div[2]/h4[2]")).getText());
        assertEquals("Миколаївська обласна державна адміністрація", driver.findElement(By.linkText("Миколаївська обласна державна адміністрація")).getText());
        assertEquals("Миколаївська обласна рада", driver.findElement(By.linkText("Миколаївська обласна рада")).getText());
        assertEquals("УМВС України в Миколаївській області", driver.findElement(By.linkText("УМВС України в Миколаївській області")).getText());
        assertEquals("Прокуратура Миколаївської області", driver.findElement(By.linkText("Прокуратура Миколаївської області")).getText());
        assertEquals("Головне територіальне управління юстиції у Миколаївській області", driver.findElement(By.linkText("Головне територіальне управління юстиції у Миколаївській області")).getText());
        assertEquals("Міські інформаційні ресурси", driver.findElement(By.xpath("//div[3]/h4")).getText());
        assertEquals("Адміністрація Центрального району", driver.findElement(By.linkText("Адміністрація Центрального району")).getText());
        assertEquals("Адміністрація Заводського району", driver.findElement(By.linkText("Адміністрація Заводського району")).getText());
        assertEquals("Департамент праці та соціального захисту населення", driver.findElement(By.linkText("Департамент праці та соціального захисту населення")).getText());
        assertEquals("Розробник: kitsoft\nза підтримки ЦРІ НаУКМА", driver.findElement(By.xpath("//div[2]/div[4]")).getText());
        assertEquals("kitsoft", driver.findElement(By.linkText("kitsoft")).getText());
        assertEquals("© 2015 Миколаївська міська рада", driver.findElement(By.xpath("//div[2]/div[3]")).getText());
        assertEquals("Підписка на оновлення", driver.findElement(By.xpath("//h4[2]")).getText());
        assertEquals("info@mkrada.gov.ua", driver.findElement(By.linkText("info@mkrada.gov.ua")).getText());
        assertEquals("", driver.findElement(By.id("subscrBtn")).getText());
        assertEquals("", driver.findElement(By.id("subscrEMail")).getText());
        driver.findElement(By.id("subscrEMail")).clear();
        driver.findElement(By.id("subscrEMail")).sendKeys("123");
        driver.findElement(By.id("subscrBtn")).click();
        driver.findElement(By.id("subscrEMail")).clear();
        driver.findElement(By.id("subscrEMail")).sendKeys("yds@gmail.com");
        driver.findElement(By.id("subscrBtn")).click();
        assertEquals("", driver.findElement(By.xpath("//input[@value='\nзакрити']")).getText());
        driver.findElement(By.xpath("//input[@value='\nзакрити']")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}

