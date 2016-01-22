

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestH {
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
    public void test1() throws Exception {
        driver.get("https://petition.mkrada.gov.ua/");
        assertTrue(isElementPresent(By.cssSelector("a.logo")));
        assertEquals("положення", driver.findElement(By.linkText("положення")).getText());
        assertEquals("рекомендації", driver.findElement(By.linkText("рекомендації")).getText());
        assertEquals("петиції", driver.findElement(By.linkText("петиції")).getText());
        assertEquals("пошук", driver.findElement(By.linkText("пошук")).getText());
        driver.findElement(By.linkText("положення")).click();
        assertEquals("створити петицію", driver.findElement(By.linkText("створити петицію")).getText());
        assertEquals("положення", driver.findElement(By.linkText("положення")).getText());
        assertEquals("рекомендації", driver.findElement(By.linkText("рекомендації")).getText());
        assertEquals("петиції", driver.findElement(By.linkText("петиції")).getText());
        assertEquals("пошук", driver.findElement(By.linkText("пошук")).getText());
        driver.findElement(By.linkText("створити петицію")).click();
        assertTrue(isElementPresent(By.id("loginBIDBtn")));
        driver.findElement(By.linkText("рекомендації")).click();
        assertEquals("створити петицію", driver.findElement(By.linkText("створити петицію")).getText());
        assertEquals("положення", driver.findElement(By.linkText("положення")).getText());
        assertEquals("рекомендації", driver.findElement(By.linkText("рекомендації")).getText());
        assertEquals("петиції", driver.findElement(By.linkText("петиції")).getText());
        assertEquals("пошук", driver.findElement(By.linkText("пошук")).getText());
        driver.findElement(By.linkText("петиції")).click();
        assertEquals("Нові", driver.findElement(By.linkText("Нові")).getText());
        assertEquals("Усі", driver.findElement(By.linkText("Усі")).getText());
        assertEquals("Миколаївська Міська Рада", driver.getTitle());
        assertEquals("створити петицію", driver.findElement(By.linkText("створити петицію")).getText());
        assertEquals("положення", driver.findElement(By.linkText("положення")).getText());
        assertEquals("рекомендації", driver.findElement(By.linkText("рекомендації")).getText());
        assertEquals("петиції", driver.findElement(By.linkText("петиції")).getText());
        assertEquals("пошук", driver.findElement(By.linkText("пошук")).getText());
        driver.findElement(By.linkText("пошук")).click();
        assertTrue(isElementPresent(By.id("swords")));
        assertEquals("", driver.findElement(By.cssSelector("button.btn-w-search")).getText());
        driver.findElement(By.cssSelector("div.win-search-fon")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}