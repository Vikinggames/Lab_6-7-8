package lab7;
import laba6.Cars;
import laba6.Subaru;
import laba6.Porschee;
import laba6.Lada;
import lab8.WrondReduceOfFuelValueException;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws WrondReduceOfFuelValueException {
        MySet myCar = new MySet();
        myCar.add(new Porschee(12, 3, 5000));
        myCar.add(new Lada(10, 4, 6000));
        myCar.add(new Subaru(11, 3, 5000));
        myCar.add(new Porschee(12, 3, 5000));
        myCar.add(new Lada(10, 4, 6000));
        myCar.add(new Subaru(11, 3, 5000));
        myCar.add(new Porschee(12, 3, 5000));
        myCar.add(new Lada(10, 4, 6000));
        myCar.add(new Subaru(11, 3, 5000));
        myCar.add(new Porschee(12, 3, 5000));
        myCar.add(new Lada(10, 4, 6000));
        myCar.add(new Subaru(11, 3, 5000));
        myCar.add(new Porschee(12, 3, 5000));
        myCar.add(new Lada(10, 4, 6000));
        myCar.add(new Subaru(11, 3, 5000));
        myCar.add(new Porschee(12, 3, 5000));

        Iterator<Cars> iterator = myCar.iterator();
        System.out.println(myCar.isEmpty());
        System.out.println(myCar.size());
        System.out.println(myCar.contains(new Subaru(11, 3, 5000)));
        myCar.remove(new Porschee(12, 3, 5000));
        System.out.println(myCar.remove((new Porschee(12, 3, 5000))));


        int x = 0;
        for (Cars cars : myCar) {
            System.out.println(iterator.next());
            x++;
        }

        System.out.println(x);
        System.out.println(myCar.containsAll(myCar));
    }
}

