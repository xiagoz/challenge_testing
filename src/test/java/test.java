import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Objects;
import java.util.Set;
public class test {

    public static void main(String[] args) throws InterruptedException {
        // ---- Setup inicial ----
        System.out.println("Inicio de las pruebas");
        String URL = "https://www.grupobancolombia.com/";
        String PATH = "C:\\testing-projects\\hypernovalabs\\com.challenge.testing\\src\\test\\resources\\chrome driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", PATH);
        WebDriver driver = new ChromeDriver();

        // ---- Comienzo de las pruebas ----
        driver.manage().window().maximize(); // apertura del navegador y mazimizacion de la ventana
        driver.get(URL); // inicio de la página
        Thread.sleep(5000);

        // Redirreccionamiento al apartado de "Personas"
        driver.findElement(By.xpath("//*[@id=\"layoutContainers\"]/div/div[2]/div/div[4]/section/div[3]/section/div/div/div/div[1]/p/a")).click();
        Thread.sleep(5000);
        //  -- Leer la ventana abierta 1
        String mainTab = driver.getWindowHandle();
        Set<String> arrayTabs = driver.getWindowHandles();

        for(String actual : arrayTabs) {
            if(!actual.equalsIgnoreCase(mainTab)) {
                    System.out.println("--Cambiamos de Tab--");
                    driver.switchTo().window(actual);
                }
        }

        // Botón de Solicitud de Productos
        driver.findElement(By.xpath("//*[@id=\"header-solicitud-productos\"]")).click();
        Thread.sleep(5000);

        // Apartado de Inversiones
        driver.findElement(By.xpath("//*[@id=\"filtro-inversiones\"]")).click();
        Thread.sleep(5000);

        // Flecha hacia abajo
        driver.findElement(By.xpath("//*[@id=\"mostrar-filtros\"]")).click();
        Thread.sleep(5000);

        // Opción Monto mínimo de $500.000
        driver.findElement(By.xpath("//*[@id=\"tag-catMontoMinimo500000 icon-cash\"]")).click();
        Thread.sleep(5000);

        // Conoce más del producto
        driver.findElement(By.xpath("//*[@id=\"filtrado-conoce-inversion-0\"]")).click();
        Thread.sleep(5000);

        //Documentos
        //*[@id="tabs"]/div/ul/li[4]/a
        driver.findElement(By.xpath("//*[@id=\"tabs\"]/div/ul/li[4]/a")).click();
        Thread.sleep(5000);

        //Reglamento Inversión virtual Bancolombia
        //*[@id="tab4"]/button/a
        driver.findElement(By.xpath("//*[@id=\"tab4\"]/button/a")).click();
        Thread.sleep(5000);

        //  -- Leer la ventana abierta 2
        String mainTab2 = driver.getWindowHandle();
        Set<String> arrayTabs2 = driver.getWindowHandles();

        for(String actual : arrayTabs2) {
            if(!actual.equalsIgnoreCase(mainTab2)) {
                System.out.println("--Cambiamos de Tab--");
                driver.switchTo().window(actual);
            }
        }

        // Validar el nombre del reglamento
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        String PDF = "https://www.bancolombia.com/wcm/connect/www.bancolombia.com-26918/182d05c8-d942-42ca-9b3d-ddd0fe8772fe/Reglamento+Inversi%C3%B3n+Virtual.pdf?MOD=AJPERES&CVID=nPHYsMT";
        if(Objects.equals(currentURL, PDF)) {
            System.out.println("El PDF es correcto!!");
        } else {
            System.out.println("El PDF es incorrecto. Algo salió mal!");
        }

        // -- Finalización de la prueba --
        System.out.println("Fin de las pruebas");
        Thread.sleep(10000);
        driver.quit();
    }
}
