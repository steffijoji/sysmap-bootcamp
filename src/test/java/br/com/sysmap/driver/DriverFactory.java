package br.com.sysmap.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static final String DRIVER_CHROME = "C:\\drivers\\chromedriver_win32_114\\chromedriver.exe";
    public static WebDriver driver;

    public static void abrirChrome(String url) {
        System.setProperty("webdriver.chrome.driver", DRIVER_CHROME);
        driver = new ChromeDriver();
        driver.get(url);
        System.out.println("Navegador aberto.");
    }

    public static void fecharChrome() {
        driver.quit();
    }
}
