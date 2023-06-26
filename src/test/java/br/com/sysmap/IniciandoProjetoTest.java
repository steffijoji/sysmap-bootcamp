package br.com.sysmap;

import br.com.sysmap.driver.Browser;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IniciandoProjetoTest {

    @BeforeAll
    static void inicio() {
        Browser.abrirChrome("http://google.com");
    }

    @Test
    @Order(1)
    public void validarSite() {
        assertTrue(Browser.elementoExiste(By.xpath("//input[@value='Pesquisa Google']")));
        System.out.println("Validado que estamos no site Google.");
    }

    @Test
    @Order(2)
    public void pesquisar() {
        Browser.digitar(By.xpath("//*[@id='APjFqb']"),("facebook"));
        Browser.aguardar(2);
        Browser.clicar(By.xpath("//div[@class='lJ9FBc']//input[@class='gNO89b']"));
        Browser.aguardar(2);

        assertTrue(Browser.elementoExiste(By.xpath("//h3[text()='Facebook – entre ou cadastre-se']")));
        System.out.println("Validado que estamos na página de Pesquisa Google.");
    }

    @AfterAll
    public static void fim() {
        Browser.fecharChrome();
        System.out.println("Navegador Fechado.");
    }
}
