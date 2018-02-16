package thirdtask;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import thirdtask.Exception.ErrorSigmentFunction;

public class FunctionalTest {

    @Test
    public void testSumValue()throws ErrorSigmentFunction {
        LinearFunction obj = new LinearFunction(1, 5, 0, 10);
        AddSegment test = new AddSegment(obj.getBorderLeft(), obj.getBorderRight());
        assertEquals(test.getResultFunction(obj), 30.0);
    }

    @Test
    public void testSumValue1()throws ErrorSigmentFunction{
        SinFunction obj = new SinFunction(1, 5, 0, 10);
        AddSegment test = new AddSegment(obj.getBorderLeft(), obj.getBorderRight());
        assertEquals(test.getResultFunction(obj), Math.sin(50)+Math.sin(25));
    }

    @Test
    public void testSumValue2()throws ErrorSigmentFunction{
        DifficultFunction obj = new DifficultFunction(new LinearFunction(1, 5, 0, 10),
                new LinearFunction(1, 20, 0, 10), 0, 10);
        AddSegment test = new AddSegment(obj.getBorderLeft(), obj.getBorderRight());
        assertEquals(test.getResultFunction(obj), 1.15);
    }

    @Test
    public void testSumValue3()throws ErrorSigmentFunction{
        ExpFunction obj = new ExpFunction(1, 5, 0, 10);
        AddSegment test = new AddSegment(obj.getBorderLeft(), obj.getBorderRight());
        assertEquals(test.getResultFunction(obj), 16+Math.exp(10)+Math.exp(5));
    }

    @Test
    public void testIntegral()throws ErrorSigmentFunction{
        LinearFunction obj = new LinearFunction(1, 0, -5,20);
        Integral test = new Integral(0, 4, 0.0001);
        assertEquals(test.getResultFunction(obj), 8.0, 0.0009);
    }

    @Test
    public void testIntegral1()throws ErrorSigmentFunction{
        SinFunction obj = new SinFunction(1, 1, -10,100);
        Integral test = new Integral(0, 4, 0.0001);
        assertEquals(test.getResultFunction(obj), Math.cos(0)-Math.cos(4), 0.0009);
    }

    @Test
    public void testIntegral2()throws ErrorSigmentFunction{
        DifficultFunction obj = new DifficultFunction(new LinearFunction(1, 0, -100, 600),
                new LinearFunction(1,6,-100,500), -100,100);
        Integral test = new Integral(0, 4, 0.0001);
        assertEquals(test.getResultFunction(obj), 4+6*(Math.log(6)-Math.log(10)), 0.0009);
    }

    @Test
    public void testIntegral3()throws ErrorSigmentFunction{
        ExpFunction obj = new ExpFunction(1, 0,-10,10);
        Integral test = new Integral(0, 4, 0.0001);
        assertEquals(test.getResultFunction(obj), Math.exp(4)-1, 0.0009);
    }
}
