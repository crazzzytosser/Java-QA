package HW1;

import java.util.List;

public class HotWaterVendMach implements VendingMachine {

    private final List<Product> productList;
    private int money;

    public HotWaterVendMach(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }

    public HotWater getProduct(String name, int volume, int temp) {
        for (Product product : productList) {
            if (product instanceof HotWater) {
                if (product.getName().equals(name) && ((HotWater) product).getVolume() == volume && ((HotWater) product).getTemp() == temp) {

                    return (HotWater) product;
                }
            }
        }
        return null;
    }
}