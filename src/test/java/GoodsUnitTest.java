import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by rdzhao on 7/16/16.
 */
public class GoodsUnitTest {
    GoodsUnit goodsUnit;

    @Before
    public void setUp(){
        goodsUnit = new GoodsUnit();
    }

    @Test
    public void return_1_when_input_ITEM0000001() {
        assertThat(goodsUnit.GetAmount("ITEM0000001"), is(1));
    }

    @Test
    public void return_2_when_input_ITEM0000001_2() {
        assertThat(goodsUnit.GetAmount("ITEM0000001-2"), is(2));
    }

    @Test
    public void return_4_when_input_ITEM0000002_4() {
        assertThat(goodsUnit.GetAmount("ITEM0000002-4"), is(4));
    }

    @Test
    public void return_ITEM0000001_when_input_ITEM0000001() {
        assertThat(goodsUnit.getBarcode("ITEM0000001"), is("ITEM0000001"));

    }

    @Test
    public void return_ITEM0000002_when_input_ITEM0000002_2() {
        assertThat(goodsUnit.getBarcode("ITEM0000002-2"), is("ITEM0000002"));
    }



}