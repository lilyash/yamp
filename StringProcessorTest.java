import com.company.task2.BadStringCountException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.company.task2.StringProcessor.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class StringProcessorTest {
    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {"N", 3, "NNN"},
                {"qwe", 3, "qweqweqwe"},
                {"", 3, ""},
                {"", 0, ""}
        };
    }

    @DataProvider
    public static Object[][] countData() {
        return new Object[][]{
                {"a", "a", 1},
                {"aa", "a", 2},
                {"aaa", "aa", 2},
                {"", "aaa", 0},
                {"", "", 1},
                {"asdf", "", -1},  // throw , -1
                {"aaaa", "vvv", 0},
                {"aeqra facwda", "a", 4}
        };
    }

    @DataProvider
    public static Object[][] onetwothreeData() {
        return new Object[][]{
                {"", ""},
                {"567890", "567890"},
                {" 1 ", " Один "},
                {" 2", " Два"},
                {"1 2 3", "Один Два Три"}
        };
    }

    @DataProvider
    public static Object[][] changeWords() {
        return new Object[][]{
                {"", ""},
                {" qq ", " qq "},
                {"   123 erty 11 ", "   11 erty 123 "}
        };
    }
    @DataProvider
    public static Object[][] changeAge() {
        return new Object[][]{
                {"Васе 0x00000010 лет", "Васе 16 лет"},
                {"Васе 0x00000010 лет, Андрею 0x00000011 лет", "Васе 16 лет, Андрею 17 лет"},
                {"Васе 16 лет", "Васе 16 лет"}
        };
    }

    @Test(dataProvider = "data")
    public void testCopy(String str, int N, String expected) throws BadStringCountException {
        assertEquals(makeStringFromNString(str, N), expected);
    }

    @Test(expectedExceptions = {BadStringCountException.class})
    public void testCopyExc() throws BadStringCountException {
        makeStringFromNString("qwe", -6);
        fail();
    }

    @Test(dataProvider = "countData")
    public void testFind(String big, String small, int expected) {
        assertEquals(getNumberSecondStringInFirstString(big, small), expected);
    }

    @Test(dataProvider = "onetwothreeData")
    public void testChange(String source, String expected) {
        assertEquals(makeNewStringWithReplace(source), expected);
    }

    @Test
    public void testChange2() {
        StringBuilder  stringBuilder = new StringBuilder("1234567");
        StringBuilder temp = deleteEvenElement(stringBuilder);
        assertEquals(temp.toString(), "1357");
        temp = deleteEvenElement(stringBuilder);
        assertEquals(temp.toString(), "15");
        temp = deleteEvenElement(stringBuilder);
        assertEquals(temp.toString(), "1");
        temp = deleteEvenElement(stringBuilder);
        assertEquals(temp.toString(), "1");
    }

    @Test(dataProvider = "changeWords")
    public void testChange3(String source, String expected) {
        assertEquals( swapFirstAndLast(source), expected);
    }

    @Test(dataProvider = "changeAge")
    public void testChange4(String source, String expected) {
        assertEquals(changeHexToDecimal(source), expected);
    }

}