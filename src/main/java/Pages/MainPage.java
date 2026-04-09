package Pages;
import org.openqa.selenium.By;

public class MainPage {


    //Локаторы основных кнопок

    public static final By cookButton = By.xpath("/html/body/div/div/div[2]/div/div[2]/button");  //Локатор для кнопки "да все привыкли"
    public static final By headerOrderButton = By.className("Button_Button__ra12g"); // Локатор кнопки "Заказать" вверху страницы
    public static final By footerOrderButton = By.xpath("/html/body/div/div/div/div[4]/div[2]/div[5]/button"); // Локатор кнопки "Заказать" посередине страницы


    // Локаторы кнопок на вопросы в разделе «Вопросы о важном»

    public static final By questionCost = By.id("accordion__heading-0"); // Локатор для первого вопроса (стоимость)
    public static final By questionMultipleScooters = By.id("accordion__heading-1"); // Локатор для второго вопроса (несколько самокатов)
    public static final By questionRentalPeriod = By.id("accordion__heading-2"); // Локатор для третьего вопроса (время аренды)
    public static final By questionOrderToday = By.id("accordion__heading-3"); // Локатор для четвёртого вопроса (заказ сегодня)
    public static final By questionOrderChanges = By.id("accordion__heading-4"); // Локатор для пятого вопроса (изменения в заказе)
    public static final By questionScooterCharging = By.id("accordion__heading-5"); // Локатор для шестого вопроса (зарядка самоката)
    public static final By questionOrderCancellation = By.id("accordion__heading-6"); // Локатор для седьмого вопроса (отмена заказа)
    public static final By questionAreaDelivery = By.id("accordion__heading-7"); // Локатор для восьмого вопроса (доставка в область)


    //Тексты вопросов в разделе "Вопросы о важном"

    public static final String questionCostText = "Сколько это стоит? И как оплатить?"; // Текст вопроса о стоимости
    public static final String questionMultipleScootersText = "Хочу сразу несколько самокатов! Так можно?"; // Текст вопроса о нескольких самокатах
    public static final String questionRentalPeriodText = "Как рассчитывается время аренды?"; // Текст вопроса о времени аренды
    public static final String questionOrderTodayText = "Можно ли заказать самокат прямо на сегодня?"; // Текст вопроса о заказе сегодня
    public static final String questionOrderChangesText = "Можно ли продлить заказ или вернуть самокат раньше?"; // Текст вопроса об изменениях в заказе
    public static final String questionScooterChargingText = "Вы привозите зарядку вместе с самокатом?"; // Текст вопроса о зарядке самоката
    public static final String questionOrderCancellationText = "Можно ли отменить заказ?"; // Текст вопроса об отмене заказа
    public static final String questionAreaDeliveryText = "Я жизу за МКАДом, привезёте?"; // Текст вопроса о доставке в область


// Локаторы для просмотра ответов в разделе «Вопросы о важном»

    public static final By answerCost = By.id("accordion__panel-0"); // Локатор для ответа на вопрос о стоимости
    public static final By answerMultipleScooters = By.id("accordion__panel-1"); // Локатор для ответа на вопрос о нескольких самокатах
    public static final By answerRentalPeriod = By.id("accordion__panel-2"); // Локатор для ответа на вопрос о времени аренды
    public static final By answerOrderToday = By.id("accordion__panel-3"); // Локатор для ответа на вопрос о заказе сегодня
    public static final By answerOrderChanges = By.id("accordion__panel-4"); // Локатор для ответа на вопрос об изменениях в заказе
    public static final By answerScooterCharging = By.id("accordion__panel-5"); // Локатор для ответа на вопрос о зарядке самоката
    public static final By answerOrderCancellation = By.id("accordion__panel-6"); // Локатор для ответа на вопрос об отмене заказа
    public static final By answerAreaDelivery = By.id("accordion__panel-7"); // Локатор для ответа на вопрос о доставке в область


// Тексты ответов в разделе «Вопросы о важном»

    public static final String answerCostText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой."; // Текст ответа на вопрос о стоимости
    public static final String answerMultipleScootersText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."; // Текст ответа на вопрос о нескольких самокатах
    public static final String answerRentalPeriodText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."; // Текст ответа на вопрос о времени аренды
    public static final String answerOrderTodayText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее."; // Текст ответа на вопрос о заказе сегодня
    public static final String answerOrderChangesText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."; // Текст ответа на вопрос об изменениях в заказе
    public static final String answerScooterChargingText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."; // Текст ответа на вопрос о зарядке самоката
    public static final String answerOrderCancellationText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."; // Текст ответа на вопрос об отмене заказа
    public static final String answerAreaDeliveryText = "Да, обязательно. Всем самокатов! И Москве, и Московской области."; // Текст ответа на вопрос о доставке в область
}
