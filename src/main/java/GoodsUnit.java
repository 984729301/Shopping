/**
 * Created by rdzhao on 7/16/16.
 */
public class GoodsUnit {

    public int GetAmount(String barcodeAndNum) {
        String[] result = splitBarcodeAndNum(barcodeAndNum);
        return (result.length > 1) ? Integer.valueOf(result[1]) : 1;
    }

    private String[] splitBarcodeAndNum(String barcodeAndNum) {
        return barcodeAndNum.split("-");
    }

    public String getBarcode(String barcodeAndNum) {
        return splitBarcodeAndNum(barcodeAndNum)[0];
    }
}
