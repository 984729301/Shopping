import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by rdzhao on 7/15/16.
 */
public class ProductTest {
    @Test
    public void should_return_true_when_input_is_coca_and_coca() throws Exception {
        Product coca = new Product("ITEM000000", "可口可乐", "瓶", "食品", "碳酸饮料", 3.00);
        Product comparedCoca = new Product("ITEM000000", "可口可乐", "瓶", "食品", "碳酸饮料", 3.00);
        assertTrue(coca.equals(comparedCoca));
    }

    @Test
    public void should_return_false_when_input_is_coca_and_basketball() throws Exception {
        Product coca = new Product("ITEM000000", "可口可乐", "瓶", "食品", "碳酸饮料", 3.00);
        Product basketball = new Product("ITEM000001", "可口可乐", "瓶", "食品", "碳酸饮料", 3.00);
        assertFalse(coca.equals(basketball));
    }
}