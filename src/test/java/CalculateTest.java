import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

public class CalculateTest {

    @Test
    public void testAdd(){
        long sum=5;
        Calculate calculate= new Calculate();
        long value=calculate.add(2,3);
        assertEquals(sum,value);

    }

    @Test
    public void testAddNegativeCase(){
        long sum=6;
        Calculate calculate= new Calculate();
        long value=calculate.add(2,3);
        assertNotEquals(sum,value);

    }

    @Test
    public void testSubtract(){
        long result=6;
        Calculate calculate= new Calculate();
        long value=calculate.subtract(9,3);
        assertEquals(result,value);

    }

    @Test
    public void testSubtractNegativeCase(){
        long result=0;
        long value=Calculate.subtract(9,3);
        assertNotEquals(result,value);

    }

    @Test
    public void testMultiply(){
        long product=6;
        long value=Calculate.multiply(2,3);
        assertEquals(product,value);

    }

    @Test
    public void testMultiplyNegativeCase(){
        long product=8;
        long value=Calculate.multiply(2,3);
        assertNotEquals(product,value);

    }

}
