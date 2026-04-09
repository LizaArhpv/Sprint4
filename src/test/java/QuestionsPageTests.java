import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import Pages.MainPage;
import Steps.QuestionsSteps;
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


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {MainPage.questionCost, MainPage.questionCostText, MainPage.answerCost, MainPage.answerCostText},
                {MainPage.questionMultipleScooters, MainPage.questionMultipleScootersText, MainPage.answerMultipleScooters, MainPage.answerMultipleScootersText},
                {MainPage.questionRentalPeriod, MainPage.questionRentalPeriodText, MainPage.answerRentalPeriod, MainPage.answerRentalPeriodText},
                {MainPage.questionOrderToday, MainPage.questionOrderTodayText, MainPage.answerOrderToday, MainPage.answerOrderTodayText},
                {MainPage.questionOrderChanges, MainPage.questionOrderChangesText, MainPage.answerOrderChanges, MainPage.answerOrderChangesText},
                {MainPage.questionScooterCharging, MainPage.questionScooterChargingText, MainPage.answerScooterCharging, MainPage.answerScooterChargingText},
                {MainPage.questionOrderCancellation, MainPage.questionOrderCancellationText, MainPage.answerOrderCancellation, MainPage.answerOrderCancellationText},
                {MainPage.questionAreaDelivery, MainPage.questionAreaDeliveryText, MainPage.answerAreaDelivery, MainPage.answerAreaDeliveryText}
        });
    }

    @Test
    public void testQuestionAnswer() {
        QuestionsSteps questionsPage = new QuestionsSteps(driver);

        questionsPage.scrollToQuestions();

        String actualQuestionText = questionsPage.getQuestionText(questionLocator);
        assertEquals("Ошибка в тексте вопроса", expectedQuestionText, actualQuestionText);

        questionsPage.clickQuestion(questionLocator);

        String actualAnswerText = questionsPage.getAnswerText(answerLocator);
        assertEquals("Ошибка в тексте ответа", expectedAnswerText, actualAnswerText);
    }
}


