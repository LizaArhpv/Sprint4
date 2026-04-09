package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Pages.OrderProcessPage;


public class OrderProcessSteps {
    WebDriver driver;
    WebDriverWait wait;

    public OrderProcessSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    // Нажатие на кнопку "Заказать
    public  void clickOrderButton(By buttonLocator) {
        driver.findElement(buttonLocator).click();
    }

    //Заполнение Фамилии
    public  void enterName(String name) {
        driver.findElement(OrderProcessPage.nameInput).sendKeys(name);
    }

    //Заполнение Фамилии
    public  void enterSurname(String surname) {
        driver.findElement(OrderProcessPage.surnameInput).sendKeys(surname);
    }

    //Заполнение Адреса
    public  void enterAddress(String address) {
        driver.findElement(OrderProcessPage.addressInput).sendKeys(address);
    }

    //Выбор метро
    public  void selectMetroStation(By metroStation) {
        driver.findElement(OrderProcessPage.selectStation).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(metroStation));
        driver.findElement(metroStation).click();
    }

    //Заполнение номера телефона
    public  void enterPhone(String phone) {
        driver.findElement(OrderProcessPage.phoneInput).sendKeys(phone);
    }

    //Нажатие на кнопку Далее
    public  void clickNextButton() {
        driver.findElement(OrderProcessPage.nextButton).click();
    }

    //Выбор даты
    public  void enterDeliveryDate(String deliveryDate) {
        driver.findElement(OrderProcessPage.deliveryDateInput).sendKeys(deliveryDate);
        driver.findElement(OrderProcessPage.deliveryDateInput).sendKeys(Keys.ENTER);
    }

    //Выбор Суток
    public  void selectDayOption(By dayOption) {
        driver.findElement(OrderProcessPage.selectDayOption).click();
        driver.findElement(dayOption).click();
    }

    //Выбор цвета
    public  void selectColor(By color) {
        driver.findElement(color).click();
    }

    //Заполнение комментария
    public  void enterComment(String comment) {
        driver.findElement(OrderProcessPage.commentInput).sendKeys(comment);
    }

    //Нажатие на кнопку Заказать
    public  void clickOrderButton() {
        driver.findElement(OrderProcessPage.orderButton).click();
    }

    //Нажатие на кнопку Да
    public  void clickConfirmButton() {
        driver.findElement(OrderProcessPage.confirmButton).click();
    }

    //Проверка уведомления
    public  String getSuccessMessageText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(OrderProcessPage.successMessage));
        return driver.findElement(OrderProcessPage.successMessage).getText();
    }
}

