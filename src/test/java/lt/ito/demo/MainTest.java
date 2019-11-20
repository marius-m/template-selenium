package lt.ito.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import static junit.framework.TestCase.assertTrue;

public class MainTest {

    private static WebDriver wd;

    @Before
    public void setUp() throws Exception {
        wd = new ChromeDriver(
                new ChromeDriverService.Builder()
                        .usingDriverExecutable(Paths.get("src/test/resources/chromedriver").toFile())
                        .build()
        );
//        final File driverPathAsFile = Paths.get("src/test/resources/geckodriver").toFile();
//        System.setProperty("webdriver.firefox.marionette",driverPathAsFile.getAbsolutePath());
//        wd = new FirefoxDriver();
    }

    @After
    public void tearDown() throws Exception {
        wd.quit();
    }

    @Test
    public void valid() throws Exception {
        wd.get("https://github.com/edvin/tornadofx-guide/blob/master/part3/Snippets.md");
        Thread.sleep(1000L);
        assertTrue(false);
    }
}
