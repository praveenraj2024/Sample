package org.hotel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelTask1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize()	;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Name = driver.findElement(By.id("email"));
		Name.sendKeys("s.praveenraj.msc@gmail.com");
		WebElement Pswd = driver.findElement(By.id("pass"));
	    Pswd.sendKeys("Praveen007@");
	    WebElement Login = driver.findElement(By.xpath("//button[text()='Login']"));
	    Login.click();
	    Thread.sleep(3000);
	    WebElement Welcome = driver.findElement(By.xpath("//a[@data-testid='username']"));
	    String printName = Welcome.getText();  
	    System.out.println(printName);
	    
	    WebElement State = driver.findElement(By.name("state"));
	    Select state1 = new Select(State);
	    state1.selectByValue("Tamil Nadu");
	    Thread.sleep(3000);

	    WebElement City1 = driver.findElement(By.id("city"));
	    Select City2 = new Select(City1);
	    City2.selectByVisibleText("Madurai");
	    
	    WebElement Room1 = driver.findElement(By.id("room_type"));
	    Select room = new Select(Room1);
	    room.selectByVisibleText("Standard");
	    room.selectByVisibleText("Deluxe");
	    room.selectByVisibleText("Suite");
	    room.selectByVisibleText("Luxury");
	    room.selectByVisibleText("Studio");
	    
	    WebElement Checkin = driver.findElement(By.name("check_in"));
	    Checkin.click();
	    WebElement Checkin2 = driver.findElement(By.xpath("//a[text()='20']"));
	    Checkin2.click();
	    
	    WebElement Checkout = driver.findElement(By.name("check_out"));
	    Checkout.click();
	    
	    WebElement Checkout2 = driver.findElement(By.xpath("//a[text()='25']"));
	    Checkout2.click();
	    
	    WebElement RoomNo = driver.findElement(By.id("no_rooms"));
	    Select RoomNo1 = new Select(RoomNo);
	    RoomNo1.selectByValue("2");
	    
	    WebElement adults = driver.findElement(By.id("no_adults"));
	    Select adults1 = new Select(adults);
	    adults1.selectByValue("2");

	    WebElement child = driver.findElement(By.id("no_child"));
	    child.sendKeys("2");
	    
	    WebElement frame1 = driver.findElement(By.id("hotelsearch_iframe"));
	    driver.switchTo().frame(frame1);
	    
	    WebElement search = driver.findElement(By.id("searchBtn"));
	    search.click();
	    
	    WebElement HotelText = driver.findElement(By.xpath("//h5[text()='Select Hotel']"));
	    String HotelText1 = HotelText.getText();
	    System.out.println(HotelText1);
	    
	    WebElement Hotelnametext = driver.findElement(By.xpath("//h5[text()='Le Royal Meridien Luxury']"));
	    String Hotelnametext1 = Hotelnametext.getText();
	    System.out.println(Hotelnametext1);
	    
	    WebElement pricetext = driver.findElement(By.xpath("(//strong[text()='$ 20,060'])[1]"));
	    String pricetext1 = pricetext.getText();
	    System.out.println(pricetext1);
	    
	    
	    WebElement continue1 = driver.findElement(By.xpath("(//a[text()='Continue'])[1]"));
	    continue1.click();
	    
	    Alert alert1 = driver.switchTo().alert();
	    alert1.accept();
	    
	    WebElement Myself = driver.findElement(By.id("own"));
	    Myself.click();
	    
	    WebElement salutation = driver.findElement(By.id("user_title"));
	    Select mrr = new Select(salutation);
	    mrr.selectByValue("Mr");
	    
	    WebElement firstname = driver.findElement(By.name("first_name"));
	    firstname.sendKeys("praveen");
	    
	    WebElement lastname = driver.findElement(By.name("last_name"));
	    lastname.sendKeys("raj");
	    
	    WebElement mobileNo = driver.findElement(By.name("phone"));
	    mobileNo.sendKeys("9876456798");
	    
	    WebElement emaill = driver.findElement(By.name("email"));
	    emaill.sendKeys("praveenraj1212@gmail.com");
	    
	    WebElement checkbox = driver.findElement(By.id("gst"));
	    checkbox.click();
	    
	    WebElement gstnum = driver.findElement(By.id("gst_registration"));
	    gstnum.sendKeys("9043592058");
	    
	    WebElement gstcom = driver.findElement(By.id("company_name"));
	    gstcom.sendKeys("Greens Tech OMR Branch");
	    
	    WebElement gstadd = driver.findElement(By.id("company_address"));
	    gstadd.sendKeys("Thoraipakkam");		
	    		
	    WebElement next = driver.findElement(By.id("step1next"));
	    next.click();
	    
	    WebElement latecheck = driver.findElement(By.id("late"));
	    latecheck.click();	  	
	    
	    WebElement otherreq = driver.findElement(By.id("other_request"));
	    otherreq.sendKeys("Wanted ac room");
	    
	    WebElement Next2 = driver.findElement(By.id("step2next"));
	    Next2.click();
	    
	    WebElement debit = driver.findElement(By.xpath("//h5[text()='Credit/Debit/ATM Card']"));
	    debit.click();
	    
	    WebElement paymentmethod = driver.findElement(By.id("payment_type"));
	    Select pay = new Select(paymentmethod);
	    pay.selectByValue("debit_card");
	    
	    WebElement cardtype = driver.findElement(By.id("card_type"));
	    Select card3 = new Select(cardtype);
	    card3.selectByValue("visa");
	    
	    WebElement cardno1 = driver.findElement(By.id("card_no"));
	    cardno1.sendKeys("5555555555552222");
	    
	    WebElement cardname1 = driver.findElement(By.id("card_name"));
	    cardname1.sendKeys("Praveenraj");
	    
	    WebElement cardmonth2 = driver.findElement(By.id("card_month"));
	    Select cardmonth4 = new Select(cardmonth2);
	    cardmonth4.selectByValue("01");
	    
	    WebElement cardyear5 = driver.findElement(By.id("card_year"));
	    Select cardyear6 = new Select(cardyear5);
	    cardyear6.selectByValue("2026");
	    
	    WebElement cvv = driver.findElement(By.id("cvv"));
	    cvv.sendKeys("678");
	    
	    WebElement submitbtn = driver.findElement(By.id("submitBtn"));
	    submitbtn.click();	    
	    
	    WebElement orderid = driver.findElement(By.xpath("//h2[@name='booking-code']"));
	    String order = orderid.getText();
	    String[] split = order.split(" ", 2);
	    System.out.println(split[0]);
	    System.out.println(split[1]);
	    
	    WebElement hotelname = driver.findElement(By.xpath("//p[text()='Hotel ']"));
	    String hotelname1 = hotelname.getText();
	    System.out.println(hotelname1);
	    
	    WebElement mybooking = driver.findElement(By.xpath("//button[text()='My Booking']"));
	    mybooking.click();
	    
	    WebElement bookings1 = driver.findElement(By.xpath("//h4[contains(text(),'Bookings')]"));
	    String bookings2 = bookings1.getText();
	    System.out.println(bookings2);
	    
	    
	    WebElement htlnme = driver.findElement(By.xpath("(//h5[text()='Le Royal Meridien Studio'])[1]"));
	    String htlnme1 = htlnme.getText();
	    System.out.println(htlnme1);
	    
	    WebElement orderid5 = driver.findElement(By.xpath("//span[text()='#KMVZN70819']"));
	    String orderid6 = orderid5.getText();
	    System.out.println(orderid6);
	    
	    
	    WebElement price11 = driver.findElement(By.xpath("(//strong[text()='Rs 20,060'])[1]"));
	    String price22 = price11.getText();
	    System.out.println(price22);
	    
	    WebElement edit = driver.findElement(By.xpath("(//button[text()='Edit'])[1]"));
	    edit.click();
	    
	    WebElement editdate = driver.findElement(By.name("check_in"));
	    editdate.click();
	    WebElement editdate1 = driver.findElement(By.xpath("//a[text()='19']"));
	    editdate1.click();
	    WebElement editdate2 = driver.findElement(By.xpath("//a[text()='24']"));
	    
	    editdate2.click();	 
	    
	    WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm']"));
	    confirm.click();	    
	    
	    WebElement bookingupdate = driver.findElement(By.xpath("//li[text()='Booking updated successfully']"));
	    String bookingupdate1 = bookingupdate.getText();
	    System.out.println(bookingupdate1);
	    
	    WebElement booking11 = driver.findElement(By.xpath("//div[@class='col-md-5']/h4"));
	    String booking12 = booking11.getText();
	    System.out.println(booking12);
	    
	    System.out.println(driver.findElement(By.xpath("(//div[@class='room-code']/span)[1]")).getText());
	    
	    WebElement htlnme6 = driver.findElement(By.xpath("(//h5[text()='Le Royal Meridien Studio'])[1]"));
	    String htlnme7 = htlnme6.getText();
	    System.out.println(htlnme7);
	    
	    WebElement price1 = driver.findElement(By.xpath("(//strong[text()='Rs 20,060'])[1]"));
	    String price2 = price1.getText();
	    System.out.println(price2);
	    
	    WebElement cancel1 = driver.findElement(By.xpath("(//a[text()='Cancel'])[1]"));
	    cancel1.click();
	    Alert alert7 = driver.switchTo().alert();
	    alert7.accept();
	    
	    WebElement canceltext = driver.findElement(By.xpath("//li[text()='Your booking cancelled successfully']"));
	    String canceltext2 = canceltext.getText();
	    System.out.println(canceltext2);
	    
	    
}
}