package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static pages.MainPage.FOOTER_ORDER_BUTTON;
import static pages.MainPage.HEADER_ORDER_BUTTON;


public class OrderProcessPage {
    WebDriver driver;
    WebDriverWait wait;

    public OrderProcessPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }


    // Локаторы для первой формы заказа

    private   By nameInput = By.xpath("//input[@placeholder='* Имя']"); // Локатор для поля "Имя"
    private  By surnameInput = By.xpath("//input[@placeholder='* Фамилия']"); // Локатор для поля "Фамилия"
    private  By addressInput = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']"); // Локатор для поля "Адрес"
    private By selectStation = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div/input"); // Локатор для поля "Станция метро"
    private By firstMetroStation = By.xpath("//div[contains(text(), 'Бульвар Рокоссовского')]"); // Локатор для выбора "Станция метро"
    private By phoneInput =  By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']"); // Локатор для поля "Телефон"
    private By nextButton = By.xpath("//button[normalize-space(.)='Далее']");// Локатор кнопки "Далее" внизу страницы


    // Локаторы для второй формы заказа

    private By deliveryDateInput = By.xpath("//input[@placeholder='* Когда привезти самокат']"); // Локатор для поля "Когда привезти"
    private  By selectDayOption = By.xpath("//div[contains(@class,'Dropdown-control')]");
    private  By oneDayOption = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[1]"); // Локатор для поля "Сутки"
    private  By blackPearlOption = By.id("black"); // Локатор кнопки "Черный жемчуг"
    private By commentInput = By.xpath("//input[@placeholder='Комментарий для курьера']"); // Локатор для поля "Комментарий для курьера"
    private  By orderButton = By.xpath("//div[contains(@class,'Order_Buttons')]//button[normalize-space(.)='Заказать']"); // Локатор кнопки "Заказать" в форме заказа
    private By confirmButton = By.xpath("//div[contains(@class,'Order_Modal')]//button[normalize-space(.)='Да']"); // Локатор кнопки "Да" в форме заказа


    // Локаторы всплывающего окна с сообщением об успешном создании заказа

    private By successMessage = By.xpath("//div[contains(@class,'Order_Modal')]//*[contains(normalize-space(.),'Заказ оформлен')]"); // Локатор всплывающего окна с сообщением об успешном создании заказа
    public static final String SUCCESS_MASSAGE_TEXT = "Заказ оформлен"; //


   // Выбор и нажатие на кнопку "Заказать" через true/false
    public void selectOrderButton(boolean isUpperButton) {
        By buttonLocator = isUpperButton ? HEADER_ORDER_BUTTON : FOOTER_ORDER_BUTTON;
        driver.findElement(buttonLocator).click();
    }


    //Заполнение первой страницы
    public void firstOrderPage(String name,String surname,String address,String phone){

        //Заполнение Имени
            driver.findElement(nameInput).sendKeys(name);

        //Заполнение Фамилии
            driver.findElement(surnameInput).sendKeys(surname);

        //Заполнение адреса
            driver.findElement(addressInput).sendKeys(address);

        //Выбор метро
            driver.findElement(selectStation).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(firstMetroStation));
            driver.findElement(firstMetroStation).click();

        //Заполнение номера телефона
            driver.findElement(phoneInput).sendKeys(phone);

        //Нажатие на кнопку Далее
            driver.findElement(nextButton).click();
        }


    //Заполнение второй страницы
    public  void secondOrderPage(String deliveryDate,String comment) {

         //Выбор даты
        driver.findElement(deliveryDateInput).sendKeys(deliveryDate);
        driver.findElement(deliveryDateInput).sendKeys(Keys.ENTER);

        //Выбор Суток
        driver.findElement(selectDayOption).click();
        driver.findElement(oneDayOption).click();

        //Выбор цвета
        driver.findElement(blackPearlOption).click();

     //Заполнение комментария
    driver.findElement(commentInput).sendKeys(comment);


    //Нажатие на кнопку Заказать
    driver.findElement(orderButton).click();
}

        //Нажатие на кнопку Да
        public  void clickConfirmButton() {
            driver.findElement(confirmButton).click();
        }

        //Проверка уведомления об успешном заказе
        public  String getSuccessMessageText() {
            wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
            return driver.findElement(successMessage).getText();
        }
    }