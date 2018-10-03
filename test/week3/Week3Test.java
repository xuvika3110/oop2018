package week3;
import org.junit.Test;
import java.beans.Transient;
import static org.junit.Assert.*;
public class Week3Test {
    @Test
    // TODO: Viết 5 testcase cho phương thức max()
    public void max() {
       Week3 test1 = new Week3();
       assertEquals(8,test1.max(4,8));
       assertEquals(20,test1.max(1,20));
       assertEquals(23,test1.max(7,23));
       assertEquals(6,test1.max(5,6));
       assertEquals(9,test1.max(9,2));
    }

    @Test
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    public void minOfArray() {
        Week3 test2 = new Week3();
        int[] array1 = {1,6,8};
        int[] array2 = {6,12};
        int[] array3 = {11,23,186};
        int[] array4 = {5,4,3,4};
        int[] array5 = {12,90,10,6};
        assertEquals(1,test2.minOfArray(array1));
        assertEquals(5,test2.minOfArray(array2));
        assertEquals(11,test2.minOfArray(array3));
        assertEquals(3,test2.minOfArray(array4));
        assertEquals(6,test2.minOfArray(array5));
    }

    @Test
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    public void calculateBMI() {
        Week3 test3 = new Week3();
        assertEquals("Thừa cân",test3.calculateBMI(80.00,1.50));
        assertEquals("Bình thường",test3.calculateBMI(60.00,1.72));
        assertEquals("Béo phì",test3.calculateBMI(80.00,1.55));
        assertEquals("Thiếu cân",test3.calculateBMI(28.00,1.60));
        assertEquals("Béo phì",test3.calculateBMI(54.76,1.23));
    }
}
