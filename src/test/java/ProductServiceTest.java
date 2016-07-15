import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 * Created by rdzhao on 7/15/16.
 */
public class ProductServiceTest {
    ProductService productService;
    @Before
    public void setUp() throws Exception {
        productService = new ProductService();
    }

    @Test
    public void should_return_coca_when_input_is_ITEM00000() {
        Product coca = new Product("ITEM000000","可口可乐","瓶","食品","碳酸饮料",3.00);
        assertThat(productService.getProductByBarCode("ITEM000000"), is(coca));
    }

    @Test
    public void should_return_basketball_when_input_is_ITEM00001() {
        Product basketball = new Product("ITEM000001","篮球","个","体育","运动器械",98.00);
        assertThat(productService.getProductByBarCode("ITEM000001"), is(basketball));
    }

    @Test
    public void should_return_null_when_input_is_ITEM00002() {
        assertNull(productService.getProductByBarCode("ITEM000002"));
    }
}