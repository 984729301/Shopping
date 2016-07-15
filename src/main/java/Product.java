/**
 * Created by rdzhao on 7/15/16.
 */
public class Product {
    String barCode;
    String name;
    String unit;
    String category;
    String subCategory;
    double price;

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public String getCategory() {
        return category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public double getPrice() {
        return price;
    }

    public Product(String barCode, String name, String unit, String category, String subCategory, double price) {
        this.barCode = barCode;
        this.name = name;
        this.unit = unit;
        this.category = category;
        this.subCategory = subCategory;
        this.price = price;
    }

    public String getBarCode() {
        return barCode;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) || this.barCode.equals(((Product)obj).barCode);
    }
}
