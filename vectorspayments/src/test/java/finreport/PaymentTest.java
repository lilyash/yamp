package finreport;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class PaymentTest {
    @DataProvider
    public static Object[][] testConstructData(){
        return new Object[][]{
                {"Ivanov Ivan Ivanovich", 29, 2, 2020, 4},
                {"Ivanov Ivan Ivanovich", 31, 1, 20, 40},
                {"Ivanov Ivan Ivanovich", 30, 6, 20, 4}
        };
    }

    @DataProvider
    public static Object[][] testConstructExc(){
        return new Object[][]{
                {"Ivanov Ivan Ivanovich", -5, 1, 2, 4},
                {"Ivanov Ivan Ivanovich", 4, -2, 1, 4},
                {"Ivanov Ivan Ivanovich", 4, 5, -8, 1},
                {"Ivanov Ivan Ivanovich", 31, 2, 2000, 4},
                {"Ivanov Ivan Ivanovich", 29, 2, 2017, 78},
                {"Ivanov Ivan Ivanovich", 54, 1, 1, 44},
                {"Ivanov Ivan Ivanovich", 14, 54, 45, 4},
                {"Ivanov Ivan Ivanovich", 31, 4, 45, 4},
                {"Ivanov Ivan Ivanovich", 32, 1, 45, 4},
                {"Ivanov Ivan Ivanovich", 29, 2, 2015, 4}
        };
    }

    @DataProvider
    public static Object[][] testSetDayExc(){
        return new Object[][]{
                {45},
                {29},
                {30},
                {0},
                {-5}
        };
    }

    @DataProvider
    public static Object[][] testSetMonthExc(){
        return new Object[][]{
                {13},
                {2},
                {0},
                {-5}
        };
    }

    @DataProvider
    public static Object[][] testSetYearExc(){
        return new Object[][]{
                {0},
                {2017},
                {-32}
        };
    }

    @DataProvider
    public static Object[][] testSetAmountExc(){
        return new Object[][]{
                {0},
                {-100}
        };
    }

    @Test (dataProvider = "testConstructData")
    public void testConstruct(String name, int day, int month, int year, int amount) throws BadDateException {
        Payment testObj = new Payment(name, day, month, year, amount);
        assertNotNull(testObj);
        assertEquals(testObj.getDay(), day);
        assertEquals(testObj.getMonth(), month);
        assertEquals(testObj.getYear(), year);
        assertEquals(testObj.getAmount(), amount);
        assertTrue(testObj.getName().equals(name));
    }

    @Test (dataProvider ="testConstructExc", expectedExceptions = {BadDateException.class})
    public void testConstructException(String name, int day, int month, int year, int amount)throws BadDateException {
        Payment testObj = new Payment(name, day, month, year, amount);
        fail();
    }

    @Test
    public void testSetName()throws BadDateException{
        Payment testObj = new Payment("Ivanov Ivan Ivanovich", 12, 2, 2000, 40);
        testObj.setName("Petrov Petr Petrovich");
        assertTrue(testObj.getName().equals("Petrov Petr Petrovich"));
    }

    @Test
    public void testSetDay()throws  BadDateException{
        Payment testObj = new Payment("Ivanov Ivan Ivanovich", 12, 2, 2000, 40);
        testObj.setDay(2);
        assertEquals(testObj.getDay(), 2);
    }

    @Test (dataProvider = "testSetDayExc", expectedExceptions = {BadDateException.class})
    public void testSetDayExc(int day)throws  BadDateException{
        Payment testObj = new Payment("Ivanov Ivan Ivanovich", 20, 2, 2001, 40);
        testObj.setDay(day);
        fail();
    }

    @Test
    public void testSetMonth()throws BadDateException{
        Payment testObj = new Payment("Ivanov Ivan Ivanovich", 30, 3, 2000, 40);
        testObj.setMonth(5);
        assertEquals(testObj.getMonth(), 5);
    }

    @Test (dataProvider = "testSetMonthExc", expectedExceptions = {BadDateException.class})
    public void testSetMonthExc(int month)throws BadDateException{
        Payment testObj = new Payment("Ivanov Ivan Ivanovich", 31, 3, 2009, 40);
        testObj.setMonth(month);
        fail();
    }

    @Test
    public void testSetYear()throws BadDateException{
        Payment testObj = new Payment("Ivanov Ivan Ivanovich", 12, 2, 2000, 40);
        testObj.setYear(10);
        assertEquals(testObj.getYear(), 10);
    }

    @Test (dataProvider = "testSetYearExc", expectedExceptions = {BadDateException.class})
    public void testSetYearExc(int year)throws BadDateException{
        Payment testObj = new Payment("Ivanov Ivan Ivanovich", 29, 2, 2000, 40);
        testObj.setYear(year);
        fail();
    }

    @Test
    public void testSetAmount()throws BadDateException{
        Payment testObj = new Payment("Ivanov Ivan Ivanovich", 12, 2, 2000, 40);
        testObj.setAmount(100);
        assertEquals(testObj.getAmount(), 100);
    }

    @Test (dataProvider = "testSetAmountExc", expectedExceptions = {BadDateException.class})
    public void testSetAmountExc(int amount)throws BadDateException{
        Payment testObj = new Payment("Ivanov Ivan Ivanovich", 12, 2, 2000, 40);
        testObj.setAmount(amount);
        fail();
    }

    @Test
    public void testEquals()throws BadDateException{
        Payment testObj = new Payment("Ivanov Ivan Ivanovich", 12, 2, 2000, 40);
        Payment testObj1 = new Payment("Ivanov Ivan Ivanovich", 12, 2, 2000, 40);
        Payment testObj2 = new Payment("Ivano Ivan Ivanovh", 1, 2, 2000, 40);
        assertTrue(testObj.equals(testObj1));
        assertFalse(testObj2.equals(testObj));
    }

    @Test
    public void testToString()throws BadDateException{
        Payment testObj = new Payment("Ivanov Ivan Ivanovich", 12, 2, 2000, 40);
        assertTrue(testObj.toString().equals("Плательщик: \"Ivanov Ivan Ivanovich\" дата: 12.2.2000 сумма: 0 руб."
                + " 40 коп."));
    }
}