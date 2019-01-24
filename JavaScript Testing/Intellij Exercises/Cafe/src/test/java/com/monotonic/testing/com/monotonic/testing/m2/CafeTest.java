package test.java.com.monotonic.testing.com.monotonic.testing.m2;
import main.java.com.monotonic.testing.m2.Cafe;
import main.java.com.monotonic.testing.m2.Coffee;
import main.java.com.monotonic.testing.m2.CoffeeType;


import jdk.swing.interop.SwingInterOpUtils;
import org.junit.Assert;
import org.junit.Test;

public class CafeTest {
    // can brew espresso
    @Test
    public void canBrewEspresso() {
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        Assert.assertEquals("Wrong CoffeeType", CoffeeType.Espresso, coffee.getType());
        Assert.assertEquals("Wrong amount of milk",0, coffee.getMilk());
        Assert.assertEquals("Wrong number of beans", 7, coffee.getBeans());

    }
    @Test
    public void canBrewLatte() {

        Cafe cafe = new Cafe();
        cafe.restockBeans(7);
        cafe.restockMilk(227);

        Coffee coffee = cafe.brew(CoffeeType.Latte);

        Assert.assertEquals(CoffeeType.Latte, coffee.getType());
        Assert.assertEquals(227, coffee.getMilk());
        Assert.assertEquals(7, coffee.getBeans());
    }
    @Test
    public void brewingEspressoConsumesBeans() {
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);

        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        Assert.assertEquals(0, cafe.getBeansInStock());
    }
    @Test(expected = IllegalStateException.class)
    public void lattesRequireMilk() {
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);

        Coffee coffee = cafe.brew(CoffeeType.Latte);


    }
}
