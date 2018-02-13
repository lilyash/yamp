
import com.company.Vector_3D;
import com.company.Vector_3DProcessor;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class Vector_3DProcessorTest {

@Test
public void testAdd(){
    Vector_3D test = new Vector_3D(25.23,32.52,36.36);
    Vector_3D test1 = new Vector_3D(25.23,32.52,36.36);
    Vector_3D testres = Vector_3DProcessor.add(test, test1);
    assertEquals(testres.getX(), 50.46);
    assertEquals(testres.getY(), 65.04);
    assertEquals(testres.getZ(), 72.72);
}

@Test
public void testDifference(){
    Vector_3D test = new Vector_3D(56.25,0.02,100.0);
    Vector_3D test1 = new Vector_3D(25.23,32.52,36.36);
    Vector_3D testres = Vector_3DProcessor.difference(test, test1);
    assertEquals(testres.getX(), 31.02);
    assertEquals(testres.getY(), -32.50);
    assertEquals(testres.getZ(), 63.64);
}

@Test
public void testScalar(){
    Vector_3D test = new Vector_3D(5,1,10);
    Vector_3D test1 = new Vector_3D(2,6,7);
    assertEquals(Vector_3DProcessor.scalarProduct(test,test1),86.0);
}

@Test
public void testVector(){
    Vector_3D test = new Vector_3D(8,4,3);
    Vector_3D test1 = new Vector_3D(9,3,6);
    assertEquals(Vector_3DProcessor.scalarProduct(test,test1),102.0);
}

@Test
public void testcheck(){
    Vector_3D test = new Vector_3D(0,4,0);
    Vector_3D test1 = new Vector_3D(9,0,6);
    boolean testres = Vector_3DProcessor.checkCollinear(test,test1);
}

}
