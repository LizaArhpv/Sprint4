import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import pages.MainPage;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class QuestionsPageTests extends BaseUITest {
    private By questionLocator;
    private String expectedQuestionText;
    private By answerLocator;
    private String expectedAnswerText;


    public QuestionsPageTests(By question,String questionText, By answer, String answerText) {
        this.questionLocator = question;
        this.expectedQuestionText = questionText;
        this.answerLocator = answer;
        this.expectedAnswerText = answerText;
    }


    @Parameterized.Parameters(name = "Тестовые данные: кнопка вопроса={0}, ожидаемый текст вопроса={1}, реальный текст ответа={2}, ожидаемый текст ответа={3}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {MainPage.QUESTION_COST, MainPage.QUESTION_COST_TEXT, MainPage.ANSWER_COST, MainPage.ANSWER_COST_TEXT},
                {MainPage.QUESTION_MULTIPLE_SCOOTERS , MainPage.QUESTION_MULTIPLE_SCOOTERS_TEXT, MainPage.ANSWER_MULTIPLE_SCOOTERS, MainPage.ANSWER_MULTIPLE_SCOOTERS_TEXT},
                {MainPage.QUESTION_RENTAL_PERIOD, MainPage.QUESTION_RENTAL_PERIOD_TEXT, MainPage.ANSWER_RENTAL_PERIOD, MainPage.ANSWER_RENTAL_PERIOD_TEXT},
                {MainPage.QUESTION_ORDER_TODAY, MainPage.QUESTION_ORDER_TODAY_TEXT, MainPage.ANSWER_ORDER_TODAY, MainPage.ANSWER_ORDER_TODAY_TEXT},
                {MainPage.QUESTION_ORDER_CHANGES, MainPage.QUESTION_ORDER_CHANGES_TEXT, MainPage.ANSWER_ORDER_CHANGES, MainPage.ANSWER_ORDER_CHANGES_TEXT},
                {MainPage.QUESTION_SCOOTER_CHARGING, MainPage.QUESTION_SCOOTER_CHARGING_TEXT, MainPage.ANSWER_SCOOTER_CHARGING, MainPage.ANSWER_SCOOTER_CHARGING_TEXT},
                {MainPage.QUESTION_ORDER_CANCELLATION, MainPage.QUESTION_ORDER_CANCELLATION_TEXT, MainPage.ANSWER_ORDER_CANCELLATION, MainPage.ANSWER_ORDER_CANCELLATION_TEXT},
                {MainPage.QUESTION_AREA_DELIVERY, MainPage.QUESTION_AREA_DELIVERY_TEXT, MainPage.ANSWER_AREA_DELIVERY, MainPage.ANSWER_AREA_DELIVERY_TEXT}
        });
    }

    @Test
    public void testQuestionAnswer() {
        MainPage questionsPage = new MainPage(driver);

        questionsPage.scrollToQuestions();

        String actualQuestionText = questionsPage.getQuestionText(questionLocator);
        assertEquals("Ошибка в тексте вопроса", expectedQuestionText, actualQuestionText);

        questionsPage.clickQuestion(questionLocator);

        String actualAnswerText = questionsPage.getAnswerText(answerLocator);
        assertEquals("Ошибка в тексте ответа", expectedAnswerText, actualAnswerText);
    }
}


