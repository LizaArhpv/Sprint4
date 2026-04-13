import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pages.MainPage;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class QuestionsPageTests extends BaseUITest {
    private int questionIndex;
    private String expectedQuestionText;
    private int answerIndex;
    private String expectedAnswerText;

    public QuestionsPageTests(int questionIndex, String questionText,int answerIndex, String answerText) {
        this.questionIndex = questionIndex;
        this.expectedQuestionText = questionText;
        this.answerIndex = answerIndex;
        this.expectedAnswerText = answerText;
    }

    @Parameterized.Parameters(name = "Тестовые данные: индекс вопроса={0}, ожидаемый текст вопроса={1}, реальный текст ответа={2}, ожидаемый текст ответа={3}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, MainPage.QUESTION_COST_TEXT,0, MainPage.ANSWER_COST_TEXT},
                {1, MainPage.QUESTION_MULTIPLE_SCOOTERS_TEXT,1, MainPage.ANSWER_MULTIPLE_SCOOTERS_TEXT},
                {2, MainPage.QUESTION_RENTAL_PERIOD_TEXT, 2, MainPage.ANSWER_RENTAL_PERIOD_TEXT},
                {3, MainPage.QUESTION_ORDER_TODAY_TEXT,3,  MainPage.ANSWER_ORDER_TODAY_TEXT},
                {4, MainPage.QUESTION_ORDER_CHANGES_TEXT,4,  MainPage.ANSWER_ORDER_CHANGES_TEXT},
                {5, MainPage.QUESTION_SCOOTER_CHARGING_TEXT, 5, MainPage.ANSWER_SCOOTER_CHARGING_TEXT},
                {6, MainPage.QUESTION_ORDER_CANCELLATION_TEXT, 6, MainPage.ANSWER_ORDER_CANCELLATION_TEXT},
                {7, MainPage.QUESTION_AREA_DELIVERY_TEXT,7,  MainPage.ANSWER_AREA_DELIVERY_TEXT}
        });
    }

    @Test
    public void testQuestionAnswer() {
        MainPage questionsPage = new MainPage(driver);

        questionsPage.scrollToQuestions();

        String actualQuestionText = questionsPage.getQuestionTextByIndex(questionIndex);
        assertEquals("Ошибка в тексте вопроса", expectedQuestionText, actualQuestionText);

        questionsPage.clickQuestionByIndex(questionIndex);

        String actualAnswerText = questionsPage.getAnswerTextByIndex(answerIndex);
        assertEquals("Ошибка в тексте ответа", expectedAnswerText, actualAnswerText);
    }
}