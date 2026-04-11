package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    WebDriver driver;
    WebDriverWait wait;

public MainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    //Локаторы основных кнопок

    public static final By COOK_BUTTON = By.id("rcc-confirm-button");  //Локатор для кнопки "да все привыкли"
    public static final By HEADER_ORDER_BUTTON = By.className("Button_Button__ra12g"); // Локатор кнопки "Заказать" вверху страницы
    public static final By FOOTER_ORDER_BUTTON = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[5]/button"); // Локатор кнопки "Заказать" посередине страницы/ другого способа обозначить не нашла


    // Локаторы кнопок на вопросы в разделе «Вопросы о важном»

    public static final By QUESTION_COST = By.id("accordion__heading-0"); // Локатор для первого вопроса (стоимость)
    public static final By QUESTION_MULTIPLE_SCOOTERS = By.id("accordion__heading-1"); // Локатор для второго вопроса (несколько самокатов)
    public static final By QUESTION_RENTAL_PERIOD  = By.id("accordion__heading-2"); // Локатор для третьего вопроса (время аренды)
    public static final By QUESTION_ORDER_TODAY  = By.id("accordion__heading-3"); // Локатор для четвёртого вопроса (заказ сегодня)
    public static final By QUESTION_ORDER_CHANGES = By.id("accordion__heading-4"); // Локатор для пятого вопроса (изменения в заказе)
    public static final By QUESTION_SCOOTER_CHARGING  = By.id("accordion__heading-5"); // Локатор для шестого вопроса (зарядка самоката)
    public static final By QUESTION_ORDER_CANCELLATION  = By.id("accordion__heading-6"); // Локатор для седьмого вопроса (отмена заказа)
    public static final By QUESTION_AREA_DELIVERY  = By.id("accordion__heading-7"); // Локатор для восьмого вопроса (доставка в область)


    //Тексты вопросов в разделе "Вопросы о важном"

    public static final String QUESTION_COST_TEXT  = "Сколько это стоит? И как оплатить?"; // Текст вопроса о стоимости
    public static final String QUESTION_MULTIPLE_SCOOTERS_TEXT  = "Хочу сразу несколько самокатов! Так можно?"; // Текст вопроса о нескольких самокатах
    public static final String QUESTION_RENTAL_PERIOD_TEXT  = "Как рассчитывается время аренды?"; // Текст вопроса о времени аренды
    public static final String QUESTION_ORDER_TODAY_TEXT  = "Можно ли заказать самокат прямо на сегодня?"; // Текст вопроса о заказе сегодня
    public static final String QUESTION_ORDER_CHANGES_TEXT  = "Можно ли продлить заказ или вернуть самокат раньше?"; // Текст вопроса об изменениях в заказе
    public static final String QUESTION_SCOOTER_CHARGING_TEXT  = "Вы привозите зарядку вместе с самокатом?"; // Текст вопроса о зарядке самоката
    public static final String QUESTION_ORDER_CANCELLATION_TEXT  = "Можно ли отменить заказ?"; // Текст вопроса об отмене заказа
    public static final String QUESTION_AREA_DELIVERY_TEXT  = "Я жизу за МКАДом, привезёте?"; // Текст вопроса о доставке в область


// Локаторы для просмотра ответов в разделе «Вопросы о важном»

    public static final By ANSWER_COST  = By.id("accordion__panel-0"); // Локатор для ответа на вопрос о стоимости
    public static final By ANSWER_MULTIPLE_SCOOTERS  = By.id("accordion__panel-1"); // Локатор для ответа на вопрос о нескольких самокатах
    public static final By ANSWER_RENTAL_PERIOD  = By.id("accordion__panel-2"); // Локатор для ответа на вопрос о времени аренды
    public static final By ANSWER_ORDER_TODAY  = By.id("accordion__panel-3"); // Локатор для ответа на вопрос о заказе сегодня
    public static final By ANSWER_ORDER_CHANGES  = By.id("accordion__panel-4"); // Локатор для ответа на вопрос об изменениях в заказе
    public static final By ANSWER_SCOOTER_CHARGING  = By.id("accordion__panel-5"); // Локатор для ответа на вопрос о зарядке самоката
    public static final By ANSWER_ORDER_CANCELLATION  = By.id("accordion__panel-6"); // Локатор для ответа на вопрос об отмене заказа
    public static final By ANSWER_AREA_DELIVERY  = By.id("accordion__panel-7"); // Локатор для ответа на вопрос о доставке в область


// Тексты ответов в разделе «Вопросы о важном»

    public static final String ANSWER_COST_TEXT  = "Сутки — 400 рублей. Оплата курьеру — наличными или картой."; // Текст ответа на вопрос о стоимости
    public static final String ANSWER_MULTIPLE_SCOOTERS_TEXT  = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."; // Текст ответа на вопрос о нескольких самокатах
    public static final String ANSWER_RENTAL_PERIOD_TEXT  = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."; // Текст ответа на вопрос о времени аренды
    public static final String ANSWER_ORDER_TODAY_TEXT  = "Только начиная с завтрашнего дня. Но скоро станем расторопнее."; // Текст ответа на вопрос о заказе сегодня
    public static final String ANSWER_ORDER_CHANGES_TEXT  = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."; // Текст ответа на вопрос об изменениях в заказе
    public static final String ANSWER_SCOOTER_CHARGING_TEXT  = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."; // Текст ответа на вопрос о зарядке самоката
    public static final String ANSWER_ORDER_CANCELLATION_TEXT  = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."; // Текст ответа на вопрос об отмене заказа
    public static final String ANSWER_AREA_DELIVERY_TEXT  = "Да, обязательно. Всем самокатов! И Москве, и Московской области."; // Текст ответа на вопрос о доставке в область



        //Прокрутка до вопросов
        public void scrollToQuestions() {
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        }

        //Проверка текста вопроса
        public String getQuestionText(By questionLocator) {

            return driver.findElement(questionLocator).getText();
        }

        //Нажатие на вопрос
        public void clickQuestion(By questionLocator) {

            driver.findElement(questionLocator).click();
        }

        //Проверка текста ответа
        public String getAnswerText(By answerLocator) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(answerLocator));
            return driver.findElement(answerLocator).getText();
        }

    }