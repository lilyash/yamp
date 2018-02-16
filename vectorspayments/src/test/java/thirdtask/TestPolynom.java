package thirdtask;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import thirdtask.Exception.ErrorDataInput;
import thirdtask.Exception.ErrorDiscriminantSigment;
import thirdtask.Exception.InfinityException;

import static org.testng.Assert.*;

public class TestPolynom {
    @DataProvider
    public static Object[][] testGetSolveData(){
        return new Object[][]{
                {1, 0, -4, 2, -2},
                {1, -2, -3, 3, -1},
                {-1, -2, 15, -5, 3},
                {1, 12, 36, -6, -6},
                {1, 9, 0, 0, -9}
        };
    }

    @DataProvider
    public static Object[][] testGetSolveExcData(){
        return new Object[][]{
                {0, 0, 0},
                {1, 0, 9},
                {0, 0, 10},
                {2, 2, 9}
        };
    }

    @Test
    public void testConstructNoParametr(){
        Polinom obj = new Polinom(1, 3, -2.0);
        assertNotNull(obj);
        assertEquals(obj.getA(), 1.0);
        assertEquals(obj.getB(), 3.0);
        assertEquals(obj.getC(), -2.0);
    }

    @Test
    public void testConstruct(){
        Polinom obj = new Polinom(0.5, -6.75, -9.15);
        assertNotNull(obj);
        assertEquals(obj.getA(), 0.5);
        assertEquals(obj.getB(), -6.75);
        assertEquals(obj.getC(), -9.15);
    }

    @Test (dataProvider = "testGetSolveData")
    public void testGetSolve(double a, double b, double c, double x, double y) throws ErrorDiscriminantSigment, InfinityException, ErrorDataInput {
        Polinom obj = new Polinom(a, b, c);
        double[]solve;
        solve=obj.searchRoots();
        assertEquals(solve[0], x);
        assertEquals(solve[1], y);
    }

    @Test (dataProvider = "testGetSolveExcData", expectedExceptions = {ErrorDiscriminantSigment.class, InfinityException.class, ErrorDataInput.class})
    public void testGetSolve(double a, double b,double c) throws ErrorDiscriminantSigment, InfinityException, ErrorDataInput{
        Polinom obj = new Polinom(a,b,c);
        obj.searchRoots();
        fail();
    }
}
