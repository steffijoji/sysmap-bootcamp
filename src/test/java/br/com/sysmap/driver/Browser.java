package br.com.sysmap.driver;

import org.openqa.selenium.By;


public class Browser extends DriverFactory {

    public static boolean elementoExiste(By element) {
        return driver.findElements(element).size() != 0;
    }

    public static void digitar(By element, String valor) {
        driver.findElement(element).sendKeys(valor);
    }

    public static void clicar(By element) {
        driver.findElement(element).click();
    }

    public static void aguardar(Integer segundos) {
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
