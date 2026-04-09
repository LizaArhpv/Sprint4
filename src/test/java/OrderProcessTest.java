import Steps.OrderProcessSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import Pages.MainPage;
import Pages.OrderProcessPage;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class OrderProcessTest extends BaseUITest{
    private By buttonLocator;
    private By metroStation ;
    private By color;
    private By dayOption;
    private String name ;
    private String surname ;
    private String address ;
    private String phone ;
    private String deliveryDate ;
    private String comment;


    public OrderProcessTest(By button, String name, String surname, String address, By metroStation, String phone, String deliveryDate, By dayOption, By color, String comment) {
        this.buttonLocator = button;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metroStation = metroStation;
        this.phone=phone;
        this.deliveryDate=deliveryDate;
        this.dayOption=dayOption;
        this.color=color;
        this.comment=comment;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {MainPage.headerOrderButton, "Иван", "Иванов","Москва", OrderProcessPage.firstMetroStation,"+79009990099","13.05.2026", OrderProcessPage.oneDayOption, OrderProcessPage.blackPearlOption, "Фух!"},
                {MainPage.headerOrderButton, "Саша", "Иванова","Москва", OrderProcessPage.secondMetroStation,"+79001110099","10.05.2026", OrderProcessPage.twoDaysOption, OrderProcessPage.grayDespairOption, "И побыстрее!"},
                {MainPage.footerOrderButton, "Иван", "Иванов","Москва", OrderProcessPage.firstMetroStation,"+79009990099","13.05.2026", OrderProcessPage.oneDayOption, OrderProcessPage.blackPearlOption, "Фух!"},
                {MainPage.footerOrderButton, "Саша", "Иванова","Москва", OrderProcessPage.secondMetroStation,"+79001110099","10.05.2026", OrderProcessPage.twoDaysOption, OrderProcessPage.grayDespairOption, "И побыстрее!"},
        });
    }


    @Test
    public void successOrderTest() {
        OrderProcessSteps orderProcessSteps = new OrderProcessSteps(driver);

        orderProcessSteps.clickOrderButton(buttonLocator);
        orderProcessSteps.enterName(name);
        orderProcessSteps.enterSurname(surname);
        orderProcessSteps.enterAddress(address);
        orderProcessSteps.selectMetroStation(metroStation);
        orderProcessSteps.enterPhone(phone);
        orderProcessSteps.clickNextButton();
        orderProcessSteps.enterDeliveryDate(deliveryDate);
        orderProcessSteps.selectDayOption(dayOption);
        orderProcessSteps.selectColor(color);
        orderProcessSteps.enterComment(comment);
        orderProcessSteps.clickOrderButton();
        orderProcessSteps.clickConfirmButton();
        String actualSuccessMassageText = orderProcessSteps.getSuccessMessageText();
        assertEquals("Заказ не оформлен", OrderProcessPage.successMessageText, actualSuccessMassageText);
    }


}
