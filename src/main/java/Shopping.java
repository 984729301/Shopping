/**
 * Created by rdzhao on 7/14/16.
 */
public class Shopping {
    ProductService productService;

    public Shopping() {
        this.productService = new ProductService();
    }

    public int getNumberOfProduct(String buyingInfo) {
        return isAmountBiggerThanOne(buyingInfo) ? Integer.valueOf(getBuyingDetail(buyingInfo)[1]) : 1;
    }

    private String[] getBuyingDetail(String buyingInfo) {
        return buyingInfo.split("-");
    }

    private boolean isAmountBiggerThanOne(String buyingInfo) {
        return buyingInfo.indexOf('-') > 0;
    }

    public String getBarcodeOfProduct(String buyingInfo) {
        return isAmountBiggerThanOne(buyingInfo) ? getBuyingDetail(buyingInfo)[0] : buyingInfo;
    }

    public double getMoneyOfProduct(String buyingInfo) {
        Product product = productService.getProductByBarCode(getBarcodeOfProduct(buyingInfo));
        return getNumberOfProduct(buyingInfo) * product.getPrice();
    }

    public void print() {
        String[] buyingInfo = {"ITEM000001", "ITEM000001-3"};
        printHeader();
        printAllProducts(buyingInfo);
        printFooter(buyingInfo);

    }

    private void printAllProducts(String[] buyingInfo) {
        for (String info : buyingInfo) {
            printProductBuyingInfo(info);
        }
    }

    private void printFooter(String[] buyingInfo) {
        double totalMoney = 0;
        for (String info : buyingInfo) {
            totalMoney += getMoneyOfProduct(info);
        }
        System.out.println("总计:" + totalMoney + "(元)");
    }

    private void printProductBuyingInfo(String info) {
        Product product = productService.getProductByBarCode(getBarcodeOfProduct(info));
        System.out.println("名称:" + product.getName() + ",数量:" + getNumberOfProduct(info) + product.getUnit() + ",单价:" + product.getPrice() + "(元)" + ",小计:" + getMoneyOfProduct(info) + "(元)");
    }

    private void printHeader() {
        System.out.println("***<没钱赚商店>购物清单***");
    }

}
