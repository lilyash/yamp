package student.imit;


import com.company.Vector3DArray;
import com.company.Vector_3D;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class Vector3DArrayTest {

@Test
    public void constructSize(){
    Vector3DArray size = new Vector3DArray(15);
    assertNotNull(size);
    Vector_3D test = new Vector_3D();
    for(int i =0; i<size.getSize();i++){
        assertTrue(size.extract(i).equals(test));
    }
}

@Test
    public void search(){
    double [] coeff = {1,2,3};
    boolean find=false;
    Vector_3D [] arr = {
            new Vector_3D(1,2,3),
            new Vector_3D(0,-1,1),
            new Vector_3D(6,0,-3)
    };
    Vector3DArray array = new Vector3DArray(arr);
    assertNotNull(array);
    

    }
}
}

