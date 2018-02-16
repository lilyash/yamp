package yamp.vectors;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Point_3Dtest {

@Test
    public void constructTestWithParametrs(){
    Point_3D test = new Point_3D(2.0,14.0,16.0);
    assertNotNull(test);
    assertTrue(test.getX()==2.0);
    assertTrue(test.getY()==14.0);
    assertTrue(test.getZ()==16.0);
}

@Test
    public void constructTestWithoutParametrs() {
    Point_3D test = new Point_3D();
    assertNotNull(test);
}

@Test
    public void testSetters(){
    Point_3D test = new Point_3D();
    test.setX(25.0);
    assertEquals(test.getX(),25.0);
    test.setY(10.0);
    assertEquals(test.getY(),10.0);
    test.setZ(95.55);
    assertEquals(test.getZ(),95.55);
    }

@Test
    public void testPoints(){
    Point_3D test = new Point_3D(2.0,14.0,16.0);
    Point_3D test2 = new Point_3D(25.0,-4.0,5.5);
    assertEquals(test, test);
    assertNotEquals(test, test2);
    }
}