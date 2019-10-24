import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeTest{
    // 成员变量webdriver，方便所有的方法都操作同一个driver，也就是同一个浏览器
    public WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        //创建 driver 对象
        WebDriver driver = new ChromeDriver();
        //打开项目地址
        driver.get("https://www.hupu.com/");
        //获取title
        String title = driver.getTitle();
        System.out.println(title);
        //点击登录
        driver.findElement(By.xpath("//a[@class=\"btn-login\"]")).click();
        //点击qq登录
        driver.findElement(By.xpath("//a[@class=\"login-qq pop-box\"]")).click();
        //点击账号密码登录
        //driver.findElement(By.xpath("//a[@id=\"switcher_plogin\"]")).click();
        //线程休眠，直接等待1000为1秒
        Thread.sleep(1000);
        //进入第一个iframe
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        //进入第二个iframe
        driver.switchTo().frame("ptlogin_iframe");
        //点击账号密码登录
        driver.findElement(By.xpath("//a[@id=\"switcher_plogin\"]")).click();

        //关闭浏览器
        //driver.close();
    }
}
