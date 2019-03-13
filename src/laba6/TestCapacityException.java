package laba6;

import lab8.WrongCapacityValueException;
import lab8.WrongCostValueException;
import lab8.WrondReduceOfFuelValueException;
import org.junit.Test;

public class TestCapacityException {
    @Test(expected = WrongCapacityValueException.class)
    public void testCapacityException() throws WrondReduceOfFuelValueException {
        Cars cars = new Porschee(5, 0,5000);
    }

    @Test(expected = WrongCostValueException.class)
    public void testCostException() throws WrondReduceOfFuelValueException {
        Cars cars= new Porschee(6, 5,-6000);
    }
}