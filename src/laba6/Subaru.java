package laba6;

import lab8.WrongCapacityValueException;
import lab8.WrongCostValueException;
import lab8.WrondReduceOfFuelValueException;

public class Subaru extends  Cars {
    public Subaru(int reduseFuel, int capacityEngine,int cost)
        throws WrondReduceOfFuelValueException, WrongCapacityValueException, WrongCostValueException{
        super(reduseFuel, capacityEngine,cost);

    }
}
