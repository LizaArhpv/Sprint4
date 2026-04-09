package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuestionsSteps {
    WebDriver driver;
    WebDriverWait wait;
    public QuestionsSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

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
