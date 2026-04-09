package Pages;

import org.openqa.selenium.By;

public class OrderProcessPage {

    // Локаторы для первой формы заказа

    public static final By nameInput = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/input"); // Локатор для поля "Имя"
    public static final By surnameInput = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/input"); // Локатор для поля "Фамилия"
    public static final By addressInput = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/input"); // Локатор для поля "Адрес"
    public static final By selectStation = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div/input"); // Локатор для поля "Станция метро"
    public static final By firstMetroStation = By.xpath("//div[contains(text(), 'Бульвар Рокоссовского')]"); // Локатор для выбора "Станция метро"
    public static final By secondMetroStation = By.xpath("//div[contains(text(), 'Черкизовская')]"); // Локатор для поля "Станция метро"
    public static final By phoneInput = By.xpath("/html/body/div/div/div[2]/div[2]/div[5]/input"); // Локатор для поля "Телефон"
    public static final By nextButton = By.xpath("/html/body/div/div/div[2]/div[3]/button"); // Локатор кнопки "Далее" внизу страницы

    // Локаторы для второй формы заказа

    public static final By deliveryDateInput = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/input"); // Локатор для поля "Когда привезти"
    public static final By selectDayOption = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div[1]");
    public static final By oneDayOption = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[1]"); // Локатор для поля "Сутки"
    public static final By twoDaysOption = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[2]"); // Локатор кнопки "Сутки"
    public static final By blackPearlOption = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/label[1]/input"); // Локатор кнопки "Черный жемчуг"
    public static final By grayDespairOption = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/label[2]/input"); // Локатор кнопки "Серая безысходность"
    public static final By commentInput = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/input"); // Локатор для поля "Комментарий для курьера"
    public static final By orderButton = By.xpath("/html/body/div/div/div[2]/div[3]/button[2]"); // Локатор кнопки "Заказать" в форме заказа
    public static final By confirmButton = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]"); // Локатор кнопки "Да" в форме заказа

    // Локаторы всплывающего окна с сообщением об успешном создании заказа

    public static final By successMessage = By.xpath("/html/body/div/div/div[2]/div[5]/div[1]/text()"); // Локатор всплывающего окна с сообщением об успешном создании заказа
    public static final String successMessageText = "Заказ оформлен"; //
}

