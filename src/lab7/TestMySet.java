package lab7;

import laba6.Cars;
import laba6.Lada;
import laba6.Subaru;
import laba6.Porschee;
import lab8.WrongCostValueException;
import lab8.WrongCapacityValueException;
import lab8.WrondReduceOfFuelValueException;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class TestMySet extends Assert {
    MySet mySet;

    @Before
    public void before() {
        mySet = new MySet();
    }

    @Test
    public void testMySet() {
        assertEquals(0, mySet.size());
    }

    @Test(expected =WrondReduceOfFuelValueException.class)
    public void testAddWithException()
            throws WrongCostValueException, WrongCapacityValueException, WrondReduceOfFuelValueException {
        try {
            mySet.add(new Porschee(0, 3,5000));
        } catch (WrongCostValueException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testAdd()
            throws WrongCostValueException, WrongCapacityValueException, WrondReduceOfFuelValueException {
        mySet.add(new Subaru(2, 10,5800));
        assertEquals(1, mySet.size());
    }

    @Test
    public void testContains() throws WrondReduceOfFuelValueException {
        Cars cars;
        cars = new Porschee(3, 20,5000);
        mySet.add(cars);

        cars =
                new Lada(5, 20,5000);
        mySet.add(cars);
        assertTrue(mySet.contains(cars));
    }

    @Test
    public void testContainsClassCastException() {
        boolean b = mySet.contains(1);
        System.out.println(b);
    }
}