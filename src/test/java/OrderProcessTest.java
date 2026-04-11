import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pages.OrderProcessPage;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class OrderProcessTest extends BaseUITest{

    private boolean isUpperButton;
    private String name ;
    private String surname ;
    private String address ;
    private String phone ;
    private String deliveryDate ;
    private String comment;


    public OrderProcessTest(boolean isUpperButton, String name, String surname, String address, String phone, String deliveryDate, String comment) {
        this.isUpperButton = isUpperButton;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone=phone;
        this.deliveryDate=deliveryDate;
        this.comment=comment;
    }

    @Parameterized.Parameters(name = "Тестовые данные: кнопка Заказать={0}, имя={1}, фамилия={2}, город={3}, телефон={4}, дата={5}, комментарий={6}") //Аннотация
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {true, "Иван", "Иванов","Москва","+79009990099","13.05.2026", "Фух!"},
                {true, "Саша", "Иванова","Москва","+79001110099","10.05.2026",  "И побыстрее!"},
                {false, "Иван", "Иванов","Москва","+79009990099","13.05.2026", "Фух!"},
                {false, "Саша", "Иванова","Москва", "+79001110099","10.05.2026",  "И побыстрее!"},
        });
    }


    @Test
    public void successOrderTest() {
        OrderProcessPage orderProcessPage = new OrderProcessPage(driver);
        //Объедененные методы
        orderProcessPage.selectOrderButton(isUpperButton);
        orderProcessPage.firstOrderPage(name,surname,address,phone);
        orderProcessPage.secondOrderPage(deliveryDate,comment);
        orderProcessPage.clickConfirmButton();

        String actualSuccessMassageText = orderProcessPage.getSuccessMessageText();
        assertEquals("Заказ не оформлен", OrderProcessPage.SUCCESS_MASSAGE_TEXT, actualSuccessMassageText);
    }


}
