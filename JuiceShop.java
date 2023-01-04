import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JuiceShopprog {
	
	@Test
	public void method() throws InterruptedException  {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(" https://juice-shop.herokuapp.com/#/");
		
		driver.manage().window().maximize();
		
		//STEP 1
		
		By dispopup=By.xpath("//span[text()='Welcome to OWASP Juice Shop !']/../../div[2]/button[2]");
	    driver.findElement(dispopup).click();
		
		By cokiepopup=By.xpath("//*[text()='Me want it ']");
		driver.findElement(cokiepopup).click();
		
		By account=By.id("navbarAccount ");
		driver.findElement(account).click();
		
		By login=By.id("navbarLoginButton ");
		driver.findElement(login).click();

		By email=By.id("mat-form-field-label-5");
		driver.findElement(email).sendKeys("kikiegret@gmail.com");
		
		
		By password=By.id(" password");
		driver.findElement(password).sendKeys("rojaraja"+Keys.ENTER);
		
		By submit=By.id("loginButton");
		
		//Select items
		
		By carrotjuice=By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[2]/div/mat-card/div[2]/button");
		driver.findElement(carrotjuice).click();
		
		By applejuice=By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button");
		WebElement weAdd1 = driver.findElement(applejuice);
		Actions actionSave1 = new Actions(driver);
		actionSave1.scrollToElement(weAdd1).click(weAdd1);
		actionSave1.perform();
		
			
		driver.findElement(applejuice).click();
		
		
		
		//checkout
		
		By yourbasket=By.xpath("http://html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]");
		driver.findElement(yourbasket).click();
		Thread.sleep(3000);

		By cajuiceinc=By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-basket/mat-card/app-purchase-basket/mat-table/mat-row[2]/mat-cell[3]/button[2]");
		driver.findElement(cajuiceinc).click();
		Thread.sleep(3000);

		By appjuiinc=By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-basket/mat-card/app-purchase-basket/mat-table/mat-row[1]/mat-cell[3]/button[2]");
		driver.findElement(appjuiinc).click();
		Thread.sleep(3000);

		By checkout=By.id("checkoutButton");
		driver.findElement(checkout).click();

		//address
		
		By btnaddress=By.xpath("//span[text()='Add New Address'] ");
		driver.findElement(btnaddress).click();
		
		By country=By.xpath("//input[@data-placeholder='Please provide a country']" );
		driver.findElement(country).sendKeys("India");
		
		By name=By.xpath("//input[@data-placeholder='Please provide a name.'] ");
		driver.findElement(name).sendKeys("kiki");

		By phone=By.xpath("//input[@data-placeholder='Please provide a mobile number.']");
		driver.findElement(phone).sendKeys("7569842359");

		By zipcode=By.xpath("//input[@data-placeholder='Please provide a ZIP code.']");
		driver.findElement(zipcode).sendKeys("644655");

		By addr=By.xpath("//textarea[@data-placeholder='Please provide an address']");
		driver.findElement(addr).sendKeys("nskj,fnwkfn,mfkewnfk,mafsknw");

		By city=By.xpath("//input[@data-placeholder='Please provide a city.']");
		driver.findElement(city).sendKeys("Erode");

		By state=By.xpath("//input[@data-placeholder='Please provide a state.']");
		driver.findElement(state).sendKeys("TN");

        By sub=By.id("submitButton");
		driver.findElement(sub).click();

        //select address
        
        By selectradio=By.id("mat-radio-40 ");
		driver.findElement(selectradio).click();

        
        By addcontinue=By.xpath("//*[@id=\"card\"]/app-address/mat-card/button");
		driver.findElement(addcontinue).click();

   
        By delspeed=By.id("mat-radio-41");
		driver.findElement(delspeed).click();

        By con=By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-delivery-method/mat-card/div[4]/button[2]");
		driver.findElement(con).click();

		//ADD payment
        
        By addnewcarddrop=By.xpath("//*[@id=\"mat-expansion-panel-header-0\"]/span[1]/mat-panel-title");
		driver.findElement(addnewcarddrop).click();

        By cardname=By.id("mat-form-field-label-3");
		driver.findElement(cardname).sendKeys("Leela");

        By cardnum=By.id("mat-form-field-label-5");
		driver.findElement(cardnum).sendKeys("7894561237562526");

        By expmonth=By.id("mat-form-field-label-7");
		Select drp2 = new Select((WebElement) expmonth);

		driver.findElement(expmonth).sendKeys("7");

        By expyear=By.id("mat-form-field-label-9");
		driver.findElement(expyear).sendKeys("2077");

        By subbut=By.id("submitButton");
        
		driver.findElement(subbut).click();

        //order process with coupon code
        
        By addacoupon=By.xpath("//*[@id=\"mat-expansion-panel-header-1\"]/span[1]/mat-panel-title");
		driver.findElement(addacoupon).click();

        By coupon=By.id("mat-form-field-label-11");
		driver.findElement(addacoupon).sendKeys("7894561237");

        By redeem=By.id("applyCouponButton");
		driver.findElement(redeem).click();

        
        By validate=By.id("//div[@class='error ng-star-inserted']");	
		System.out.println(driver.findElement(validate).getText());

        //CHECKOUT
        
        By selectcardradio=By.id("mat-radio-44");
		driver.findElement( selectcardradio).click();

        By contin=By.xpath("//button[@aria-label='Proceed to review']");
		driver.findElement( contin).click();

        By placeorder=By.id("checkoutButton");
		driver.findElement(  placeorder).click();

		Thread.sleep(2000);

        //order confirmation
        
        
        By ordersummary=By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-order-completion/mat-card/div[1]/div/mat-card[1]/div/h1");
        driver.navigate().to("https://juice-shop.herokuapp.com/#/order-history");
		Thread.sleep(2000);
        By track=By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-order-completion/mat-card/div[1]/div/mat-card[1]/div/div/a");
		driver.findElement(  track).click();

		By logout = By.id("navbarLogoutButton");
		driver.findElement(logout).click();
		Thread.sleep(2000);

        //get window handle
		
		String newWindow=driver.getWindowHandle();
        
		//login process
		
	    driver.quit();

        
        
	}
	

}
