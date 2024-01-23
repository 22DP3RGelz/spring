package lv.rvt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rvt.Money;

public class MoneyTest {

    @Test
    public void testPlusMethod(){
        
        Money mon1 = new Money(1, 85);
        Money mon2 = new Money(2, 90);

        Money rezult1 = mon1.plus(mon2);

        assertEquals(4,rezult1.euros());
        assertEquals(74,rezult1.cents());
    }

    @Test
    public void testMinusMethod(){
        
        Money mon1 = new Money(1, 85);
        Money mon2 = new Money(2, 90);

        Money rezult1 = mon1.LessThen(mon2);

        assertEquals(4,rezult1.euros());
        assertEquals(74,rezult1.cents());
    }
}
