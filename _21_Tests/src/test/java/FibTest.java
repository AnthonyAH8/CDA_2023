import org.example.Fib;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class FibTest {
    private Fib fib;

    @Test
    public void Fib_not_null(){
        fib = new Fib(1);
        List<Integer> fib_1 = fib.getFibSeries();
        Assert.assertEquals(fib_1.size(), 1);
    }

    @Test
    public void Fib_contains_0(){
        fib = new Fib(0);
        List<Integer> fib_1 = fib.getFibSeries();
        Assert.assertTrue(fib_1.contains(0));
    }

    @Test
    public void Fib_contains_3_with_range_6(){
        fib = new Fib(6);
        List<Integer> fib_1 = fib.getFibSeries();
        Assert.assertTrue(fib_1.contains(3));
    }

    @Test
    public void Fib_has_6_elements_with_range_6(){
        fib = new Fib(6);
        List<Integer> fib_1 = fib.getFibSeries();
        Assert.assertEquals(fib_1.size(), 6);
    }

    @Test
    public void Fib_has_not_4_with_range_6(){
        fib = new Fib(6);
        List<Integer> fib_1 = fib.getFibSeries();
        Assert.assertTrue(!fib_1.contains(4));
    }

    @Test
    public void Fib_has_0_1_1_2_3_5_with_range_6(){
        fib = new Fib(6);
        List <Integer> fib_1 = fib.getFibSeries();
        List <Integer> expected = Arrays.asList(0,1,1,2,3,5);
        Assert.assertEquals(expected, fib_1);
    }

    @Test
    public void Fib_is_asc(){
        fib = new Fib(6);
        List <Integer> fib_1 = fib.getFibSeries();
        List <Integer> fib_1_asc = new ArrayList<>(fib_1);
        Collections.sort(fib_1_asc);
        Assert.assertEquals(fib_1_asc, fib_1);
    }
}