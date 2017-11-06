package student.imit;

import com.company.Point_3D;
import com.company.Vector_3D;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
public class Vector_3Dtest {

@Test
public void constructTestWithoutParametrs() {
    Vector_3D test = new Vector_3D();
    assertNotNull(test);
    }

@Test
public void constructTestWithParametrs() {
    Vector_3D test = new Vector_3D(2.0, 5.0, 8.0);
    assertNotNull(test);
    assertTrue(test.getX() == 2.0);
    assertTrue(test.getY() == 5.0);
    assertTrue(test.getZ() == 8.0);
}
@Test
    public void constructTwoPoints(){
    Vector_3D test = new Vector_3D(new Point_3D(1.23, 2.34, 3.45), new Point_3D(4.56, 5.67, 6.78));
    assertNotNull(test);
    assertEquals(test.getX(), 3.3299999999999996);
    assertEquals(test.getY(), 3.33);
    assertEquals(test.getZ(), 3.33);

}

}