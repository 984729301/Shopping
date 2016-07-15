import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by rdzhao on 7/15/16.
 */
public class ProductService {

    private static ArrayList<Product> productList;

    public ProductService() {
        initProducts();
    }

    public static void initProducts() {
        Product coca = new Product("ITEM000000", "可口可乐", "瓶", "食品", "碳酸饮料", 3.00);
        Product basketball = new Product("ITEM000001", "篮球", "个", "体育", "运动器械", 98.00);
        productList = new ArrayList<>();
        productList.add(coca);
        productList.add(basketball);
    }

    public Product getProductByBarCode(String barCode) {
        for (Iterator iterator = productList.iterator(); iterator.hasNext(); ) {
            Product product = (Product) iterator.next();
            if (product.getBarCode().equals(barCode))
                return product;
        }
        return null;
    }
}
