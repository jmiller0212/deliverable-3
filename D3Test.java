// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class D3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void fUNWELCOME() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(1200, 800));
    assertThat(driver.findElement(By.cssSelector("i")).getText(), is("- Brian W. Kernighan"));
    assertThat(driver.findElement(By.cssSelector(".jumbotron > .lead")).getText(), is("Debugging is twice as hard as writing the code in the first place. Therefore, if you write the code as cleverly as possible, you are, by definition, not smart enough to debug it.\\\\n- Brian W. Kernighan"));
  }
  @Test
  public void dEFECT1FUNFIB() {
    driver.get("https://cs1632.appspot.com/fib");
    driver.manage().window().setSize(new Dimension(1200, 800));
    driver.findElement(By.name("value")).click();
    vars.put("num", js.executeScript("return 10"));
    driver.findElement(By.name("value")).sendKeys(vars.get("num").toString());
    driver.findElement(By.cssSelector("input:nth-child(2)")).click();
    vars.put("fib", js.executeScript("var num1=0, num2=1, sum; for(let i = 1; i < arguments[0]; i++) { sum=num1+num2; num1=num2; num2=sum; } return num2;", vars.get("num")));
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Fibonacci of vars.get(\"num\").toString() is ${fib}!"));
  }
  @Test
  public void dEFECT3FUNHELLOTRAILING() {
    driver.get("https://cs1632.appspot.com/hello");
    driver.manage().window().setSize(new Dimension(1200, 800));
    vars.put("\'trail\'", js.executeScript("return \'Jazzy/NotHandled\'"));
    driver.get("https://cs1632.appspot.com/hello/vars.get('trail').toString()");
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Hello CS1632, from vars.get(\"trail\").toString()!"));
  }
  @Test
  public void dEFECT2FUNFACT() {
    driver.get("https://cs1632.appspot.com/fact");
    driver.manage().window().setSize(new Dimension(1200, 800));
    vars.put("str", js.executeScript("return \"error\""));
    driver.findElement(By.name("value")).click();
    driver.findElement(By.name("value")).sendKeys(vars.get("str").toString());
    driver.findElement(By.cssSelector("input:nth-child(2)")).click();
    vars.put("fact", js.executeScript("let fact = 1; for(let i = 1; i <= arguments[0]; i++) { fact *= i; } return fact;", vars.get("str")));
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Factorial of vars.get(\"str\").toString() is ${fact}!"));
  }
  @Test
  public void fUNCATHY() {
    driver.get("https://cs1632.appspot.com/cathy");
    driver.manage().window().setSize(new Dimension(1200, 800));
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("ol > li:nth-child(1)"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("li:nth-child(1) > img"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("ol > li:nth-child(3)"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("li:nth-child(3) > img"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("ol > li:nth-child(5)"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("li:nth-child(5) > img"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("ol > li:nth-child(7)"));
      assert(elements.size() == 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("li:nth-child(7) > img"));
      assert(elements.size() == 0);
    }
  }
  @Test
  public void fUNFACT() {
    driver.get("https://cs1632.appspot.com/fact");
    driver.manage().window().setSize(new Dimension(1200, 800));
    vars.put("x", js.executeScript("return[1,2,3,4,5,6,7,8,9,10]"));
    ArrayList collectionX = (ArrayList) vars.get("x");
    for (int i = 0; i < collectionX.size() - 1; i++) {
      vars.put("num", collectionX.get(i));
      driver.findElement(By.name("value")).click();
      driver.findElement(By.name("value")).sendKeys(vars.get("num").toString());
      driver.findElement(By.cssSelector("input:nth-child(2)")).click();
      vars.put("fact", js.executeScript("let fact = 1; for(let i = 1; i <= arguments[0]; i++) { fact *= i; } return fact;", vars.get("num")));
      assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Factorial of vars.get(\"num\").toString() is ${fact}!"));
      driver.findElement(By.linkText("Factorial")).click();
    }
  }
  @Test
  public void fUNFIB() {
    driver.get("https://cs1632.appspot.com/fib");
    driver.manage().window().setSize(new Dimension(1200, 800));
    vars.put("x", js.executeScript("return[1,2,3,4,5,6,7,8,9,10]"));
    ArrayList collectionX = (ArrayList) vars.get("x");
    for (int i = 0; i < collectionX.size() - 1; i++) {
      vars.put("num", collectionX.get(i));
      driver.findElement(By.name("value")).click();
      driver.findElement(By.name("value")).sendKeys(vars.get("num").toString());
      driver.findElement(By.cssSelector("input:nth-child(2)")).click();
      vars.put("fib", js.executeScript("var num1=0, num2=1, sum; for(let i = 1; i < arguments[0]; i++) { sum=num1+num2; num1=num2; num2=sum; } return num2;", vars.get("num")));
      assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Fibonacci of vars.get(\"num\").toString() is ${fib}!"));
      driver.findElement(By.linkText("Fibonacci")).click();
    }
  }
  @Test
  public void fUNHELLO() {
    driver.get("https://cs1632.appspot.com/hello");
    driver.manage().window().setSize(new Dimension(1200, 800));
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Hello CS1632, from Dr. Ahn!"));
  }
  @Test
  public void fUNHELLOTRAILING() {
    driver.get("https://cs1632.appspot.com/hello");
    driver.manage().window().setSize(new Dimension(1200, 800));
    vars.put("trail", js.executeScript("return \'Jazzy\'"));
    driver.get("https://cs1632.appspot.com/hello/vars.get('trail').toString()");
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Hello CS1632, from vars.get(\"trail\").toString()!"));
  }
  @Test
  public void fUNINVALIDVALUE() {
    driver.get("https://cs1632.appspot.com/fib");
    driver.manage().window().setSize(new Dimension(1200, 800));
    driver.findElement(By.name("value")).click();
    driver.findElement(By.name("value")).sendKeys("-100");
    driver.findElement(By.cssSelector("input:nth-child(2)")).click();
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Fibonacci of -100 is 1!"));
    driver.findElement(By.linkText("Factorial")).click();
    driver.findElement(By.name("value")).click();
    driver.findElement(By.name("value")).sendKeys("-100");
    driver.findElement(By.cssSelector("input:nth-child(2)")).click();
    assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Factorial of -100 is 1!"));
  }
  @Test
  public void fUNLINKS() {
    driver.get("https://cs1632.appspot.com/");
    driver.manage().window().setSize(new Dimension(1200, 800));
    {
      WebElement element = driver.findElement(By.linkText("CS1632 D3 Home"));
      String attribute = element.getAttribute("href");
      vars.put("link1", attribute);
    }
    {
      WebElement element = driver.findElement(By.linkText("Factorial"));
      String attribute = element.getAttribute("href");
      vars.put("link2", attribute);
    }
    {
      WebElement element = driver.findElement(By.linkText("Fibonacci"));
      String attribute = element.getAttribute("href");
      vars.put("link3", attribute);
    }
    {
      WebElement element = driver.findElement(By.linkText("Hello"));
      String attribute = element.getAttribute("href");
      vars.put("link4", attribute);
    }
    {
      WebElement element = driver.findElement(By.linkText("Cathedral Pics"));
      String attribute = element.getAttribute("href");
      vars.put("link5", attribute);
    }
    vars.put("linkNames", js.executeScript("return[\"Factorial\",\"Fibonacci\",\"Hello\",\"Cathedral Pics\"]"));
    ArrayList collectionLinkNames = (ArrayList) vars.get("linkNames");
    for (int i = 0; i < collectionLinkNames.size() - 1; i++) {
      vars.put("name", collectionLinkNames.get(i));
      driver.findElement(By.linkText("vars.get('name').toString()")).click();
      assertEquals(vars.get("link1").toString(), "/");
      assertEquals(vars.get("link2").toString(), "/fact");
      assertEquals(vars.get("link3").toString(), "/fib");
      assertEquals(vars.get("link4").toString(), "/hello");
      assertEquals(vars.get("link5").toString(), "/cathy");
    }
  }
}
