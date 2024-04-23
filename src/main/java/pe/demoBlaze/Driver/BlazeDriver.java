package pe.demoBlaze.Driver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BlazeDriver {

    public enum NavegadorWeb {FIREFOX,CHROME};

    public static WebDriver getInstancia(NavegadorWeb navegador){
    if(navegador == NavegadorWeb.FIREFOX){
        return getFirefoxDriver();
    }
        return getChromeDriver();
    }
    private static WebDriver getChromeDriver(){
    WebDriverManager.chromedriver().setup();
    return aplicarConfiguracionComun(new ChromeDriver());
    }

    private static WebDriver getFirefoxDriver(){
    WebDriverManager.firefoxdriver().setup();
    return aplicarConfiguracionComun(new FirefoxDriver());
    }

    private static WebDriver aplicarConfiguracionComun(WebDriver driver){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }

}
