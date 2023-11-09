package TestDiscount;
import Discount.Discount;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.Random;
public class Tests {
    @BeforeClass
    public void testDiscount() {
        Discount discount = new Discount();
    }
    @Test(priority = 0, description = "Тест - 1. Тестовые данные : -1")
    public void testDiscountDataMinOne() {
        int result = (int) Discount.calculation(0);
        Assert.assertEquals("Некорректное количество баллов", "Некорректное количество баллов");
    }
    @Test(priority = 1, description = "Тест - 2. Тестовые данные : 0")
    public void testDiscountDataZero() {
        int result = (int) Discount.calculation(0);
        Assert.assertEquals(result, 1);
    }
    @Test(priority = 2, description = "Тест - 3. Тестовые даные: 1")
    public void testDiscountDataOne() {
        int result = (int) Discount.calculation(1);
        Assert.assertEquals(result, 1);
    }
    @Test(priority = 3, description = "Тест - 4. Тестовые даные: 99")
    public void testDiscountDataNineNine() {
        int result = (int) Discount.calculation(99);
        Assert.assertEquals(result, 1);
    }
    @Test(priority = 4, description = "Тест - 5. Тестовые даные: 100")
    public void testDiscountDataOneHundred() {
        int result = (int) Discount.calculation(100);
        Assert.assertEquals(result, 3);
    }
    @Test(priority = 5, description = "Тест - 6. Тестовые даные: 101")
    public void testDiscountDataOneHundredOne() {
        int result = (int) Discount.calculation(101);
        Assert.assertEquals(result, 3);
    }
    @Test(priority = 6, description = "Тест - 7. Тестовые даные: 199")
    public void testDiscountDataOneHundredNinetyNine() {
        int result = (int) Discount.calculation(199);
        Assert.assertEquals(result, 3);
    }
    @Test(priority = 7, description = "Тест - 8. Тестовые даные: 200")
    public void testDiscountDataTwoHundred() {
        int result = (int) Discount.calculation(200);
        Assert.assertEquals(result, 5);
    }
    @Test(priority = 8, description = "Тест - 9. Тестовые даные: 201")
    public void testDiscountDataTwoHundredOne() {
        int result = (int) Discount.calculation(201);
        Assert.assertEquals(result, 5);
    }
    @Test(priority = 9, description = "Тест - 10. Тестовые даные: 499")
    public void testDiscountDataFourHundredNinetyNine() {
        int result = (int) Discount.calculation(499);
        Assert.assertEquals(result, 5);
    }
    @Test(priority = 10, description = "Тест - 11. Тестовые даные: 500")
    public void testDiscountDataFiveHundred() {
        int result = (int) Discount.calculation(500);
        Assert.assertEquals(result, 10);
    }
    @Test(priority = 11, description = "Тест - 12. Тестовые даные: между 1-99")
    public void testDiscountDataRandomBetweenOneToNinetyNine() {
        Random random = new Random();
        int randomValue = 1 + random.nextInt(98);
        int result = (int) Discount.calculation(randomValue);
        Assert.assertEquals(result, 1);
    }
    @Test(priority = 12, description = "Тест - 13. Тестовые даные: между 101-199")
    public void testDiscountDataRandomBetweenOneHundredOneToOneHundredNinetyNine() {
        Random random = new Random();
        int randomValue = 101+ random.nextInt(98);
        int result = (int) Discount.calculation(randomValue);
        Assert.assertEquals(result, 3);
        }
    @Test(priority = 13, description = "Тест - 14. Тестовые даные: между 201-499")
    public void testDiscountDataRandomBetweenTwoHundredOneToFourHundredNinetyNine() {
        Random random = new Random();
        int randomValue = 201+ random.nextInt(198);
        int result = (int) Discount.calculation(randomValue);
        Assert.assertEquals(result, 5);
    }
    @Test(priority = 14, description = "Тест - 15. Тестовые даные: между 501-200 396")
    public void testDiscountDataRandomBetweenFiveHundredTo() {
        Random random = new Random();
        int randomValue = 501+ random.nextInt(199895);
        int result = (int) Discount.calculation(randomValue);
        Assert.assertEquals(result, 10);
    }

}
