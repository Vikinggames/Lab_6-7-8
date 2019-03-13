package lab8;

import lab7.MySet;
import laba6.Porschee;

public class Main {
    public static void main(String[] args) throws WrondReduceOfFuelValueException {
        try {
            new MySet().add(new Porschee(3, 5,5000));
            System.out.println(":)");
        } catch (WrongCostValueException e) {

            System.out.println(e.getMessage());
        } catch (WrongCapacityValueException e) {

            System.out.println(e.getMessage());
        }

    }
}