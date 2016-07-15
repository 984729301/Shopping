import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by rdzhao on 7/14/16.
 */
public class shoppingTest {
    Shopping shopping;

    @Before
    public void setUp() throws Exception {
        shopping = new Shopping();
    }

    @Test
    public void should_return_1_when_input_is_ITEM00000() {
        assertThat(shopping.getNumberOfProduct("ITEM00000"), is(1));
    }

    @Test
    public void should_return_2_when_input_is_ITEM00000_dash_2() {
        assertThat(shopping.getNumberOfProduct("ITEM00000-2"), is(2));
    }

    @Test
    public void should_return_3_when_input_is_ITEM00000_dash_3() {
        assertThat(shopping.getNumberOfProduct("ITEM00000-3"), is(3));
    }

    @Test
    public void should_return_ITEM00000_when_input_is_ITEM00000() {
        assertThat(shopping.getBarcodeOfProduct("ITEM00000"), is("ITEM00000"));
    }

    @Test
    public void should_return_ITEM00000_when_input_is_ITEM00001() {
        assertThat(shopping.getBarcodeOfProduct("ITEM00001"), is("ITEM00001"));
    }

    @Test
    public void should_return_ITEM00000_when_input_is_ITEM00000_dash_3() {
        assertThat(shopping.getBarcodeOfProduct("ITEM00000-3"), is("ITEM00000"));
    }

    @Test
    public void should_return_3_dot_00_when_input_is_ITEM00000() {
        assertThat(shopping.getMoneyOfProduct("ITEM000000"), is(3.00));
    }

    @Test
    public void should_return_9_dot_00_when_input_is_ITEM00000_dash_3() {
        assertThat(shopping.getMoneyOfProduct("ITEM000000-3"), is(9.00));
    }


}
