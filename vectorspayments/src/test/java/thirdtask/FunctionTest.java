package thirdtask;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import thirdtask.Exception.ErrorSigmentFunction;

import java.util.concurrent.ExecutionException;

public class FunctionTest {
    @DataProvider
    public static Object[][] testValueLFData(){
            return new Object[][]{
                    {1, 2, 0, 2},
                    {1, 2, 5, 7},
                    {0, 10, 34, 10},
                    {-5, 0, 2, -10},
                    {-4, -2, 1, -6},
                    {5, -3, -2, -13}
            };
    }

    @DataProvider
    public static Object[][] testValueSFData(){
        return new Object[][]{
                {0, 15, 2},
                {12, 0, 2},
                {12, 32, 0},
                {5, 3, 1},
                {5, 3, -1},
                {-1, 5, 2},
                {1, 2, 5}
        };
    }

    @DataProvider
    public static Object[][] testValueRLFData(){
        return new Object[][]{
                {1, 5, 0, 1, 4, 9},
                {0, 0, 45, 99, 144, 0},
                {3, 2, 1, 2, 2, 2},
                {10, 6, 2, 3, 3, 4},
                {5, 3, 2, -6, 5, 7}
        };
    }

    @DataProvider
    public static Object[][] testValueEFData(){
        return new Object[][]{
                {0, 5, 4464},
                {2, 5, 2},
                {1, 0, 1},
                {0,0, 7},
                {44, 56, 0}
        };
    }

    @DataProvider
    public static Object[][] testExcGetValueRLFData(){
        return new Object[][]{
                {1, 3, 1, -2, 2},
                {3, 56, 3, 24, -8},
                {12, 56, -4, -16, -4},
                {33, 666, -11, 99, 9}
        };
    }

    @DataProvider
    public static Object[][] testGetBordersRLFData(){
        return new Object[][]{
                {0.0, 0.0},
                {14.0, 78.0},
                {-10.0, 20.0},
                {1.0, 4.0},
                {-1.5, 4.445},
                {-90.75, 5.45},
        };
    }

    @Test
    public void testConstructLF(){
        LinearFunction obj = new LinearFunction(12, 5, 5, 7);
        assertNotNull(obj);
        assertEquals(obj.getA(), 12.0);
        assertEquals(obj.getB(), 5.0);
    }

    @Test
    public void testConstructSF(){
        SinFunction obj = new SinFunction(4, -8, -8, 14);
        assertNotNull(obj);
        assertEquals(obj.getA(), 4.0);
        assertEquals(obj.getB(), -8.0);
    }

    @Test
    public void testConstructDF()throws ArithmeticException{
        DifficultFunction obj = new DifficultFunction(new LinearFunction(2.0, -3.75, -4, 100),
                new LinearFunction(-0.12, 6.75,-4,100), -4,100);
        assertNotNull(obj);
        assertEquals(obj.getNumerator().getA(),2.0);
        assertEquals(obj.getNumerator().getB(), -3.75);
        assertEquals(obj.getDenominator().getA(), -0.12);
        assertEquals(obj.getDenominator().getB(), 6.75);
    }

    @Test
    public void testConstructEF(){
        ExpFunction obj = new ExpFunction(-6.53, -10, -100,100);
        assertNotNull(obj);
        assertEquals(obj.getA(), -6.53);
        assertEquals(obj.getB(), -10.0);
    }

    @Test (dataProvider = "testValueLFData")
    public void testValueLF(double a, double b, double x, double res)throws ErrorSigmentFunction {
        LinearFunction obj = new LinearFunction(a, b, -1000, 1000);
        assertEquals(obj.valueOf(x), res);
    }

    @Test (dataProvider = "testValueSFData")
    public void testValueSF(double a, double b, double x)throws ErrorSigmentFunction{
        SinFunction obj = new SinFunction(a, b, -1000, 1000);
        assertEquals(obj.valueOf(x), a*Math.sin(b*x));
    }

    @Test (dataProvider = "testValueRLFData")
    public void testValueRLF(double a, double b, double c, double d, double x, double res)
            throws ArithmeticException, ErrorSigmentFunction{
        DifficultFunction obj = new DifficultFunction(new LinearFunction(a, b, -1000, 1000),
                new LinearFunction(c,d, -1000, 1000), -1000, 1000);
        assertEquals(obj.valueOf(x), res);
    }

    @Test (dataProvider = "testValueEFData")
    public void testValueEF(double a, double b, double x)throws ErrorSigmentFunction{
        ExpFunction obj =new ExpFunction(a, b, -10000, 100000);
        assertEquals(obj.valueOf(x), a*Math.exp(x)+b);
    }

    @Test (expectedExceptions = ArithmeticException.class)
    public void testExcRLF()throws ArithmeticException{
        DifficultFunction obj=new DifficultFunction(new LinearFunction(1, 2, -1000, 1000),
                new LinearFunction(0,0,-1000,100000),-1000,1000000);
        fail();
    }

    @Test (expectedExceptions = ArithmeticException.class, dataProvider = "testExcGetValueRLFData")
    public void testExcGetValueRLF(double a, double b, double c, double d, double x)
            throws ErrorSigmentFunction, ErrorSigmentFunction{
        DifficultFunction obj= new DifficultFunction(new LinearFunction(a, b, -1000,1000),
                new LinearFunction(c, d, -1000,1000),-1000,100000 );
        obj.valueOf(x);
        fail();
    }

    @Test
    public void testGetBordersLF(){
        LinearFunction obj = new LinearFunction(4,5, 1, 15);
        assertEquals(obj.getBorderLeft(), 1.0);
        assertEquals(obj.getBorderRight(), 15.0);
    }

    @Test
    public void testGetBordersSF(){
        SinFunction obj = new SinFunction(11, 44, -8, 144);
        assertEquals(obj.getBorderLeft(), -8.0);
        assertEquals(obj.getBorderRight(), 144.0);
    }

    @Test (dataProvider = "testGetBordersRLFData")
    public void testGetBordersRLF(double granA, double granB)
            throws ArithmeticException{
        DifficultFunction obj = new DifficultFunction(new LinearFunction(10, 15,-1000,1000),
                new LinearFunction(1, 12,-1000,1000), granA, granB);
        assertEquals(obj.getBorderLeft(), granA);
        assertEquals(obj.getBorderRight(), granB);
    }

    @Test
    public void testGetBordersEF(){
        ExpFunction obj = new ExpFunction(10, 15, -89, 0);
        assertEquals(obj.getBorderLeft(), -89.0);
        assertEquals(obj.getBorderRight(), 0.0);
    }


    @Test (expectedExceptions = ErrorSigmentFunction.class)
    public void testBadXExceptionLF()throws ErrorSigmentFunction, ErrorSigmentFunction{
        LinearFunction obj = new LinearFunction(0,8,-1,1);
        obj.valueOf(100);
        fail();
    }

    @Test (expectedExceptions = ErrorSigmentFunction.class)
    public void testBadXExceptionSF()throws ErrorSigmentFunction, ErrorSigmentFunction{
        SinFunction obj = new SinFunction(10,78,-5,0);
        obj.valueOf(-88);
        fail();
    }

    @Test (expectedExceptions = ErrorSigmentFunction.class)
    public void testBadXExceptionEF()throws ErrorSigmentFunction, ErrorSigmentFunction{
        ExpFunction obj = new ExpFunction(2,1,-100,-99);
        obj.valueOf(0);
        fail();
    }

    @Test (expectedExceptions = ErrorSigmentFunction.class)
    public void testBadXExceptionRLF()throws ErrorSigmentFunction{
        DifficultFunction obj = new DifficultFunction(new LinearFunction(7,6,-1000,1000),
                new LinearFunction(8, 45,-1000,1000), -10,10);
        obj.valueOf(-100);
        fail();
    }
}