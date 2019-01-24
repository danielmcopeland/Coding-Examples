package test.java.com.monotonic.testing.com.monotonic.testing.m2;
import main.java.com.monotonic.testing.m2.Cafe;
import main.java.com.monotonic.testing.m2.Coffee;
import main.java.com.monotonic.testing.m2.CoffeeType;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CafeTest {

    public static final int ESPRESSO_BEANS = CoffeeType.Espresso.getRequiredBeans();
    public static final int LATTE_BEANS = CoffeeType.Latte.getRequiredBeans();
    public static final int NO_MILK = 0;
    public static final int NO_BEANS = 0;

    private Cafe cafe;

    @Before
    public void before() {
        cafe = new Cafe();
    }

    @Test
    public void canBrewEspresso() {
        withBeans();
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        Assert.assertEquals("Wrong CoffeeType", CoffeeType.Espresso, coffee.getType());
        Assert.assertEquals("Wrong amount of milk", NO_MILK, coffee.getMilk());
        Assert.assertEquals("Wrong number of beans", ESPRESSO_BEANS, coffee.getBeans());
    }

    @Test
    public void canBrewLatte() {
        withBeans();
        cafe.restockMilk(227);

        Coffee coffee = cafe.brew(CoffeeType.Latte);

        Assert.assertEquals("Wrong CoffeeType",CoffeeType.Latte, coffee.getType());
        Assert.assertEquals("Wrong amount of milk",227, coffee.getMilk());
        Assert.assertEquals("Wrong number of beans", LATTE_BEANS, coffee.getBeans());
    }

    @Test
    public void brewingEspressoConsumesBeans() {
        withBeans();

        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        Assert.assertEquals(NO_BEANS, cafe.getBeansInStock());
    }

    @Test(expected = IllegalStateException.class)
    public void lattesRequireMilk() {
        withBeans();

        Coffee coffee = cafe.brew(CoffeeType.Latte);
    }

    @Test(expected = IllegalArgumentException.class)
    public void mustRestockBeans() {
        cafe.restockBeans(NO_BEANS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void mustRestockMilk() {
        Cafe cafe = new Cafe();

        cafe.restockMilk(NO_MILK);
    }

    private void withBeans() {
        cafe.restockBeans(ESPRESSO_BEANS);
    }
}
